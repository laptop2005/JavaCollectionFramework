package com.test;

import java.util.Stack;

public class Test_09_Stack {
	public static void main(String[] args) {
		/*
		 * Stack은 가장 나중에 넣은 값이 먼저 나오는 구조
		 * */
		Stack stack = new Stack();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		for(int inx=0;inx<stack.size();inx++){
			System.out.print(stack.get(inx));
		}
		System.out.println();
		
		System.out.println("size:"+stack.size());		
		System.out.println("pop:"+stack.pop());
		for(int inx=0;inx<stack.size();inx++){
			System.out.print(stack.get(inx));
		}
		System.out.println();
		
		stack.push("E");
		
		for(int inx=0;inx<stack.size();inx++){
			System.out.print(stack.get(inx));
		}
		System.out.println();
		
		System.out.println("size:"+stack.size());		
		System.out.println("pop:"+stack.pop());
		for(int inx=0;inx<stack.size();inx++){
			System.out.print(stack.get(inx));
		}
		System.out.println();
		
		System.out.println("size:"+stack.size());
		System.out.println("pop:"+stack.pop());
		for(int inx=0;inx<stack.size();inx++){
			System.out.print(stack.get(inx));
		}
		System.out.println();
		
		System.out.println("size:"+stack.size());
		System.out.println("pop:"+stack.pop());
		for(int inx=0;inx<stack.size();inx++){
			System.out.print(stack.get(inx));
		}
		System.out.println();
		
		System.out.println("size:"+stack.size());
		System.out.println("pop:"+stack.pop());
		for(int inx=0;inx<stack.size();inx++){
			System.out.print(stack.get(inx));
		}
		System.out.println();
		
		System.out.println("size:"+stack.size());
		
	}
}
