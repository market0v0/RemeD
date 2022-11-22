package com.maCueva.sims.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maCueva.sims.Entity.ConsultationEntity;
import com.maCueva.sims.Service.ConsultationService;


@RestController
@RequestMapping("/consultation")
public class ConsultationController {
	

	@Autowired
	ConsultationService cserve; 
	
	@PostMapping("/postConsultation")
	public ConsultationEntity createConsultation(@RequestBody ConsultationEntity consultation) {
		return cserve.createConsultation(consultation);
	}
	
	@GetMapping("/getAllConsultation")
	public List <ConsultationEntity> getAllConsultations(){
		return cserve.getConsultation();
	}

	@PutMapping("/putConsultation")
	public ConsultationEntity putConsultation(@RequestParam int consultationid, @RequestBody ConsultationEntity newConsultationDetails) throws Exception{
		return cserve.putConsultation(consultationid, newConsultationDetails);
	}
	
	@DeleteMapping("/deleteConsultation/{consultationid}")
	public String deleteConsultation(@PathVariable int consultationid) {
		return cserve.deleteConsultation(consultationid);
	}
	

}
