package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/caregiver")
public class CareGiverController {
	
	@ApiOperation(value="Care giver details  ")
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String caregiverHello(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}

	@ApiOperation(value="Care giver profile details")
	@RequestMapping(method = RequestMethod.GET, value = "/getUserProfile")
	public String getUserProfile(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Care giver's patients counts in number ")
	@RequestMapping(method = RequestMethod.GET, value = "/getPatientsCount")
	public String getPatientsCount(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}	
	
	/*@ApiOperation(value="Care giver's patients profile details ")
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/caregiver/getPatients")
	public String getPatients() {
		return "Details will add shortly";
	}*/
	
	@ApiOperation(value="Care giver's patients profile details by patientId ")
	@RequestMapping(method = RequestMethod.GET, value = "/getPatientDetails")
	public String getPatientDetails(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Care giver's newly registered patients profile details ")
	@RequestMapping(method = RequestMethod.GET, value = "/newRegisterCount")
	public String newRegisterCount(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
}
