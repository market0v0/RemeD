package com.ramirezremed.RemeD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramirezremed.RemeD.Entity.LaboratoryTestEntity;

@Repository
public interface LaboratoryTestRepository extends JpaRepository <LaboratoryTestEntity, Integer>{

}
