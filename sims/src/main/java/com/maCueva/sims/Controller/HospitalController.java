package com.maCueva.sims.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maCueva.sims.Entity.HospitalEntity;
import com.maCueva.sims.Service.DoctorService;
import com.maCueva.sims.Service.HospitalService;

@RestController
@RequestMapping("/hospital")


public class HospitalController {
	 @Autowired
	HospitalService hserv;

	
	@GetMapping("/displayHospitals")
	 public List<HospitalEntity> displayAll(){
	        return hserv.displayAll();
	    }
	@PostMapping("/register")
	public HospitalEntity registerHospital(@RequestBody HospitalEntity hospital) {
		return hserv.registerHospital(hospital);
	}
	@GetMapping("/addDoctor")
	public HospitalEntity addDoctor(@RequestParam int hospitalID,@RequestParam int doctorID) throws Exception {
		return hserv.addDoctor(hospitalID, doctorID);		
	}
}
