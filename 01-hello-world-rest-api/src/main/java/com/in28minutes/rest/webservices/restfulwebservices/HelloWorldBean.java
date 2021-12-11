package com.in28minutes.rest.webservices.restfulwebservices;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name="Message")
//@XmlAccessorType(XmlAccessType.FIELD)
public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		this.message = message;
	}
	
	//@XmlElement
	public String getMessage() {
		return message;
	}

	public HelloWorldBean() {
		super();
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}

}
