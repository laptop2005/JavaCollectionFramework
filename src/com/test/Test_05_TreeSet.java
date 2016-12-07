package com.test;

import java.util.Iterator;
import java.util.TreeSet;


public class Test_05_TreeSet {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		for(char chr = 'A';chr<='Z';chr++){
			String tmp = String.valueOf(chr);
			ts.add(tmp);
		}
		
		System.out.println(ts);
		
		//headSet은 주어진 값보다 앞에 있는 값 즉 주어진 값보다 작은 값의 SortSet을 가져온다
		System.out.println(ts.headSet("K"));
		
		//tailSet은 주어진 값보다 뒤에 있는 값 즉 주어진 값을 포함한 큰 값의 SortSet을 가져온다
		System.out.println(ts.tailSet("K"));
		
		//headSet을 호출할때 매개변수로 기준값의 포함여부를 함께 보낼 수 있다.
		//true면 포함 false면 미포함
		System.out.println(ts.headSet("K", true));
		
		//tailSet도 마찬가지
		System.out.println(ts.tailSet("K", false));
		
		
		
		Iterator it = ts.headSet("K").iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
