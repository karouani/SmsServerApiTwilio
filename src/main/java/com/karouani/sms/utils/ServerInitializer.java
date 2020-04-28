package com.karouani.sms.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

/**
 * @author yassinekarouani
 *
 */

@Configuration
public class ServerInitializer {
	
	private final MyConfiguration myConfig;
	private final static Logger LOGGER = LoggerFactory.getLogger(ServerInitializer.class);
	
	@Autowired
	public ServerInitializer(MyConfiguration myConfig) {
		super();
		this.myConfig = myConfig;
		Twilio.init(this.myConfig.getUsernameSid(), this.myConfig.getPasswordToken());
		LOGGER.info("---- .... Initialisation MySms Services {}", this.myConfig.getNumberFrom());
	}
	
}
