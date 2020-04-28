/**
 * 
 */
package com.karouani.sms.business;

import com.karouani.sms.models.MyMessage;

/**
 * @author yassinekarouani
 *
 */
public interface SmsSender {
	public void sendSms(MyMessage sms);
}
