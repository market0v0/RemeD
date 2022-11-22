
package com.maCueva.sims.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_consultation")
public class ConsultationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int consultationid;
	
	private String consultationpurpose;
	private String consultationresult;
	
	
	
	
	public ConsultationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultationEntity(int consultationId, String consultationPurpose, String consultationResult) {
		super();
		this.consultationid = consultationId;
		this.consultationpurpose = consultationPurpose;
		this.consultationresult = consultationResult;
	}




	public int getConsultationId() {
		return consultationid;
	}




	public void setConsultationId(int consultationId) {
		this.consultationid = consultationId;
	}




	public String getConsultationPurpose() {
		return consultationpurpose;
	}




	public void setConsultationPurpose(String consultationPurpose) {
		this.consultationpurpose = consultationPurpose;
	}




	public String getConsultationResult() {
		return consultationresult;
	}




	public void setConsultationResult(String consultationResult) {
		this.consultationresult = consultationResult;
	}
	
	
	
	
	
	

}
