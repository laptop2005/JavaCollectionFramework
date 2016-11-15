package com.test;

import java.util.Properties;

public class Test_08_Properties {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("name", "ȫ�浿");
		prop.setProperty("tall", "180");
		prop.setProperty("money", "1000");
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("tall"));
		System.out.println(prop.getProperty("money"));
		System.out.println(prop.getProperty("iq","100"));
	}
}
