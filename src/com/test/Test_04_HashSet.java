package com.test;

import java.util.HashSet;
import java.util.Iterator;

public class Test_04_HashSet {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add("A");
		hs.add("C");
		hs.add("B");
		hs.add("E");
		hs.add("D");
		hs.add(new Integer(1));
		hs.add(new Integer(2));
		hs.add(new Integer(5));
		
		//�̹� HashSet�� ���ִ� �����͸� �߰��ϸ� �ߺ��� ������� �ʱ� ������ �����ʹ� ���� �ʰ� ����� false�� �����Ѵ�
		boolean isAdd = hs.add("A");
		System.out.println(isAdd);
		
		System.out.println(hs);
		
		Iterator it = hs.iterator();
		
		//HashSet�� �־��� �����͸� Iterator�� ������ �־��� �����ʹ� ����� ���� ���´�
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
