package com.maCueva.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maCueva.sims.Entity.LaboratoryTestEntity;

@Repository
public interface LaboratoryTestRepository extends JpaRepository <LaboratoryTestEntity, Integer>{

}
