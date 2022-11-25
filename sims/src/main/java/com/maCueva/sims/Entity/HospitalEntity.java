package com.maCueva.sims.Entity;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;



import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
@Table(name = "tbl_hospital")
public class HospitalEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hospitalId;
 	private String hospitalUsername;
 	private String hospitalPassword;
 	private String hospitalName;
 	private String address;
 	
 	
 	@ManyToMany(mappedBy = "hospital")
 	private Set<DoctorEntity> doctor;
 	
 	
 	
	public HospitalEntity() {
		super();
	}
	
	

	public HospitalEntity(int hospitalId, String hospitalUsername, 
			String hospitalPassword, String hospitalName, String address, 
			Set<DoctorEntity> doctor) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalUsername = hospitalUsername;
		this.hospitalPassword = hospitalPassword;
		this.hospitalName = hospitalName;
		this.address = address;
		this.doctor = doctor;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	

	public String getHospitalUsername() {
		return hospitalUsername;
	}

	public void setHospitalUsername(String hospitalUsername) {
		this.hospitalUsername = hospitalUsername;
	}

	public String getHospitalPassword() {
		return hospitalPassword;
	}

	public void setHospitalPassword(String hospitalPassword) {
		this.hospitalPassword = hospitalPassword;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<DoctorEntity> getDoctor() {
		return doctor;
	}

	public void setDoctors(Set<DoctorEntity> doctor) {
		this.doctor = doctor;
	}

	
}
