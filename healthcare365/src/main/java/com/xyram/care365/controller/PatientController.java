package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController 
@RequestMapping("/api/v1/patient")
public class PatientController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String dcPatient(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Patient profile details")
	@RequestMapping(method = RequestMethod.GET, value = "/getUserProfile")
	public String getUserProfile(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Patient Blood pressure details")
	@RequestMapping(method = RequestMethod.GET, value = "/getBloodPressure")
	public String getBloodPressure(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Patient weight details")
	@RequestMapping(method = RequestMethod.GET, value = "/getWeight")
	public String getWeight(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
}
