package com.DemoWebShop.Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityMethod {
	public String SingleExcelDataReader(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/WebshopLoginCredentials.properties");
		Properties pr=new Properties();
		pr.load(fis);
		pr.getProperty(key);
		return key;
	}
}
