package com.test;

import java.util.LinkedList;

public class Test_03_LinkedList {
	
	public void testLinkedList_1(){
		LinkedList<String> ll = new LinkedList<String>();
		
		//��ũ�帮��Ʈ�� ���ͳ� ��̸���Ʈ�� �⺻���� ������ ����
		//�������� ��ũ�帮��Ʈ�� �� �� �������� ����Ǿ� �־�
		//ù��° �����۰� ������ �����ۿ� �ٷ� ������ �����ϸ�
		//push�� pop�� �����ϴٴ� ��
		
		//�⺻���� ������ �߰� ����� ����
		ll.add("AAA");
		ll.add("BBB");
		ll.add("CCC");
		ll.add("DDD");
		ll.add("EEE");
		
		//getFirst, getLast �޼ҵ�� ó�� �����Ϳ� ������ �����͸� �ٷ� ������ �� �ִ�.
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
		
		//addFirst�� �� ���ڸ��� �����͸� �����ְ� ������ �����͸� �ڷ� ��ĭ�� �о��
		//add(0,"XXX") �ʹ� ���� ���
		ll.addFirst("XXX");
//		ll.add(0,"XXX");
		for(String item:ll){
			System.out.println(item);
		}
		
		//addLast�� �� ���ڸ��� �����͸� �ִ´�. �׳� add�� �� ���̴� ����.
		ll.addLast("YYY");
//		for(String item:ll){
//			System.out.println(item);
//		}
		
	}
	
	public void testLinkedList_2(){
		LinkedList<String> ll = new LinkedList<String>();
		//add�� ����Ʈ�� ������ �ε����� �����͸� �߰��Ͽ� �ִ´�.
		ll.add("AAA");
		ll.add("BBB");
		ll.add("CCC");
		ll.add("DDD");
		ll.add("EEE");
		
		//������ push�� ù��° �ε����� �����͸� �о�ְ� �ȴ�.
		ll.push("XXX");
		
		//pop�� ���� ù��° �����͸� �̾Ƴ��� ����Ʈ���� �����Ѵ�.
		//��ũ�帮��Ʈ�� queue�̱� �����̴� ���� stack�̶�� ���� ������ �����͸� �̾Ƴ��� ����Ʈ���� �����ϰ� �ɰ��̴�.
		String pop = ll.pop();
		
		//poll�� ���� ù��° �����͸� �̾Ƴ��� ����Ʈ���� �����Ѵ�.
		//��������� ��ũ�帮��Ʈ�� pop�� poll�� ���� ����̴�.
		String poll = ll.poll();
		
	}
	
	public static void main(String[] args) {
		Test_03_LinkedList obj = new Test_03_LinkedList();
		obj.testLinkedList_2();
		
	}
}
