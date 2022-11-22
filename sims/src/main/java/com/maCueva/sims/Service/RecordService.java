package com.maCueva.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maCueva.sims.Entity.RecordEntity;
import com.maCueva.sims.Repository.RecordRepository;

@Service
public class RecordService {

	@Autowired
	RecordRepository rrepo;
	
	// C - Add or insert a record
		public RecordEntity insertRecord(RecordEntity record) {
			return rrepo.save(record);
		}

		// R - Read all records from tbl_record
		public List<RecordEntity> getAllRecord() {
			return rrepo.findAll();
		}

		// R - Read or search record by record
		public RecordEntity findByRecord(String record) {
			if (rrepo.findByRecord(record) != null)
				return rrepo.findByRecord(record);
			else
				return null;
		}

		// U - update record
		public RecordEntity putRecord(int recordid, RecordEntity newRecordDetails) throws Exception {
			RecordEntity record = new RecordEntity();

			try {
				record = rrepo.findById(recordid).get();

				record.setRecord(newRecordDetails.getRecord());
				

				return rrepo.save(record);

			} catch (NoSuchElementException nex) {

				throw new Exception("Schedule ID Number " + recordid + " does not exist");
			}
		}

		// D - delete a record
		public String deleterecord(int recordid) {
			String msg;
			if (rrepo.findById(recordid) != null) {
				rrepo.deleteById(recordid);
				msg = "Record ID Number " + recordid + " is successfully deleted!";
			} else
				msg = "Record ID Number " + recordid + " is NOT found!";
			return msg;

		}

}
