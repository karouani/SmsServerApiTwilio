package com.karouani.sms;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karouani.sms.business.MyService;
import com.karouani.sms.models.MyMessage;

/**
 * @author yassinekarouani
 *
 */

@RestController
@RequestMapping("api/v1/sms")
public class Controller {

	private final MyService service;

    @Autowired
    public Controller(MyService service) {
        this.service = service;
    }

    @PostMapping
    public void sendSms(@Valid @RequestBody MyMessage smsRequest) {
        service.sendSms(smsRequest);
    }
}
