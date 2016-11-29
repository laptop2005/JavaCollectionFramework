package com.test;

import java.util.HashSet;
import java.util.Iterator;

public class Test_04_HashSet {
	
	public void testHashSet_1(){
		HashSet hs = new HashSet();
		
		//HashSet에 데이터를 추가할때도 add메소드를 사용한다.
		hs.add("A");
		hs.add("C");
		hs.add("B");
		hs.add("E");
		hs.add("D");
		hs.add(1);
		hs.add(2);
		hs.add(5);
		
		//해쉬셋은 데이터의 순서가 없고 중복을 허용하지 않는다.
		//따라서 이미 있는 데이터를 add하게 되면
		boolean isAdd = hs.add("A");
		
		//boolean 으로 false 값을 리턴하고 데이터는 추가되지 않는다.
		System.out.println(isAdd);
		
	}
	
	public void testHashSet_2(){
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("C");
		hs.add("B");
		hs.add("E");
		hs.add("D");
		
		//해쉬셋은 데이터에 순서가 없기 때문에 리스트처럼 인덱스로 데이터를 하나씩 불러올 수 없다
		//그래서 데이터를 하나씩 얻기 위해서는 Iterator로 변환해야 한다.
		Iterator<String> it = hs.iterator();
		
		//HashSet에 넣었던 데이터를 Iterator로 뽑을때 넣었던 순서와는 상관이 없이 나온다
		
		//while문으로 데이터 추출할때
		while(it.hasNext()){ //이터레이터가 다음 아이템을 가지고 있는동안 반복
			System.out.println(it.next());//이터레이터의 다음 아이템을 출력
		}
	}
	
	public void testHashSet_3(){
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("C");
		hs.add("B");
		hs.add("E");
		hs.add("D");
		
		Iterator<String> it = hs.iterator();
		
		//for문으로 데이터 추출할때
		for(;it.hasNext();){
			System.out.println(it.next());
		}
	}
	
	public void testHashSet_4(){
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("C");
		hs.add("B");
		hs.add("E");
		hs.add("D");
		
		Iterator<String> it = hs.iterator();
		
		for(int i=0;i<hs.size();i++){
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		Test_04_HashSet obj = new Test_04_HashSet();
		obj.testHashSet_4();
	}
}
