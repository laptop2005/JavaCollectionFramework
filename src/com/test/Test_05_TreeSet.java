package com.test;

import java.util.Iterator;
import java.util.TreeSet;


public class Test_05_TreeSet {
	public static void main(String[] args) {
		
		/*
		 * TreeSet은 java 1.8버전에서는 오류가 나고 있음
		 * */
		
		TreeSet ts = new TreeSet();
		for(char chr = 'A';chr<='Z';chr++){
			String tmp = String.valueOf(chr);
			ts.add(tmp);
		}
		
//		System.out.println(ts);
		
		//headSet은 주어진 값보다 앞에 있는 값 즉 주어진 값보다 작은 값의 SortSet을 가져온다
//		System.out.println(ts.headSet("K"));
		//tailSet은 주어진 값보다 뒤에 있는 값 즉 주어진 값을 포함한 큰 값의 SortSet을 가져온다
//		System.out.println(ts.tailSet("K"));
		
//		System.out.println(ts.headSet("K", true));
//		System.out.println(ts.tailSet("K", false));
		
		
		
		Iterator it = ts.headSet("K").iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
