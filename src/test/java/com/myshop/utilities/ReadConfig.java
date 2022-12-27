package com.myshop.utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfig {

	// properties class object creation to read properties file.
	Properties properties;
	
	String path = "F:\\SB_Automation_Framework\\MyShopV1\\Configuration\\config.properties";
	
	//creation of constructor
	public ReadConfig()
	{
		try {
		properties = new Properties(); 
		
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getBaseUrl()
	{
		String value = 
		properties.getProperty("baseUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file");
	}
	
	public String getBrowser()
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser not specified in config file");
	}
	
}
