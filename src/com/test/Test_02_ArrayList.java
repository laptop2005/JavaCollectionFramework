package com.test;

import java.util.ArrayList;

public class Test_02_ArrayList {
	public static void main(String[] args) {
				
//		�Ϲ����� ���ڿ� ����
		ArrayList al1 = new ArrayList();
		
		String str1 = "AAA";
//		int int2 = 222;
		Integer int2 = new Integer(222);
//		char chr3 = 'C';
		Character chr3 = new Character('C');
		String str4 = "DDD";
		String str5 = "EEE";
		
	
//		���Ϳ� ������ �߰�
		al1.add(str1);
		al1.add(int2);
		System.out.println(al1.get(0));
		System.out.println(al1.get(1));
		
//		���Ϳ� �������� ��ġ�� �����Ͽ� �߰�
		al1.add(2, chr3);
		System.out.println(al1.get(2));
		
		System.out.println(al1);
		
//		���Ϳ��� ������ ����
		al1.remove(0);
		for(int inx=0;inx<al1.size();inx++){
			System.out.println(al1.get(inx));
		}
		
//		���Ϳ��� ������ ������ ����
		al1.remove(int2);
		for(int inx=0;inx<al1.size();inx++){
			System.out.println(al1.get(inx));
		}
		
//		al1.remove('C');
//		for(int inx=0;inx<al1.size();inx++){
//			System.out.println(al1.get(inx));
//		}
		
		///////////////////////////////////////////////////////////////////
		
//		���;ȿ� �ٸ� Ŭ������ �߰��ϱ�
		ArrayList al2 = new ArrayList();
		
		TestVO vo1 = new TestVO();
		vo1.setStr1("Test");
		vo1.setInt1(999);
		vo1.setChr1('Z');
		
		al2.add(vo1);		
		
		TestVO vo2 = (TestVO)al2.get(0);
		
		System.out.println(vo2.getStr1());
		System.out.println(vo2.getInt1());
		System.out.println(vo2.getChr1());

		/*
		 * Vector�� ArrayList�� ���� ū �������� Vector�� "������ ����ȭ" ArrayList�� sychronized ������������ ����ȭ
		 * */
		
	}
}
