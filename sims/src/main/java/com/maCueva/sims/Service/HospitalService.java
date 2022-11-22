package com.maCueva.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maCueva.sims.Entity.DoctorEntity;
import com.maCueva.sims.Entity.HospitalEntity;
import com.maCueva.sims.Repository.DoctorRepository;
import com.maCueva.sims.Repository.HospitalRepository;

@Service
public class HospitalService {
	 @Autowired
	  HospitalRepository hrepo;
	 	DoctorRepository drepo;
	 
	 
	 public List<HospitalEntity> displayAll(){
	        return hrepo.findAll();
	    }
	
	 public HospitalEntity registerHospital(HospitalEntity hospital) {
		 return hrepo.save(hospital);
	 }
	 //AddDoctor
	@SuppressWarnings("deprecation")
	public HospitalEntity addDoctor(int hospitalID, int doctorID) throws Exception {
			DoctorEntity newdoctor = new DoctorEntity(); //creating an instance of student
	        HospitalEntity hospital = new HospitalEntity();
	        Set<DoctorEntity> doctors;        
	    try {
	    	//get the new doctor
        	newdoctor = drepo.getById(doctorID);	
	            if(newdoctor != null) {
	            	//get hospital
	            	hospital = hrepo.findById(hospitalID).get();
	            	//gets the set of doctors
	            	doctors = hospital.getDoctors();
	            	//adds the new doctor
	            	doctors.add(newdoctor);
	            	// set the new Set of doctors
		            hospital.setDoctors(doctors);
		            return hrepo.save(hospital);
	            }
	            else {
		            return null;	
	            }       
	    }catch(NoSuchElementException nex) {
            //throws an error if the id does not exist
            throw new Exception("no record");
        }      
			
	}
}
