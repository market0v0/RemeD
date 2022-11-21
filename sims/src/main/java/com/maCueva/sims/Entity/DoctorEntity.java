package com.maCueva.sims.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
		public DoctorEntity() {
			super();
		}
		public DoctorEntity(int doctorId, String specialty, UserEntity user) {
			super();
			this.doctorId = doctorId;
			this.specialty = specialty;
			this.user = user;
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
	 	
		
}
	
	 	
	 	
	 	

