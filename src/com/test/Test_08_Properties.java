package com.test;

import java.util.Properties;

public class Test_08_Properties {
	
	public void testProperties_1(){
		Properties prop = new Properties();
		
		//������Ƽ���� �ʺ��� ��ҵ� ����� ��ü��� �� �� �ִ�.
		//���� ��� ������ �����͸� Ű�� ��������� ���� �� �ִµ� ����
		//������Ƽ���� Ű�� ����� ��Ʈ�����θ� ���� �� ������
		//���� put, get �޼ҵ带 ���� �����͸� �ְ� �ٽ� ��������
		//������Ƽ���� setProperty, getProperty�� ���� �����͸� �ְ� ���´�.
		
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
