package com.maCueva.sims.Entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_record")
public class RecordEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recordid;
	
	private String record;
	

	@ManyToOne
	@JoinColumn(name="patientId")
	PatientEntity patient;
	
	@OneToMany
    private Set <ResultEntity> result;

	
	public RecordEntity () {}

	

	public RecordEntity(int recordid, String record, PatientEntity patient, Set<ResultEntity> result) {
		super();
		this.recordid = recordid;
		this.record = record;
		this.patient = patient;
		this.result = result;
	}

	@Override
	public String toString() {
		return "RecordEntity [recordid=" + recordid + ", record=" + record + "]";
	}
	public int getRecordid() {
		return recordid;
	}
	//public void setRecordid(int recordid) {
	//	this.recordid = recordid;
	//}
	
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}



	public PatientEntity getPatient() {
		return patient;
	}



	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}



	public Set<ResultEntity> getResult() {
		return result;
	}



	public void setResult(Set<ResultEntity> result) {
		this.result = result;
	}
	
	

	
}
