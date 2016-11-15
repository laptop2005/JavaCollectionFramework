package com.test;

import java.util.HashMap;
import java.util.Hashtable;

public class Test_06_HashMap {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		//HashMap에 String, String 으로 넣었을때
		hm.put("A", "AAA");
		
		//HashMap에 Integer, String 으로 넣었을때
		hm.put(new Integer(1), "BBB");
		TestVO vo = new TestVO();
		
		//HashMap에 Object, Object 로 넣었을때
		hm.put(vo, vo);
		vo.setStr1("CCC");
		
		hm.put("VO", vo);
		
		TestVO vo2 = new TestVO();
		
		System.out.println(hm.get("A"));
		System.out.println(hm.get(new Integer(1)));
		
		//vo로 HashMap에 넣은 Object를 찾을 수 있다.
		System.out.println(((TestVO)hm.get(vo)).getStr1());
		System.out.println(((TestVO)hm.get("VO")).getStr1());
		
		//하지만 같은 클래스로 정의한 vo2로는 찾을 수 없다. 이유는 key값으로 vo의 주소값이 들어갔기 때문에
//		System.out.println(((TestVO)hm.get(vo2)).getStr1());
		
		Hashtable ht = new Hashtable();
		ht.put("A", "B");
		ht.get("A");
		String b = ht.remove("A").toString();
		System.out.println(b);
		System.out.println(ht.get("A"));
	}
}
