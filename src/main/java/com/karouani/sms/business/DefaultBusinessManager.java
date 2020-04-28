/**
 * 
 */
package com.karouani.sms.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilio.type.PhoneNumber;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;

import com.karouani.sms.models.MyMessage;
import com.karouani.sms.utils.MyConfiguration;

/**
 * @author yassinekarouani
 *
 */
@Service("business")
public class DefaultBusinessManager implements SmsSender{
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultBusinessManager.class);

    private final MyConfiguration myConfiguration;

    @Autowired
    public DefaultBusinessManager(MyConfiguration myConfiguration) {
        this.myConfiguration = myConfiguration;
    }
    
	@Override
	public void sendSms(MyMessage smsRequest) {
		if (isPhoneNumberValid(smsRequest.getNumber())) {
            PhoneNumber to = new PhoneNumber(smsRequest.getNumber());
            PhoneNumber from = new PhoneNumber(myConfiguration.getNumberFrom());
            String message = smsRequest.getMessage();
            MessageCreator creator = Message.creator(to, from, message);
            creator.create();
            LOGGER.info("Send sms {}", smsRequest);
        } else {
            throw new IllegalArgumentException(
                    "Phone number [" + smsRequest.getNumber() + "] is not a valid number"
            );
        }
	}
	
	private boolean isPhoneNumberValid(String phoneNumber) {
        // TODO: Implement phone number validator
        return true;
    }
}
