package com.webshop.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;
@Test
public class UtilityMethod {
	public String propertyFileDataReader(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/WebshopLoginCredentials.properties");
		Properties pr=new Properties();
		pr.load(fis);
		String key1 = pr.getProperty(key);
		return key1;
	}
}
