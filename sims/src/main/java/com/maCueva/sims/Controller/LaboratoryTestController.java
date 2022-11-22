package com.ramirezremed.RemeD.Controller;

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

import com.ramirezremed.RemeD.Entity.LaboratoryTestEntity;
import com.ramirezremed.RemeD.Service.LaboratoryTestService;


@RestController
@RequestMapping("/laboratorytest")
public class LaboratoryTestController {
	
	
	@Autowired
	LaboratoryTestService ltserve; 
	
	@PostMapping("/postLaboratoryTest")
	public LaboratoryTestEntity createLaboratoryTest(@RequestBody LaboratoryTestEntity labtest) {
		return ltserve.createLaboratoryTest(labtest);
	}
	
	@GetMapping("/getAllLaboratoryTest")
	public List <LaboratoryTestEntity> getAllLaboratoryTest(){
		return ltserve.getAllLaboratoryTest();
	}

	@PutMapping("/putLaboratoryTest")
	public LaboratoryTestEntity putLaboratoryTest(@RequestParam int labtestid, @RequestBody LaboratoryTestEntity newLabTestDetails) throws Exception{
		return ltserve.putLaboratory(labtestid, newLabTestDetails);
	}
	
	@DeleteMapping("/deleteLaboratoryTest/{labtestid}")
	public String deleteLaboratory(@PathVariable int labtestid) {
		return ltserve.deleteLaboratoryTest(labtestid);
	}
	

}
