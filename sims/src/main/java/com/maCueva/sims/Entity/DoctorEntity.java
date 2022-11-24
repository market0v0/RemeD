package com.maCueva.sims.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_doctor")
public class DoctorEntity {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int doctorId;
	 	private String specialty;
	 	
	 	
	 	@OneToOne(cascade = CascadeType.MERGE)
	 	private UserEntity user;
	 	
	 	@OneToMany
	    private Set <ConsultationEntity> consultation;
	 	
	 	
	 	@OneToMany
	    private Set <RecordEntity> record;
	 	
		public DoctorEntity() {
			super();
		}

		public DoctorEntity(int doctorId, String specialty, UserEntity user, Set<ConsultationEntity> consultation,
				Set<RecordEntity> record) {
			super();
			this.doctorId = doctorId;
			this.specialty = specialty;
			this.user = user;
			this.consultation = consultation;
			this.record = record;
		}

		public int getDoctorId() {
			return doctorId;
		}
		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}
		public String getSpecialty() {
			return specialty;
		}
		public void setSpecialty(String specialty) {
			this.specialty = specialty;
		}
		public UserEntity getUser() {
			return user;
		}
		public void setUser(UserEntity user) {
			this.user = user;
		}


		public Set<ConsultationEntity> getConsultation() {
			return consultation;
		}


		public void setConsultation(Set<ConsultationEntity> consultation) {
			this.consultation = consultation;
		}

		public Set<RecordEntity> getRecord() {
			return record;
		}

		public void setRecord(Set<RecordEntity> record) {
			this.record = record;
		}
	 	
		
		
}
	
	 	
	 	
	 	

