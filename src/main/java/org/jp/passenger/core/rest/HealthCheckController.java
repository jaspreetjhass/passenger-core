package org.jp.passenger.core.rest;

import org.jp.passenger.core.utility.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("passengerCore")
public class HealthCheckController {

	@GetMapping("healthStatus")
	public String appStatus() {
		return Status.OK.getValue();
	}
}
