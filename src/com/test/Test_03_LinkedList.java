package com.test;

import java.util.LinkedList;

public class Test_03_LinkedList {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add("AAA");
		ll.add(new Integer(222));
		ll.add(new Character('C'));
		
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		
		System.out.println(ll);
		/*
		 * LinkedList�� ArrayList�� ���̴� LinkedList�� push�� pop�� ��밡�� �� ��
		 * 
		 * */
		System.out.println(ll.pop());
		System.out.println(ll.pop());
		System.out.println(ll.pop());
		
		ll.push("AAA");
		ll.push(new Integer(222));
		ll.push(new Character('C'));
		
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		
	}
}
