package com.maCueva.sims.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maCueva.sims.Entity.RecordEntity;
import com.maCueva.sims.Service.RecordService;


@RestController
@RequestMapping("/record")

public class RecordController {

	@Autowired
	RecordService rserv;

	// print
	@GetMapping("/print")
	public String printRecord() {
		return "Record";
	}

	// Add or insert a record
	@PostMapping("/postRecord")
	public RecordEntity insertRecord(@RequestBody RecordEntity record) {
		return rserv.insertRecord(record);
	}

	// Read all records
	@GetMapping("/getAllRecords")
	public List<RecordEntity> getAllRecord() {
		return rserv.getAllRecord();
	}

	// Read a record 
	@GetMapping("/getbyRecord")
	public RecordEntity findByRecord(@RequestParam String record) {
		return rserv.findByRecord(record);
	}

	// U - update record
	@PutMapping("/putRecord")
	public RecordEntity putRecord(@RequestParam int recordid, @RequestBody RecordEntity newRecordDetails)
			throws Exception {
		return rserv.putRecord(recordid, newRecordDetails);
	}

	// D - delete record
	@DeleteMapping("/deleteRecord/{recordid}")
	public String deleteRecord(@PathVariable int recordid) {
		return rserv.deleterecord(recordid);
	}

}
