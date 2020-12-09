package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1")
public class NotificationController {
	
	@ApiOperation(value="User can send Message")
	@RequestMapping(method = RequestMethod.POST, value = "/sendMessage")
	public String sendMessage(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="User can send Notification for events")
	@RequestMapping(method = RequestMethod.POST, value = "/sendNotification")
	public String sendNotification(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
}
