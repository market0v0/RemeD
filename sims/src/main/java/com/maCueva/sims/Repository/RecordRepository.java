package com.maCueva.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maCueva.sims.Entity.RecordEntity;

@Repository
public interface RecordRepository extends JpaRepository<RecordEntity, Integer> {
	
	RecordEntity findByRecord(String record);

}
