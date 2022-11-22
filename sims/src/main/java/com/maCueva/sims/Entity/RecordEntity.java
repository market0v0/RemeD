package com.maCueva.sims.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_record")
public class RecordEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recordid;
	
	private String record;
	
	public RecordEntity () {}
	public RecordEntity(int recordid, String record) {
		super();
		this.recordid = recordid;
		this.record = record;
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

}
