package com.test;

import java.util.Vector;


public class Test_01_Vector {
	public static void main(String[] args) {
		
//		�Ϲ����� ���ڿ� ����
		Vector v = new Vector();
		
		String str1 = "AAA";
//		int int2 = 222;
		Integer int2 = new Integer(222);
//		char chr3 = 'C';
		Character chr3 = new Character('C');
		String str4 = "DDD";
		String str5 = "EEE";
		
	
//		���Ϳ� ������ �߰�
		v.add(str1);
		v.add(int2);
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		
//		���Ϳ� �������� ��ġ�� �����Ͽ� �߰�
		v.add(2, chr3);
		System.out.println(v.get(2));
		
		System.out.println(v);
		
//		���Ϳ��� ������ ����
//		v.remove(0);
//		for(int inx=0;inx<v.size();inx++){
//			System.out.println(v.get(inx));
//		}
		
//		���Ϳ��� ������ ������ ����
//		v.remove(int2);
//		for(int inx=0;inx<v.size();inx++){
//			System.out.println(v.get(inx));
//		}
		
//		v.remove('C');
//		for(int inx=0;inx<v.size();inx++){
//			System.out.println(v.get(inx));
//		}
		
		///////////////////////////////////////////////////////////////////
		
//		���;ȿ� �ٸ� Ŭ������ �߰��ϱ�
		Vector v2 = new Vector();
		
		TestVO vo1 = new TestVO();
		vo1.setStr1("Test");
		vo1.setInt1(999);
		vo1.setChr1('Z');
		
		v2.add(vo1);		
		
		TestVO vo2 = (TestVO)v2.get(0);
		
		System.out.println(vo2.getStr1());
		System.out.println(vo2.getInt1());
		System.out.println(vo2.getChr1());
		
	}
}
