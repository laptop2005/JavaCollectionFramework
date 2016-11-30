package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test_06_HashMap {
	
	public void testHashMap_1(){
		HashMap hm = new HashMap();
		
		//���� �����͸� ������ Ű��,����� ���� �ִ´�.
		//�׸��� Ű���� �ߺ��� �� ������ ������� �ߺ��� �� �ִ�.
		//������� �ֹε�Ϲ�ȣ�� �������� ���ϰ� ���̸� �����Ѵٰ� �ϸ�
		//�ֹε�Ϲ�ȣ�� �ߺ��� �� ������ ���ϰ� ���̰� ���� ����� �����Ѵ�.
		hm.put("A", "AAA");
		hm.put(1, "BBB");
		hm.put("C", 333); 
		hm.put('D', 'D');
		
		//���� java collection�� �����͸� �������� Object �̾�� �ϱ� ������
		//int�� char �� Ű���̳� ������� ���� �������� ����
		//Integer�� Character ���� wrapper Ŭ������ �����Ͽ� �־�� �ߴ�.
		//������ jdk1.5 �������ʹ� int�� char ���� �⺻�� ������ Ÿ������ �ִ��� 
		//�˾Ƽ� ��ȯ�� �ǵ��� �����Ǿ���.
		//���� jdk1.4 ������ ����ϴ� ȯ���̶�� ����ؾ� �ϴ� �κ��̴�
		
		//�� �Ѱ��� �����͸� �������� Ű���� ������� �⺻�� ������Ÿ������ �־ �˾Ƽ� ��ȯ��������
		//�����͸� �ٽ� ������ ������ ���׸��� ���������� �ʾҴٸ� �⺻������ Object�� �������� ������
		//�����Ϳ� �´� ����ȯ�� �ʿ�������.
		int c = (int)hm.get("C");
		char d = (char)hm.get('D');
		
		//���� �̹� �ִ� Ű������ �����͸� put �ߴٸ� ������ �ִ� �����͸� ��ȯ�ϰ� ���ο� �����͸� ����� �ȴ�.
		String a = (String)hm.put("A", "BBB");
		System.out.println(a);
		
		//�ʿ��� �����͸� ������ ��쿡�� 
		//remove�޼ҵ带 �̿��Ͽ� Ű���� �Ѱ��ָ� Ű���� �ش��ϴ� ��������� �����ǰ� �ȴ�.
		hm.remove(1);
		hm.remove("A");
		
	}
	
	public void testHashMap_2(){
		//�ʿ��� ���׸�Ÿ���� ����� ��쿡�� Ű���� ������� Ŭ������ �Ѵ� ������ �־�� �Ѵ�.
		//������ �ʿ� �⺻�� ������ Ÿ������ �����͸� �־ �ڵ����� ��ȯ���شٰ� �Ͽ�����
		//���׸��� ������ �ٶ��� �⺻�� ������ Ÿ������ ������ �� ���� ������
		//��¿�� ���� wrapper Ŭ������ �̿��ϰ� �ȴ�.
		HashMap<String,String> hm2 = new HashMap<String,String>();
		HashMap<Integer,Integer> hm3 = new HashMap<>();
		HashMap<Character,Boolean> hm4 = new HashMap<Character, Boolean>();
		
		hm3.put(1, 1);
		int i = hm3.get(1);
		
		hm4.put('a', true);
		boolean a = hm4.get('a');
		
		//�翬�ϰԵ� �� �ȿ� �ٸ� ��ü�� ��������� ���� ���� �ִ�.
		HashMap<String,TestVO> hm5 = new HashMap<String, TestVO>();
		TestVO vo = new TestVO();
		vo.setStr1("AAA");
		vo.setInt1(111);
		vo.setChr1('Z');
		hm5.put("vo", vo);
		
		TestVO vo2 = hm5.get("vo");
	}
	
	public void testHashMap_3(){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A", "AAA");
		hm.put("B", "BBB");
		hm.put("C", "CCC");
		hm.put("D", "DDD");
		hm.put("E", "EEE");
		
		//�ʿ� �����͸� �־��ٸ� Ű���� �˾ƾ߸� �ش� �����͸� ã�ƿ� �� �ִ�.
		//�׷��� ���� �����͸� �־��ٸ� � �����͸� � Ű������ �־����� ������ ������� ���Ұ��̴�.
		//�̷��� keySet �޼ҵ�� ���� Ű�� �����͵��� ������ �� �ִ�.
		
		Set<String> keySet = hm.keySet();
		Iterator<String> itr = keySet.iterator();
		while(itr.hasNext()){
			String key = itr.next();
			System.out.println(key+","+hm.get(key));
		}
		
	}
	
	public static void main(String[] args) {
		Test_06_HashMap obj = new Test_06_HashMap();
		obj.testHashMap_1();
	}
}
