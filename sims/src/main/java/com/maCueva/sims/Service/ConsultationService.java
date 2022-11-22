package com.maCueva.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maCueva.sims.Entity.ConsultationEntity;
import com.maCueva.sims.Repository.ConsultationRepository;

@Service
public class ConsultationService {
	
	@Autowired
	ConsultationRepository crepo;

	
		public ConsultationEntity createConsultation(ConsultationEntity consultation) {
			return crepo.save(consultation);
		}
		
		
		public List <ConsultationEntity> getConsultation(){
			return crepo.findAll();
		}
		
		

		public ConsultationEntity putConsultation(int consultationid, ConsultationEntity newConsultationDetails) throws Exception{
			
			ConsultationEntity consultation = new ConsultationEntity();
			
			try {
				consultation = crepo.findById(consultationid).get(); 

				consultation.setConsultationPurpose(newConsultationDetails.getConsultationPurpose());
				
				return crepo.save(consultation);
			}
			
			catch(NoSuchElementException ex){
				throw new Exception("Consultation ID" + consultationid + "does not exist.");	
			}	
		}
		
		
		public String deleteConsultation(int consultationid) { 
			String msg;
			
			if(crepo.findById(consultationid) !=  null) {	
				crepo.deleteById(consultationid); 		
			
				msg = "Consultation ID Number " + consultationid + "successfully deleted.";
			}
			
			else 
				msg = "Consultation ID Number" + consultationid + " not found";
			
			return msg;
		}


}
