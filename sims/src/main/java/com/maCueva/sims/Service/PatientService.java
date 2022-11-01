package com.maCueva.sims.Service;
import java.util.List;
import com.maCueva.sims.Entity.PatientEntity;
import com.maCueva.sims.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PatientService {
    @Autowired
    PatientRepository prepo;

    //create
    public PatientEntity register(PatientEntity patient){
       return prepo.save(patient);
    }

    //display
    public List<PatientEntity>displayAll(){
        return prepo.findAll();
    }
}
