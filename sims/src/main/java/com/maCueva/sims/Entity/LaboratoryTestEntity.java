package com.maCueva.sims.Entity;


import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="tbl_labtest")
public class LaboratoryTestEntity {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int labtestid;
	
	
	private String labtesttype;
	private String labteststatus;
	
	@OneToMany(cascade= CascadeType.MERGE)
	private Set <ScheduleEntity> schedule;
	
	
	@OneToOne(cascade= CascadeType.MERGE)
	private ResultEntity result;
	
	
	public LaboratoryTestEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LaboratoryTestEntity(int labtestid, String labtesttype, String labteststatus, Set<ScheduleEntity> schedule,
			ResultEntity result) {
		super();
		this.labtestid = labtestid;
		this.labtesttype = labtesttype;
		this.labteststatus = labteststatus;
		this.schedule = schedule;
		this.result = result;
	}


	public int getLabtestid() {
		return labtestid;
	}


	/*public void setLabtestid(int labtestid) {
		this.labtestid = labtestid;
	}*/


	public String getLabtesttype() {
		return labtesttype;
	}


	public void setLabtesttype(String labtesttype) {
		this.labtesttype = labtesttype;
	}


	public String getLabteststatus() {
		return labteststatus;
	}


	public void setLabteststatus(String labteststatus) {
		this.labteststatus = labteststatus;
	}


	public Set<ScheduleEntity> getSchedule() {
		return schedule;
	}


	public void setSchedule(Set<ScheduleEntity> schedule) {
		this.schedule = schedule;
	}


	public ResultEntity getResult() {
		return result;
	}


	public void setResult(ResultEntity result) {
		this.result = result;
	}



	
	
	
}
