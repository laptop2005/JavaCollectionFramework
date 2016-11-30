package com.test;

import java.util.Stack;

public class Test_09_Stack {
	
	public void testStack_1(){
		Stack<String> stack = new Stack<String>();
		
		//������ �⺻������ ����Ʈ�� �������� �Ǿ� �־� add�� get �޼ҵ带 ���� �����͸� �ְ��� �� �� �ִ�.
		stack.add("A");
		stack.add("B");
		stack.add("C");
		stack.add("D");
		stack.add("E");
		
		String a = stack.get(0);
		String b = stack.get(1);
		String c = stack.get(2);
		String d = stack.get(3);
		String e = stack.get(4);
		
		//������ �Ϲ� ����Ʈ�� �ٸ� ���� push�� pop�� �ִ�.
		//���ÿ��� push�� �����͸� �ְԵǸ� �����ʹ� �ڵ����� ������ �ε����� �߰��ؼ� ���� �ȴ�.
		//pop �޼ҵ�� �����͸� �ҷ����� �Ǹ� ���� �������� ���� �����Ͱ� ���� ���� ������ �Ǵµ�
		//�̶� pop���� �ҷ��� �����ʹ� ���ÿ��� ������� �ȴ�.
		stack.push("F");
		System.out.println(stack.indexOf("F")); // push�� ���� �����Ͱ� ������ �ε����� �߰��Ǿ����� �˼��ִ�.
		
		System.out.println("stack.pop:"+stack.pop()+", stack.size:"+stack.size());
		System.out.println("stack.pop:"+stack.pop()+", stack.size:"+stack.size());
		System.out.println("stack.pop:"+stack.pop()+", stack.size:"+stack.size());
		System.out.println("stack.pop:"+stack.pop()+", stack.size:"+stack.size());
		System.out.println("stack.pop:"+stack.pop()+", stack.size:"+stack.size());
		System.out.println("stack.pop:"+stack.pop()+", stack.size:"+stack.size());
	}
	
	public static void main(String[] args) {
		Test_09_Stack obj = new Test_09_Stack();
		obj.testStack_1();
		
	}
}
