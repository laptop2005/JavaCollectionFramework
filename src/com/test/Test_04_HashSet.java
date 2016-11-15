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
		
		//이미 HashSet에 들어가있는 데이터를 추가하면 중복을 허용하지 않기 때문에 데이터는 들어가지 않고 결과는 false를 리턴한다
		boolean isAdd = hs.add("A");
		System.out.println(isAdd);
		
		System.out.println(hs);
		
		Iterator it = hs.iterator();
		
		//HashSet에 넣었던 데이터를 Iterator로 뽑을때 넣었던 순서와는 상관이 없이 나온다
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
