package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class Test_10_Queue {
	public static void main(String[] args) {
		/*
		 * Queue는 가장 먼저 넣은 데이터가 가장 먼저 나오는 구조
		 * */
		Queue que = new LinkedList();
		
		que.add("A");
		que.add("B");
		que.add("C");
		
		que.offer("D");
		que.offer("E");
		que.offer("F");
		
		while(!que.isEmpty()){
			System.out.println(que.poll());
		}
	}
}
