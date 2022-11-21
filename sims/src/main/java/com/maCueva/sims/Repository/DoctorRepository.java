package com.maCueva.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.maCueva.sims.Entity.DoctorEntity;

@Repository
public interface DoctorRepository extends JpaRepository <DoctorEntity, Integer> {

	DoctorEntity findByDoctorId(int id);
	DoctorEntity findBySpecialty(String Specialty);
	
	
	
}
