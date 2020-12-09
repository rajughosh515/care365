package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xyram.care365.model.PasswordChg;
import com.xyram.care365.model.User;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
	
	@ApiOperation(value="valid token details")
	@RequestMapping(method = RequestMethod.GET, value = "/validate-token")
	public String validateToken(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="user login details")
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public User login(@RequestBody User user,@RequestHeader(value="Authorization") String authorization) {		
		String loginId=user.getLoginId();
		System.out.println("login :: "+loginId);
		String password =user.getPassword();
		System.out.println("password :: "+password);
		User user1=new User();
		if(loginId.equalsIgnoreCase("raju") && password.equalsIgnoreCase("ghosh")) {			
			user1.setMessage("Success");
			user1.setRoleId(111);			
			return user1;
		}		
		user1.setMessage("failure");
		return user1;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/logout")
	public User logOut(@RequestBody User user,@RequestHeader(value="Authorization") String authorization) {		
		String loginId=user.getLoginId();
		System.out.println("login :: "+loginId);
		String password =user.getPassword();
		System.out.println("password :: "+password);
		User user1=new User();
		if(loginId.equalsIgnoreCase("raju") && password.equalsIgnoreCase("ghosh")) {			
			user1.setMessage("Success");
			user1.setRoleId(111);			
			return user1;
		}		
		user1.setMessage("failure");
		return user1;
	}
	
	@ApiOperation(value="user password reset details")
	@RequestMapping(method = RequestMethod.POST, value = "/resetPassword")
	public PasswordChg resetPassword(@RequestBody PasswordChg pChg,@RequestHeader(value="Authorization") String authorization) {
		
		String loginID=pChg.getLoginId();
		String oldPwd=pChg.getOldPwd();
		String newPwd=pChg.getNewPwd();
		String reNewPwd=pChg.getReNewPwd();
		PasswordChg paschg = new PasswordChg();			
		paschg.setOldPwd("ghosh");		
		if(loginID.equalsIgnoreCase("Raju") && oldPwd.equalsIgnoreCase(paschg.getOldPwd()) &&newPwd.equalsIgnoreCase(reNewPwd)) {
			paschg.setNewPwd(newPwd);			
			paschg.setMessage("Password changed successfully");
			return paschg;
		}		
		paschg.setMessage("Please Enter valid details");
		return paschg;
	}
	
	
	

}
