package com.test;

import java.util.HashMap;
import java.util.Hashtable;

public class Test_06_HashMap {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		//HashMap�� String, String ���� �־�����
		hm.put("A", "AAA");
		
		//HashMap�� Integer, String ���� �־�����
		hm.put(new Integer(1), "BBB");
		TestVO vo = new TestVO();
		
		//HashMap�� Object, Object �� �־�����
		hm.put(vo, vo);
		vo.setStr1("CCC");
		
		hm.put("VO", vo);
		
		TestVO vo2 = new TestVO();
		
		System.out.println(hm.get("A"));
		System.out.println(hm.get(new Integer(1)));
		
		//vo�� HashMap�� ���� Object�� ã�� �� �ִ�.
		System.out.println(((TestVO)hm.get(vo)).getStr1());
		System.out.println(((TestVO)hm.get("VO")).getStr1());
		
		//������ ���� Ŭ������ ������ vo2�δ� ã�� �� ����. ������ key������ vo�� �ּҰ��� ���� ������
//		System.out.println(((TestVO)hm.get(vo2)).getStr1());
		
		Hashtable ht = new Hashtable();
		ht.put("A", "B");
		ht.get("A");
		String b = ht.remove("A").toString();
		System.out.println(b);
		System.out.println(ht.get("A"));
	}
}
