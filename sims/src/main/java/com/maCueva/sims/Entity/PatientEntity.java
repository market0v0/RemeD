package com.maCueva.sims.Entity;


import javax.persistence.*;

@Entity
@Table(name = "tbl_patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;
    
    @OneToOne(cascade = CascadeType.MERGE)
	private UserEntity User;
    private double weight;
    private String height;

    public PatientEntity() {
    }

	public PatientEntity(int patientId, UserEntity user, double weight, String height) {
		super();
		this.patientId = patientId;
		User = user;
		this.weight = weight;
		this.height = height;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public UserEntity getUser() {
		return User;
	}

	public void setUser(UserEntity user) {
		User = user;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
