package com.karouani.sms.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author yassinekarouani
 *
 */

@Configuration
@ConfigurationProperties("smsserver")
public class MyConfiguration {

	private String usernameSid;
	private String passwordToken;
	private String numberFrom;
	
	public MyConfiguration() {
		// TODO Auto-generated constructor stub
	}

	public String getUsernameSid() {
		return usernameSid;
	}

	public void setUsernameSid(String usernameSid) {
		this.usernameSid = usernameSid;
	}

	public String getPasswordToken() {
		return passwordToken;
	}

	public void setPasswordToken(String passwordToken) {
		this.passwordToken = passwordToken;
	}

	public String getNumberFrom() {
		return numberFrom;
	}

	public void setNumberFrom(String numberFrom) {
		this.numberFrom = numberFrom;
	}

	
}
