package tests;

import java.util.Properties;

import utilities.PropUtil;

public class ReadProperties {

	public static void main(String[] args) {
		
		Properties prop = PropUtil.readData("Config.properties");
		
		System.out.println(prop.get("APP_URL"));

	}

}
