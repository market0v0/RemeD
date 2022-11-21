package com.maCueva.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maCueva.sims.Entity.DoctorEntity;
import com.maCueva.sims.Repository.DoctorRepository;

@Service
public class DoctorService {
	  @Autowired
	  DoctorRepository drepo;
	  
	  public DoctorEntity register(DoctorEntity Doctor){
		
	       return drepo.save(Doctor);
			
			
	    }
	  
	  public String findByDoctorId(int id) {
		  
		  return drepo.findByDoctorId(id)+"";
		  
	  }
	  
	  
	  public List<DoctorEntity> displayAll(){
	        return drepo.findAll();
	    }
	  
	  
		
	 public DoctorEntity updatespecialty(int id, String newspecailty) throws Exception {
	        DoctorEntity doctor = new DoctorEntity(); //creating an instance of student
	        
	        try {
	            //Search the ID number of the student
	            doctor = drepo.findById(id).get();
	            
	            //update the record
	            doctor.setSpecialty(newspecailty);
	            
	            //Save the information and return the value
	            return drepo.save(doctor);
	        }catch(NoSuchElementException nex) {
	            //throws an error if the id does not exist
	            throw new Exception("no record");
	        }
	    }
	  
	  

}
