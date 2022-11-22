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
    
    @OneToMany
    private Set <ConsultationEntity> consultation;
    
    @OneToMany
    private Set <LaboratoryTestEntity> labtest;

    public PatientEntity() {
    }

	public PatientEntity(int patientId, UserEntity user, double weight, String height, Set<ConsultationEntity> consultation, Set<LaboratoryTestEntity> labtest) {
		super();
		this.patientId = patientId;
		User = user;
		this.weight = weight;
		this.height = height;
		this.consultation = consultation;
		this.labtest = labtest;
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
	
	public Set<ConsultationEntity> getConsultation() {
		return consultation;
	}


	public void setConsultation(Set<ConsultationEntity> consultation) {
		this.consultation = consultation;
	}
	
	public Set<LaboratoryTestEntity> getLabtest() {
		return labtest;
	}


	public void setLabtest(Set<LaboratoryTestEntity> labtest) {
		this.labtest = labtest;
	}

}
