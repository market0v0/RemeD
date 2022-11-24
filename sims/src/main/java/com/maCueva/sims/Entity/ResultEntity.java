package com.maCueva.sims.Entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_result")
public class ResultEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resultid;

	private String resultdate;
	private String resultstatus;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private LaboratoryTestEntity labtest;
	
	
	@ManyToOne
	@JoinColumn(name="recordid")
	RecordEntity record;
	
	
	public ResultEntity () {}
	
	public ResultEntity(int resultid, String resultdate, String resultstatus, LaboratoryTestEntity labtest,
			RecordEntity record) {
		super();
		this.resultid = resultid;
		this.resultdate = resultdate;
		this.resultstatus = resultstatus;
		this.labtest = labtest;
		this.record = record;
	}




	@Override
	public String toString() {
		return "ResultEntity [resultid=" + resultid + ", resultdate=" + resultdate + ", resultstatus=" + resultstatus
				+ "]";
	}
	
	public int getResultid() {
		return resultid;
	}
	
	public void setResultid(int resultid) {
		this.resultid = resultid;
	}
	
	public String getResultdate() {
		return resultdate;
	}
	
	public void setResultdate(String resultdate) {
		this.resultdate = resultdate;
	}
	
	public String getResultstatus() {
		return resultstatus;
	}
	
	public void setResultstatus(String resultstatus) {
		this.resultstatus = resultstatus;
	}

	public LaboratoryTestEntity getLabtest() {
		return labtest;
	}

	public void setLabtest(LaboratoryTestEntity labtest) {
		this.labtest = labtest;
	}

	public RecordEntity getRecord() {
		return record;
	}

	public void setRecord(RecordEntity record) {
		this.record = record;
	}
	
	
	
}
