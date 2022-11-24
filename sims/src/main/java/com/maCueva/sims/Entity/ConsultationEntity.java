
package com.maCueva.sims.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@ManyToOne
	@JoinColumn(name="patientId")
	PatientEntity patient;
	
	@ManyToOne
	@JoinColumn(name="doctorId")
	DoctorEntity doctor;
	
	public ConsultationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	


	public ConsultationEntity(int consultationid, String consultationpurpose, String consultationresult,
			Set<ScheduleEntity> schedule, PatientEntity patient) {
		super();
		this.consultationid = consultationid;
		this.consultationpurpose = consultationpurpose;
		this.consultationresult = consultationresult;
		this.schedule = schedule;
		this.patient = patient;
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





	public PatientEntity getPatient() {
		return patient;
	}





	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	
	
	
	
	
	

}
