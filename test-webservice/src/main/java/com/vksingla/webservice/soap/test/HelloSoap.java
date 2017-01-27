package com.vksingla.webservice.soap.test;

import javax.jws.WebService;

import com.vksingla.stclicker.license.License;
import com.vksingla.stclicker.license.LicenseGenerator;
import com.vksingla.stclicker.license.LicenseType;

@WebService
public class HelloSoap {
	public String sayHello(String name) {
		return "Hello " + name;
	}
	
	public void generateLicense() {
		try {
			LicenseGenerator.generateLicenseFile(new License(LicenseType.ST_CLICKER, "61192848", "*.*.*", 5, "20170101", "20180101"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
