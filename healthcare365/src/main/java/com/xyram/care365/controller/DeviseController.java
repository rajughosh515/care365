package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/device")
public class DeviseController {

	@ApiOperation(value="Devise details can get from device controller ")
	@RequestMapping(method = RequestMethod.GET, value = "/getDeviceDetails")
	public String getDeviseDtls(@RequestHeader(value="Authorization") String authorization) {
		// requestBodyValiadator.userAuthorization(accessKey);
		return "Devise Details will add shortly";
	}
	
	@ApiOperation(value="Blood Pressure details can get from device controller ")
	@RequestMapping(method = RequestMethod.GET, value = "/getBloodPressure")
	public String getBP(@RequestHeader(value="Authorization") String authorization) {
		// requestBodyValiadator.userAuthorization(accessKey);
		return "BloodPressure Details will add shortly";
	}
	
	@ApiOperation(value="Weight details can get from device controller ")
	@RequestMapping(method = RequestMethod.GET, value = "/getWeight")
	public String getWeight(@RequestHeader(value="Authorization") String authorization) {
		// requestBodyValiadator.userAuthorization(accessKey);
		return "Weight Details will add shortly";
	}
	
}