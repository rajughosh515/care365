package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class PatientController {

	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/patient/")
	public String dcPatient() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Patient profile details")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/patient/getUserProfile")
	public String getUserProfile() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Patient Blood pressure details")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/patient/getBloodPressure")
	public String getBloodPressure() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Patient weight details")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/patient/getWeight")
	public String getWeight() {
		return "Details will add shortly";
	}
	
}
