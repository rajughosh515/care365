package com.xyram.care365.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.xyram.care365.model.PasswordChg;
import com.xyram.care365.model.User;

import io.swagger.annotations.ApiOperation;

@RestController
public class AdminController {
	
	@ApiOperation(value="Patients details from Admin profile ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/admin/getPatients")
	public String getPatients() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Doctors details from Admin profile   ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/admin/getDoctors")
	public String getDoctors() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="DialysisCenter's details from Admin profile   ")
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/admin/getDialysisCenters")
	public String getDialysisCenters() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Patients details from Admin profile ")
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/admin/addPatients")
	public String addPatients() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Doctors details from Admin profile   ")
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/admin/addDoctors")
	public String addDoctors() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="DialysisCenter's details from Admin profile   ")
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/admin/addDialysisCenters")
	public String addDialysisCenters() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Patients details from Admin profile ")
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/admin/updatePatients")
	public String updatePatients() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Doctors details from Admin profile   ")
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/admin/updateDoctors")
	public String updateDoctors() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="DialysisCenter's details from Admin profile   ")
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/admin/updateDialysisCenters")
	public String updateDialysisCenters() {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="DialysisCenter's details from Admin profile test  ")
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/admin/test")
	public String test() {
		return "Details will add shortly";
	}
	
	/*@RequestMapping(method = RequestMethod.GET, value = "/api/v1/auth/validate-token")
	public String validateToken() {
		return "Details will add shortly";
	}
	
/*	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/auth/login")
	public User login(@RequestBody User user) {
		
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
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/auth/logout")
	public User logOut(@RequestBody User user) {
		
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
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/v1/auth/resetPassword")
	public PasswordChg resetPassword(@RequestBody PasswordChg pChg) {
		
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
	}*/
	
	/*@RequestMapping(method = RequestMethod.GET, value = "/api/v1/getUserProfile")
	public String getUserProfile() {
		return "Details will add shortly";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/getPatientsCount")
	public String getPatientsCount() {
		return "Details will add shortly";
	}*/	
		
}