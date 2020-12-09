package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/dialysisCenter")
public class DialysisCenterController {
	
	@ApiOperation(value="Dialysis Center  ")
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String dialysisCenter(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Dialysis Centers  profile details  ")
	@RequestMapping(method = RequestMethod.GET, value = "/getDCUserProfile")
	public String getUserProfile(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	

	@ApiOperation(value="Dialysis Centers  profile details  ")
	@RequestMapping(method = RequestMethod.GET, value = "/getDoctorDetails")
	public String getDoctorDetails(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Dialysis Centers  profile details  ")
	@RequestMapping(method = RequestMethod.GET, value = "/getCareGiverDetails")
	public String getCareGiverDetails(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}

	
}
