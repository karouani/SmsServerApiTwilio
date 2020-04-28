package com.karouani.sms.models;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author yassinekarouani
 *
 */
public class MyMessage {
	
	@NotBlank
	private String number;
	
	@NotBlank
	private String message;
	
	public MyMessage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param number
	 * @param message
	 */
	public MyMessage(@JsonProperty("number") String number, @JsonProperty("message") String message) {
		super();
		this.number = number;
		this.message = message;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MyMessage [number=" + number + ", message=" + message + "]";
	}

	
}
