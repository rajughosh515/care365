package com.xyram.care365.model;

public class PasswordChg {
	private String loginId;
	private String oldPwd;
	private String newPwd;
	private String reNewPwd;
	private String code;
	private String message;
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getOldPwd() {
		return oldPwd;
	}
	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	public String getReNewPwd() {
		return reNewPwd;
	}
	public void setReNewPwd(String reNewPwd) {
		this.reNewPwd = reNewPwd;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
