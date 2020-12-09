package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String testHello(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Doctor profile details")
	@RequestMapping(method = RequestMethod.GET, value = "/getUserProfile")
	public String getUserProfile(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Care Giver details under doctor")
	@RequestMapping(method = RequestMethod.POST, value = "/careGiver")
	public String careGvr(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value=" patient's details ")
	@RequestMapping(method = RequestMethod.GET, value = "/getPatientDtls")
	public String getPatientDtls(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	/*@ApiOperation(value="Emergency patient's details with high alert ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/doctor/getHighAlertCount")
	public String getHighAlertCount() {
		return "Details will add shortly";
	}*/

}
