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

import com.maCueva.sims.Entity.ResultEntity;
import com.maCueva.sims.Service.ResultService;


@RestController
@RequestMapping("/result")
public class ResultController {

		@Autowired
		ResultService rsltserv;

		// print
		@GetMapping("/print")
		public String printResult() {
			return "Result";
		}

		// add or insert a result
		@PostMapping("/postResult")
		public ResultEntity insertResult(@RequestBody ResultEntity result) {
			return rsltserv.insertResult(result);
		}

		// Read all results
		@GetMapping("/getAllResults")
		public List<ResultEntity> getAllResult() {
			return rsltserv.getAllResult();
		}

		// Read a result by status
		@GetMapping("/getByResultstatus")
		public ResultEntity findByResultstatus(@RequestParam String resultstatus) {
			return rsltserv.findByResultstatus(resultstatus);
		}

		// U - update result
		@PutMapping("/putResult")
		public ResultEntity putResult(@RequestParam int resultid, @RequestBody ResultEntity newResultDetails)
				throws Exception {
			return rsltserv.putResult(resultid, newResultDetails);
		}

		// D - delete result
		@DeleteMapping("/deleteResult/{resultid}")
		public String deleteResult(@PathVariable int resultid) {
			return rsltserv.deleteresult(resultid);
		}

}
