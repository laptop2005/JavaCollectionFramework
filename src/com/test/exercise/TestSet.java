package com.test.exercise;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
	public static void main(String[] args) {
		
		HashSet lottoSet = new HashSet();
		
		while(true){
			int lottoNumber = (int)(Math.random()*46) + 1;
			lottoSet.add(lottoNumber);
			if(lottoSet.size()>=6){
				break;
			}
		}
		
		Iterator itr = lottoSet.iterator();
		System.out.println("�̹��� �ζǹ�ȣ��?");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		/*
		 * �������� �ζ� 5õ����ġ �Ǵ� ���� �� ��ŭ �ζǸ� �ִ� ���α׷��� ����� ����
		 * */
	}
}
