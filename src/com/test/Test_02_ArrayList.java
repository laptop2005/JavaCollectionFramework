package com.test;

import java.util.ArrayList;

public class Test_02_ArrayList {
	public static void main(String[] args) {
				
//		일반적인 문자열 벡터
		ArrayList al1 = new ArrayList();
		
		String str1 = "AAA";
//		int int2 = 222;
		Integer int2 = new Integer(222);
//		char chr3 = 'C';
		Character chr3 = new Character('C');
		String str4 = "DDD";
		String str5 = "EEE";
		
	
//		벡터에 데이터 추가
		al1.add(str1);
		al1.add(int2);
		System.out.println(al1.get(0));
		System.out.println(al1.get(1));
		
//		벡터에 데이터의 위치를 지정하여 추가
		al1.add(2, chr3);
		System.out.println(al1.get(2));
		
		System.out.println(al1);
		
//		벡터에서 데이터 삭제
		al1.remove(0);
		for(int inx=0;inx<al1.size();inx++){
			System.out.println(al1.get(inx));
		}
		
//		벡터에서 값으로 데이터 삭제
		al1.remove(int2);
		for(int inx=0;inx<al1.size();inx++){
			System.out.println(al1.get(inx));
		}
		
//		al1.remove('C');
//		for(int inx=0;inx<al1.size();inx++){
//			System.out.println(al1.get(inx));
//		}
		
		///////////////////////////////////////////////////////////////////
		
//		벡터안에 다른 클래스를 추가하기
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
		 * Vector와 ArrayList의 가장 큰 차이점은 Vector는 "무조건 동기화" ArrayList는 sychronized 선언했을때만 동기화
		 * */
		
	}
}
