
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
	
	
	@OneToMany(cascade= CascadeType.MERGE)
	private Set <ScheduleEntity> schedule;
	
	
	public ConsultationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultationEntity(int consultationId, String consultationPurpose, String consultationResult, Set<ScheduleEntity> schedule) {
		super();
		this.consultationid = consultationId;
		this.consultationpurpose = consultationPurpose;
		this.consultationresult = consultationResult;
		this.schedule = schedule;
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
	
	
	public Set<ScheduleEntity> getSchedule() {
		return schedule;
	}


	public void setSchedule(Set<ScheduleEntity> schedule) {
		this.schedule = schedule;
	}

	
	
	
	
	
	

}
