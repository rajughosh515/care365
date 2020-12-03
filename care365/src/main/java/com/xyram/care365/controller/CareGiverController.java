package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class CareGiverController {
	
	@ApiOperation(value="Care giver details  ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/caregiver/")
	public String caregiverHello() {
		return "Details will add shortly";
	}

	@ApiOperation(value="Care giver profile details")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/caregiver/getUserProfile")
	public String getUserProfile() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Care giver's patients counts in number ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/caregiver/getPatientsCount")
	public String getPatientsCount() {
		return "Details will add shortly";
	}	
	
	/*@ApiOperation(value="Care giver's patients profile details ")
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/caregiver/getPatients")
	public String getPatients() {
		return "Details will add shortly";
	}*/
	
	@ApiOperation(value="Care giver's patients profile details by patientId ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/caregiver/getPatientDetails")
	public String getPatientDetails() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Care giver's newly registered patients profile details ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/caregiver/newRegisterCount")
	public String newRegisterCount() {
		return "Details will add shortly";
	}
	
}
