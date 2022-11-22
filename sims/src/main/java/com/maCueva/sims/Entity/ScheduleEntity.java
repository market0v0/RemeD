package com.maCueva.sims.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_schedule")
public class ScheduleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scheduleid;

	private String scheduledate;
	private String scheduletime;
	private String schedulestatus;
	
	public ScheduleEntity () {};
	public ScheduleEntity(int scheduleid, String scheduledate, String scheduletime, String schedulestatus) {
		super();
		this.scheduleid = scheduleid;
		this.scheduledate = scheduledate;
		this.scheduletime = scheduletime;
		this.schedulestatus = schedulestatus;
	}
	@Override
	public String toString() {
		return "ScheduleEntity [scheduleid=" + scheduleid + ", scheduledate=" + scheduledate + ", scheduletime="
				+ scheduletime + ", schedulestatus=" + schedulestatus + "]";
	}
	public int getScheduleid() {
		return scheduleid;
	}
	public void setScheduleid(int scheduleid) {
		this.scheduleid = scheduleid;
	}
	public String getScheduledate() {
		return scheduledate;
	}
	public void setScheduledate(String scheduledate) {
		this.scheduledate = scheduledate;
	}
	public String getScheduletime() {
		return scheduletime;
	}
	public void setScheduletime(String scheduletime) {
		this.scheduletime = scheduletime;
	}
	public String getSchedulestatus() {
		return schedulestatus;
	}
	public void setSchedulestatus(String schedulestatus) {
		this.schedulestatus = schedulestatus;
	}
	
	
	
}
