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

import com.maCueva.sims.Entity.ScheduleEntity;
import com.maCueva.sims.Service.ScheduleService;

@RestController
@RequestMapping("/schedule")

public class ScheduleController {

	@Autowired
	ScheduleService sserv;

	// print
	@GetMapping("/print")
	public String printSchedule() {
		return "Schedule";
	}

	// add or insert a schedule
	@PostMapping("/postSchedule")
	public ScheduleEntity insertSchedule(@RequestBody ScheduleEntity schedule) {
		return sserv.insertSchedule(schedule);
	}

	// Read all schedule
	@GetMapping("/getAllSchedules")
	public List<ScheduleEntity> getAllSchedule() {
		return sserv.getAllSchedule();
	}

	// Read a schedule by status
	@GetMapping("/getBySchedulestatus")
	public ScheduleEntity findBySchedulestatus(@RequestParam String schedulestatus) {
		return sserv.findBySchedulestatus(schedulestatus);
	}

	// U - update schedule
	@PutMapping("/putSchedule")
	public ScheduleEntity putSchedule(@RequestParam int scheduleid, @RequestBody ScheduleEntity newScheduleDetails)
			throws Exception {
		return sserv.putSchedule(scheduleid, newScheduleDetails);
	}

	// D - delete record
	@DeleteMapping("/deleteSchedule/{scheduleid}")
	public String deleteSchedule(@PathVariable int scheduleid) {
		return sserv.deleteschedule(scheduleid);
	}

}
