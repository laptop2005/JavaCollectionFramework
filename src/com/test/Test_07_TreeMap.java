package com.test;

import java.util.TreeMap;

public class Test_07_TreeMap {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		
		//HashMap�� String, String ���� �־�����
		tm.put("A", "AAA");
		
		//HashMap�� Integer, String ���� �־�����
		tm.put(new Integer(1), "BBB");
		TestVO vo = new TestVO();
		
		//HashMap�� Object, Object �� �־�����
		tm.put(vo, vo);
		vo.setStr1("CCC");
		
		tm.put("VO", vo);
		
	}
}
