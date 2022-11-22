package com.maCueva.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maCueva.sims.Entity.ResultEntity;
import com.maCueva.sims.Repository.ResultRepository;

@Service
public class ResultService {

	@Autowired
	ResultRepository rsltrepo;
	
	// C - add or insert a result
		public ResultEntity insertResult(ResultEntity result) {
			return rsltrepo.save(result);
		}

		// R - Read all results from tbl_result
		public List<ResultEntity> getAllResult() {
			return rsltrepo.findAll();
		}

		// R - Read or search result by Status
		public ResultEntity findByResultstatus(String resultstatus) {
			if (rsltrepo.findByResultstatus(resultstatus) != null)
				return rsltrepo.findByResultstatus(resultstatus);
				else
				return null;
		}

		// U - update result
		public ResultEntity putResult(int resultid, ResultEntity newResultDetails) throws Exception {
			ResultEntity result = new ResultEntity();

			try {
				result = rsltrepo.findById(resultid).get();

				result.setResultdate(newResultDetails.getResultdate());
				result.setResultstatus(newResultDetails.getResultstatus());

				return rsltrepo.save(result);

			} catch (NoSuchElementException nex) {

				throw new Exception("Result ID Number " + resultid + " does not exist");
			}
		}

		// D - delete a result
		public String deleteresult(int resultid) {
			String msg;
			if (rsltrepo.findById(resultid) != null) {
				rsltrepo.deleteById(resultid);
				msg = "Result ID Number " + resultid + " is successfully deleted!";
			} else
				msg = "Result ID Number " + resultid + " is NOT found!";
			return msg;

		}
}
