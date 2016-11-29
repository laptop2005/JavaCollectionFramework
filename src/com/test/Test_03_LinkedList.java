package com.test;

import java.util.LinkedList;

public class Test_03_LinkedList {
	
	public void testLinkedList_1(){
		LinkedList<String> ll = new LinkedList<String>();
		
		//링크드리스트는 벡터나 어레이리스트와 기본적인 사용법은 같다
		//차이점은 링크드리스트는 앞 뒤 아이템이 연결되어 있어
		//첫번째 아이템과 마지막 아이템에 바로 접근이 가능하며
		//push와 pop이 가능하다는 것
		
		//기본적인 데이터 추가 방법은 같음
		ll.add("AAA");
		ll.add("BBB");
		ll.add("CCC");
		ll.add("DDD");
		ll.add("EEE");
		
		//getFirst, getLast 메소드로 처음 데이터와 마지막 데이터를 바로 가져올 수 있다.
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
		
		//addFirst는 맨 앞자리에 데이터를 끼워넣고 나머지 데이터를 뒤로 한칸씩 밀어낸다
		//add(0,"XXX") 와는 같은 기능
		ll.addFirst("XXX");
//		ll.add(0,"XXX");
		for(String item:ll){
			System.out.println(item);
		}
		
		//addLast는 맨 뒷자리에 데이터를 넣는다. 그냥 add와 별 차이는 없다.
		ll.addLast("YYY");
//		for(String item:ll){
//			System.out.println(item);
//		}
		
	}
	
	public static void main(String[] args) {
		Test_03_LinkedList obj = new Test_03_LinkedList();
		obj.testLinkedList_1();
		
	}
}
