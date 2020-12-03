package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class NotificationController {
	
	@ApiOperation(value="User can send Message")
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/sendMessage")
	public String sendMessage() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="User can send Notification for events")
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/sendNotification")
	public String sendNotification() {
		return "Details will add shortly";
	}
}
