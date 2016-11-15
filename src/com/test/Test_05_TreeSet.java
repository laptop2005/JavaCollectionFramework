package com.test;

import java.util.Iterator;
import java.util.TreeSet;


public class Test_05_TreeSet {
	public static void main(String[] args) {
		
		/*
		 * TreeSet�� java 1.8���������� ������ ���� ����
		 * */
		
		TreeSet ts = new TreeSet();
		for(char chr = 'A';chr<='Z';chr++){
			String tmp = String.valueOf(chr);
			ts.add(tmp);
		}
		
//		System.out.println(ts);
		
		//headSet�� �־��� ������ �տ� �ִ� �� �� �־��� ������ ���� ���� SortSet�� �����´�
//		System.out.println(ts.headSet("K"));
		//tailSet�� �־��� ������ �ڿ� �ִ� �� �� �־��� ���� ������ ū ���� SortSet�� �����´�
//		System.out.println(ts.tailSet("K"));
		
//		System.out.println(ts.headSet("K", true));
//		System.out.println(ts.tailSet("K", false));
		
		
		
		Iterator it = ts.headSet("K").iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
