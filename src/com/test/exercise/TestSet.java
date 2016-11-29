package com.test.exercise;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
	
	//�ζǹ�ȣ�� ���� HashSet
	HashSet<Integer> lottoSet;
	
	//������
	public TestSet(){
		lottoSet = new HashSet<Integer>();
	}
	
	//���α׷� ����
	public void startProgram(){
		//�ζǹ�ȣ �����ϱ�
		getLotto();
		//�ζǹ�ȣ ����ϱ�
		printLotto();
	}
	
	//�ζǹ�ȣ �����ϱ�
	private void getLotto(){
		while(true){
			int lottoNumber = (int)(Math.random()*46) + 1;
			
			//HashSet���� �ߺ��� �����Ͱ� ���� �ʴ´�. ���� �ζǹ�ȣ�� �ߺ��Ǿ��ٸ� lottoSet���� �ζǹ�ȣ�� ���� �ʴ´�.
			lottoSet.add(lottoNumber);
			
			//lottoSet�� ũ�Ⱑ 6�̸� �ߺ����� ���� �ζǹ�ȣ�� 6�� ��� ������Ƿ� �ζǹ�ȣ ������ ����
			if(lottoSet.size()>=6){
				break;
			}
		}
	}
	
	//�ζǹ�ȣ ����ϱ�
	private void printLotto(){
		//�ζǹ�ȣ�� �ϳ��� �������� ���� Iterator�� ��ȯ
		Iterator<Integer> itr = lottoSet.iterator();
		
		System.out.println("�̹��� �ζǹ�ȣ��?");
		
		//Iterator�� hasNext()(���� �ζǹ�ȣ�� �ִ°�) �� true�� ���� �ζǹ�ȣ�� �ϳ��� ������ ������ش�.
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		/*
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		
		while(true){
			int lottoNumber = (int)(Math.random()*46) + 1;
			lottoSet.add(lottoNumber);
			if(lottoSet.size()>=6){
				break;
			}
		}
		
		Iterator<Integer> itr = lottoSet.iterator();
		System.out.println("�̹��� �ζǹ�ȣ��?");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		*/
		
		TestSet obj = new TestSet();
		obj.startProgram();
		
		/*
		 * �������� �ζ� 5õ����ġ �Ǵ� ���� �� ��ŭ �ζǸ� �ִ� ���α׷��� ����� ����
		 * */
	}
}
