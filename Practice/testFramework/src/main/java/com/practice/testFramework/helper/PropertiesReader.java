package com.practice.testFramework.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class PropertiesReader implements IGetProperties{

	private static FileInputStream file;
	public static Properties pr;
	
	public PropertiesReader() {
		String filepath = System.getProperty("user.dir")+"/src/test/resources/config/local.properties";
		try {
			file = new FileInputStream(new File(filepath));
			pr = new Properties();
			pr.load(file);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getURL() {
		return (pr.getProperty("url"));
	}

	public String getUsername() {
		return pr.getProperty("username");
	}

	public String getPassword() {
		return pr.getProperty("password");
	}
}
