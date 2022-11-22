package com.maCueva.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maCueva.sims.Entity.ResultEntity;

@Repository
public interface ResultRepository extends JpaRepository<ResultEntity, Integer>{
	
	ResultEntity findByResultstatus(String resultstatus);

}
