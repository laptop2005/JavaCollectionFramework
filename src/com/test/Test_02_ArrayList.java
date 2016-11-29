package com.test;

import java.util.ArrayList;

public class Test_02_ArrayList {
	
	public void testArrayList_1(){
		ArrayList l = new ArrayList();
		
		//��̸���Ʈ�� �⺻���� ������ ���Ϳ� ����.
		// add�� ���� �����͸� �߰��ϸ� �߰����θ� boolean���� ��ȯ �޴´�.
		boolean isAdd_1 = l.add("aaa");
		boolean isAdd_2 = l.add("bbb");
		boolean isAdd_3 = l.add(111);
		boolean isAdd_4 = l.add('a');
		boolean isAdd_5 = l.add(true);
		
		//����� Ȯ���� ���� �߰��� �������� ������ Ȯ���� �� �ִ�.
		System.out.println(l.size());
		
		//���Ϳ� ���������� �ε����� �����͸� ������ �� �ִ�.
		System.out.println(l.get(0));
		
		//�����͸� �����ִ� add�� ���Ϳ� ����.
		l.add(0, "XXX");
		
		//�����͸� �ٲ�ġ�� �ϴ� set�� ��������
		String yyy = (String)l.set(0, "YYY");
		
		//������ ����
		String removeItem = (String)l.remove(0);
		
		//���׸��� �����Ͽ� ������ �� �ִ�.
		ArrayList<String> strL = new ArrayList<String>();
		strL.add("AAA");
		strL.add("BBB");
		strL.add("CCC");
		strL.add("DDD");
		strL.add("EEE");
//		strL.add(111);
		
		for(int i=0;i<strL.size();i++){
			System.out.println(strL.get(i));
		}
		
		for(String item:strL){
			System.out.println(item);
		}
		
		ArrayList<TestVO> voL = new ArrayList<TestVO>();
		TestVO vo = new TestVO();
		vo.setStr1("AAA");
		vo.setInt1(111);
		vo.setChr1('x');
		voL.add(vo);
		voL.add(vo);
		voL.add(vo);
		
		for(TestVO item:voL){
			System.out.println(item.getStr1()+","+item.getInt1());
		}
		
		/*
		 * Vector�� ArrayList�� ���� ū �������� Vector�� "������ ����ȭ" ArrayList�� sychronized ������������ ����ȭ
		 * */
	}
	
	public static void main(String[] args) {
		Test_02_ArrayList obj = new Test_02_ArrayList();
		obj.testArrayList_1();
	}
}
