package com.maCueva.sims.Service;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maCueva.sims.Entity.ScheduleEntity;
import com.maCueva.sims.Repository.ScheduleRepository;

@Service
public class ScheduleService {

	@Autowired
	ScheduleRepository srepo;

	// C - Create or insert a schedule
	public ScheduleEntity insertSchedule(ScheduleEntity schedule) {
		return srepo.save(schedule);
	}

	// R - Read all schedule from tbl_schedule
	public List<ScheduleEntity> getAllSchedule() {
		return srepo.findAll();
	}

	// R - Read or search schedule by Status
	public ScheduleEntity findBySchedulestatus(String schedulestatus) {
		if (srepo.findBySchedulestatus(schedulestatus) != null)
			return srepo.findBySchedulestatus(schedulestatus);
			else
			return null;
	}

	// U - update schedule
	public ScheduleEntity putSchedule(int scheduleid, ScheduleEntity newScheduleDetails) throws Exception {
		ScheduleEntity schedule = new ScheduleEntity();

		try {
			schedule = srepo.findById(scheduleid).get();

			schedule.setScheduledate(newScheduleDetails.getScheduledate());
			schedule.setScheduletime(newScheduleDetails.getScheduletime());
			schedule.setSchedulestatus(newScheduleDetails.getSchedulestatus());

			return srepo.save(schedule);

		} catch (NoSuchElementException nex) {

			throw new Exception("Schedule ID Number " + scheduleid + " does not exist");
		}
	}

	// D - delete a schedule
	public String deleteschedule(int scheduleid) {
		String msg;
		if (srepo.findById(scheduleid) != null) {
			srepo.deleteById(scheduleid);
			msg = "Schedule ID Number " + scheduleid + " is successfully deleted!";
		} else
			msg = "Schedule ID Number " + scheduleid + " is NOT found!";
		return msg;

	}

}
