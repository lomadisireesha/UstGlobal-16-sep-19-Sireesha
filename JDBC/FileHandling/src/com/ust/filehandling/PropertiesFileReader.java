package com.ust.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {
		String path = "test.properties";
		FileReader reader = null;
		
		try {
			reader = new FileReader(path);
			Properties prop = new Properties();
			prop.load(reader);
			
			String Name = prop.getProperty("name");
			String Company = prop.getProperty("company");
			
			System.out.println("Name : "+Name);
			System.out.println("Company : "+Company);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
