package com.maCueva.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.maCueva.sims.Entity.ConsultationEntity;

@Repository
public interface ConsultationRepository extends JpaRepository <ConsultationEntity, Integer>{

}
