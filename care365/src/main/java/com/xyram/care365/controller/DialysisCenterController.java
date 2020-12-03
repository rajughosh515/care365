package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class DialysisCenterController {
	
	@ApiOperation(value="Dialysis Center  ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/dialysisCenter/")
	public String dialysisCenter() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Dialysis Centers  profile details  ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/dialysisCenter/getDCUserProfile")
	public String getUserProfile() {
		return "Details will add shortly";
	}
	

	@ApiOperation(value="Dialysis Centers  profile details  ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/dialysisCenter/getDoctorDetails")
	public String getDoctorDetails() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Dialysis Centers  profile details  ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/dialysisCenter/getCareGiverDetails")
	public String getCareGiverDetails() {
		return "Details will add shortly";
	}

	
}
