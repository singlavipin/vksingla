package com.vksingla.webservice.soap.test;

import javax.jws.WebService;

@WebService
public class HelloSoap {
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
