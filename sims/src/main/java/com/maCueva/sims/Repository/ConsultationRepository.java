package com.ramirezremed.RemeD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramirezremed.RemeD.Entity.ConsultationEntity;

@Repository
public interface ConsultationRepository extends JpaRepository <ConsultationEntity, Integer>{

}
