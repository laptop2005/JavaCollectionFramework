package com.test;

import java.util.Vector;


public class Test_01_Vector {

	
	public void testVector_1(){
		Vector v = new Vector();
		
		//���� ������ ����� ����غ��� 0�̴�
		System.out.println(v.size());
		
		//���ʹ� add��ɾ ���Ͽ� ����Ʈ�� �����ͳ� ��ü�� �߰��� �� �ִ�.
		//���ʹ� add�Ҷ� �� �߰��Ǿ����� ���θ� boolean������ ��ȯ�Ѵ�.
		boolean isAdd_1 = v.add("aaa");
		boolean isAdd_2 = v.add("bbb");
		boolean isAdd_3 = v.add(111);
		boolean isAdd_4 = v.add('a');
		boolean isAdd_5 = v.add(true);
		
		//�����͸� ���Ϳ� �߰��� �� ����� ����غ��� �߰��� ������ŭ�� ��µȴ�.
		System.out.println(v.size());
		
		//addElement�� �⺻������ add�� ���� ����� �Ѵ� 
		//�������� addElement�� �����͸� �߰��Ҷ� ������ ����ȭ�� �Ѵٰ� �ϴµ�
		//�ŷڼ��� ������ synchronize ������ ó���ϴ� ���� �����Ѵ�.
		v.addElement("ccc");
		
		System.out.println(v.size());
		
		//���� ������ 0��°���� "aaa"�� ����ִ�.
		System.out.println(v.get(0));
		
		//���Ϳ��� �� �ε����� �����Ͽ� add�ϸ� �ش� �ε����� �����͸� �����ְ�  
		//�� ���� �����͵��� ��ĭ�� �ڷ� �з� �ε����� 1�� �����ϰ� �ȴ�.
		v.add(1,"ddd");
		System.out.println(v.get(1));
		
		//set �޼ҵ带 ����ϸ� �ش� �ε����� �ִ� �����͸� �������� ��ȯ�ϰ�
		//�������� �����͸� �� �ڸ��� ����� �ȴ�.
		String v0 = (String)v.set(0, "eee");
		System.out.println(v0);
		System.out.println(v.get(0));
		
		
		//remove�޼ҵ带 ����Ͽ� �ش� �ε����� �ִ� �����͸� ���ͷκ��� ������ �� �ִ�.
		//�����͸� �����ϰ� �Ǹ� ������ ����� �ڿ��� �پ��� �ȴ�.
		//���� ������ �������� �ؿ� �ִ� �����ͺ��� �ö�� �� �ڸ��� ä��� �ȴ�.
		//�����͸� ������ �� �����Ǵ� �����͸� ��������� ���� �� �ִ�.
		System.out.println(v.get(0)+":"+v.size());
		String removeItem = (String)v.remove(0);
		System.out.println("removeItem:"+removeItem);
		System.out.println(v.get(0)+":"+v.size());
		
	}
	
	public void testVector_2(){
		//���׸� Ÿ��(generic type)�̶�� ���� 
		//��ü ����ÿ� <> �ȿ� �� ����Ʈ�� ����� ������ Ÿ���� �����ִ� ���̴�.
		//�̷��� ������ �����ϰ� �Ǹ� �� ������ Ÿ�� �ܿ� �ٸ� ������Ÿ���� ����Ʈ�� ���� �� ����.
		//���� ���׸����� ����� �� �ִ� ������Ÿ���� Ŭ�����̾�� �Ѵ�.
		//�׷��� int �����ʹ� Integer�� ��ü�ϰ� boolean�� Boolean, char�� Character ������ ��ü�Ͽ� ����Ѵ�.
		//���׸� Ÿ������ �����ϰ� �Ǹ� �����͸� get �Ͽ����� ������ ����ȯ�� ���� �ٷ� ����� �����ϴ�.
		Vector<String> v1 = new Vector<String>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Boolean> v3 = new Vector<Boolean>();
		Vector<Character> v4 = new Vector<Character>();
		Vector v = new Vector();
		
		v.add("AAA");
		//�̷��� ���׸����� ������� ���� ���ʹ� �����͸� ������ �� �������� �����Ϳ� �´� ����ȯ�� ���־�� �Ѵ�.
		String aaa = (String)v.get(0);
		
		v1.add("XXX");
		
		//�׷��� ���׸����� ������ Ÿ���� ������ �ִ� ���� ������ ����ȯ�� ���� ����� �����ϴ�.
		String xxx = v1.get(0);
	}
	
	public void testVector_3(){
		//���Ϳ��� �ܼ��� ������ Ÿ�Ը� ������ �ִ°��� �ƴ϶�
		//���� Ŭ������ ���� �� �ִ�.
		Vector<TestVO> v = new Vector<TestVO>();
		
		TestVO vo1 = new TestVO();
		vo1.setStr1("AAA");
		vo1.setInt1(111);
		vo1.setChr1('a');
		
		v.add(vo1);
		
		//���׸����� TestVO�� �����Ǿ� �����Ƿ� ������ ����ȯ ���� 
		//���Ϳ��� get�� ���Ŀ� TestVO�� �޼ҵ带 �ٷ� ����� �����ϴ�.
		System.out.println(v.get(0).getStr1()+","+v.get(0).getInt1());
		
		v.get(0).setStr1("BBB");
		System.out.println(v.get(0).getStr1());
	}
	
	public void testVector_4(){
		//���Ϳ��� ������ ���� �� �ε����θ� ������ �� �ִ°��� �ƴ϶�
		//���Ϳ� �ִ� �����͸� ã�� ������ �� �ִ�.
		//�׷��� ������ �ѹ��� �̷������ �ȴ�.
		//�������̳ĸ� ���� �����Ͱ� ������ �ִٸ� ���� �տ��ִ� ������ �ϳ��� �����Ѵٴ� ���̴�.
		Vector<String> v = new Vector<String>();
		v.add("AAA");
		v.add("BBB");
		v.add("CCC");
		v.add("AAA");
		v.add("AAA");
		
		v.remove("AAA");
		
		//���;ȿ� �ִ� ���� �����͸� ��� �����ϰ� �ʹٸ�
		//Collection ��ü�� ������ �����͸� ��� removeAll ���ָ�
		//�ش� ��� �����Ͱ� �����ȴ�.
		Vector v1 = new Vector();
		v1.add("AAA");
		v.removeAll(v1);
		
		System.out.println(v.size());
	}
	
	public void testVector_5(){
		Vector v = new Vector();
		v.add("AAA");
		v.add("BBB");
		v.add("CCC");
		v.add("DDD");
		v.add("EEE");
		
		//���Ϳ��� �����͸� ������� ��� �������� �ʹٸ�
		//for���� ����ϴ� ��찡 ���� ����
		
		//���� �⺻������ �̷��� ������ for���� ���� ����ϳ� 
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
		
		//Collection������ for���� ������ ���·ε� ����� �����ϴ�.
		//�̷��� ����ϰ� �Ǹ� ���Ϳ��� �׿��ִ� �����͸� �ϳ��� �������� �ȴ�.
		//Object�� ������ ������ ������ ���׸� Ÿ���� ���������� �ʾұ� �����̸�
		//���׸��� �������� ���Ϳ����� �� ������ Ÿ���� Ŭ������ �����ϸ� �ȴ�.
		for(Object item:v){ 
			System.out.println(item);
		}
	}
	
	public static void main(String[] args) {
		
		Test_01_Vector obj = new Test_01_Vector();
		obj.testVector_4();
	}
}
