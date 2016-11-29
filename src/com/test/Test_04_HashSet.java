package com.test;

import java.util.HashSet;
import java.util.Iterator;

public class Test_04_HashSet {
	
	public void testHashSet_1(){
		HashSet hs = new HashSet();
		
		//HashSet�� �����͸� �߰��Ҷ��� add�޼ҵ带 ����Ѵ�.
		hs.add("A");
		hs.add("C");
		hs.add("B");
		hs.add("E");
		hs.add("D");
		hs.add(1);
		hs.add(2);
		hs.add(5);
		
		//�ؽ����� �������� ������ ���� �ߺ��� ������� �ʴ´�.
		//���� �̹� �ִ� �����͸� add�ϰ� �Ǹ�
		boolean isAdd = hs.add("A");
		
		//boolean ���� false ���� �����ϰ� �����ʹ� �߰����� �ʴ´�.
		System.out.println(isAdd);
		
	}
	
	public void testHashSet_2(){
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("C");
		hs.add("B");
		hs.add("E");
		hs.add("D");
		
		//�ؽ����� �����Ϳ� ������ ���� ������ ����Ʈó�� �ε����� �����͸� �ϳ��� �ҷ��� �� ����
		//�׷��� �����͸� �ϳ��� ��� ���ؼ��� Iterator�� ��ȯ�ؾ� �Ѵ�.
		Iterator<String> it = hs.iterator();
		
		//HashSet�� �־��� �����͸� Iterator�� ������ �־��� �����ʹ� ����� ���� ���´�
		
		//while������ ������ �����Ҷ�
		while(it.hasNext()){ //���ͷ����Ͱ� ���� �������� ������ �ִµ��� �ݺ�
			System.out.println(it.next());//���ͷ������� ���� �������� ���
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
		
		//for������ ������ �����Ҷ�
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
