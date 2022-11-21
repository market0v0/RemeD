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

import com.maCueva.sims.Entity.DoctorEntity;
import com.maCueva.sims.Service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorService dserv;

    //create
    @PostMapping("/createDoctor")
    public DoctorEntity register(@RequestBody DoctorEntity Doctor){
    		return dserv.register(Doctor);
    	  }
    
    @PutMapping("/updateSpecialty")
    public DoctorEntity updatespecialty(@RequestParam int id,@RequestParam String newspecailty) throws Exception {
    	return dserv.updatespecialty(id, newspecailty);
    }
    @GetMapping("/displayDoctors")
    public List<DoctorEntity> displayAll(){
        return dserv.displayAll();
    }


}

