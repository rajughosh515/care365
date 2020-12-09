package com.xyram.care365.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
	
	
	@ApiOperation(value="Patients details can get from Admin profile ")
	@RequestMapping(method = RequestMethod.GET, value = "/getPatients")
	public String getPatients(@RequestHeader(value="Authorization") String authorization) {
		// requestBodyValiadator.userAuthorization(accessKey);
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Doctors details can get from Admin profile   ")
	@RequestMapping(method = RequestMethod.GET, value = "/getDoctors")
	public String getDoctors(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="DialysisCenter's details can get from Admin profile   ")
	@RequestMapping(method = RequestMethod.GET, value = "/getDialysisCenters")
	public String getDialysisCenters(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Patients details can add from Admin profile ")
	@RequestMapping(method = RequestMethod.POST, value = "/addPatients")
	public String addPatients(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Doctors details can add from Admin profile   ")
	@RequestMapping(method = RequestMethod.POST, value = "/addDoctors")
	public String addDoctors(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="DialysisCenter's details can add from Admin profile   ")
	@RequestMapping(method = RequestMethod.POST, value = "/addDialysisCenters")
	public String addDialysisCenters(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Patients details can update from Admin profile ")
	@RequestMapping(method = RequestMethod.PUT, value = "/updatePatients")
	public String updatePatients(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Doctors details can update from Admin profile   ")
	@RequestMapping(method = RequestMethod.PUT, value = "/updateDoctors")
	public String updateDoctors(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="DialysisCenter's details can update from Admin profile   ")
	@RequestMapping(method = RequestMethod.PUT, value = "/updateDialysisCenters")
	public String updateDialysisCenters(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="Patients details can delete from Admin profile ")
	@RequestMapping(method = RequestMethod.DELETE, value = "/deletePatients")
	public String deletePatients(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
		
	@ApiOperation(value="Doctors details can delete from Admin profile   ")
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteDoctors")
	public String deleteDoctors(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	@ApiOperation(value="DialysisCenter's details can delete from Admin profile   ")
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteDialysisCenters")
	public String deleteDialysisCenters(@RequestHeader(value="Authorization") String authorization) {
		return "Details will add shortly";
	}
	
	/*
	 * @ApiOperation(value="DialysisCenter's details from Admin profile test  ")
	 * 
	 * @RequestMapping(method = RequestMethod.POST, value = "/api/v1/admin/test")
	 * public String test() { return "Details will add shortly"; }
	 */
	
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