package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class Test_10_Queue {
	public static void main(String[] args) {
		/*
		 * Queue�� ���� ���� ���� �����Ͱ� ���� ���� ������ ����
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
