package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/devise")
public class DeviseController {

	@ApiOperation(value="Devise details can get from device controller ")
	@RequestMapping(method = RequestMethod.GET, value = "/getDeviceDetails")
	public String getDeviceDtls(@RequestHeader(value="Authorization") String authorization) {
		// requestBodyValiadator.userAuthorization(accessKey);
		return "Details will add shortly";
	}
	
	
}
