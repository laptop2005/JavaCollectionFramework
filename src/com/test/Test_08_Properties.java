package com.test;

import java.util.Properties;

public class Test_08_Properties {
	
	public void testProperties_1(){
		Properties prop = new Properties();
		
		//프로퍼티스는 맵보다 축소된 기능의 객체라고 할 수 있다.
		//맵은 모든 형태의 데이터를 키와 밸류값으로 넣을 수 있는데 반해
		//프로퍼티스는 키와 밸류를 스트링으로만 넣을 수 있으며
		//맵은 put, get 메소드를 통해 데이터를 넣고 다시 얻어오지만
		//프로퍼티스는 setProperty, getProperty를 통해 데이터를 넣고 얻어온다.
		
		prop.setProperty("A", "AAA");
		prop.setProperty("B", "BBB");
		prop.setProperty("C", "CCC");
		prop.setProperty("D", "DDD");
		prop.setProperty("E", "EEE");
		
		String a = prop.getProperty("A");
		
		
	}
	
	public static void main(String[] args) {
		Test_08_Properties obj = new Test_08_Properties();
		obj.testProperties_1();
	}
}
