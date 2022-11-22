package com.maCueva.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.maCueva.sims.Entity.LaboratoryTestEntity;
import com.maCueva.sims.Repository.LaboratoryTestRepository;


@Service
public class LaboratoryTestService {
	
	@Autowired
	LaboratoryTestRepository ltrepo;

	
		public LaboratoryTestEntity createLaboratoryTest(LaboratoryTestEntity labtest) {
			return ltrepo.save(labtest);
		}
		
		
		public List <LaboratoryTestEntity> getAllLaboratoryTest(){
			return ltrepo.findAll();
		}
		
		

		public LaboratoryTestEntity putLaboratory(int labtestid, LaboratoryTestEntity newLabTestDetails) throws Exception{
			
			LaboratoryTestEntity labtest = new LaboratoryTestEntity();
			
			try {
				labtest = ltrepo.findById(labtestid).get(); 

				labtest.setLabtesttype(newLabTestDetails.getLabtesttype());
				
				return ltrepo.save(labtest);
			}
			
			catch(NoSuchElementException ex){
				throw new Exception("Laboratory Test ID" + labtestid + " does not exist.");	
			}	
		}
		
		
		public String deleteLaboratoryTest(int labtestid) { 
			String msg;
			
			if(ltrepo.findById(labtestid) !=  null) {	
				ltrepo.deleteById(labtestid); 		
			
				msg = "Laboratory Test ID Number " + labtestid + " successfully deleted.";
			}
			
			else 
				msg = "Laboratory Test ID Number" + labtestid + " not found";
			
			return msg;
		}
}
