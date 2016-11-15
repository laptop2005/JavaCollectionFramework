package com.test;

import java.util.TreeMap;

public class Test_07_TreeMap {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		
		//HashMap에 String, String 으로 넣었을때
		tm.put("A", "AAA");
		
		//HashMap에 Integer, String 으로 넣었을때
		tm.put(new Integer(1), "BBB");
		TestVO vo = new TestVO();
		
		//HashMap에 Object, Object 로 넣었을때
		tm.put(vo, vo);
		vo.setStr1("CCC");
		
		tm.put("VO", vo);
		
	}
}
