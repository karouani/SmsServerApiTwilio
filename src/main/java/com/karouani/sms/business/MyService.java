package com.karouani.sms.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.karouani.sms.models.MyMessage;


/**
 * @author yassinekarouani
 *
 */
@Service
public class MyService {
	
	private final SmsSender business;

    @Autowired
    public MyService(@Qualifier("business") DefaultBusinessManager business) {
        this.business = business;
    }

    public void sendSms(MyMessage smsRequest) {
    	business.sendSms(smsRequest);
    }
    

}
