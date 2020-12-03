package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class DoctorController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/doctor/")
	public String testHello() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Doctor profile details")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/doctor/getUserProfile")
	public String getUserProfile() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Care Giver details under doctor")
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/doctor/careGiver")
	public String careGvr() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value=" patient's details ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/doctor/getPatientDtls")
	public String getPatientDtls() {
		return "Details will add shortly";
	}
	
	/*@ApiOperation(value="Emergency patient's details with high alert ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/doctor/getHighAlertCount")
	public String getHighAlertCount() {
		return "Details will add shortly";
	}*/

}
