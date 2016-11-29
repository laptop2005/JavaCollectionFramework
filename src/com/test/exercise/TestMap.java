package com.test.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestMap {
	
	/*
**************************
ȣ�� ���� �������ϴ�.
**************************
**************************
� ������ �Ͻðڽ��ϱ�?
1.üũ��  2.üũ�ƿ� 3.���ǻ��� 4.��������
**************************
1 <-- �Է�
����濡 üũ�� �Ͻðڽ��ϱ�?
101 <-- �Է�
������ üũ�� �Ͻðڽ��ϱ�?
ȫ�浿 <-- �Է�
üũ�� �Ǿ����ϴ�
**************************
� ������ �Ͻðڽ��ϱ�?
1.üũ��  2.üũ�ƿ� 3.���ǻ��� 4.��������
**************************
1 <-- �Է�
����濡 üũ�� �Ͻðڽ��ϱ�?
102 <-- �Է�
������ üũ�� �Ͻðڽ��ϱ�?
������ <-- �Է�
üũ�� �Ǿ����ϴ�
**************************
� ������ �Ͻðڽ��ϱ�?
1.üũ��  2.üũ�ƿ� 3.���ǻ��� 4.��������
**************************
3 <-- �Է�
���ȣ : 102, ������ : ������
���ȣ : 101, ������ : ȫ�浿
**************************
� ������ �Ͻðڽ��ϱ�?
1.üũ��  2.üũ�ƿ� 3.���ǻ��� 4.��������
**************************
2 <-- �Է�
������� üũ�ƿ� �Ͻðڽ��ϱ�?
101 <-- �Է�
üũ�ƿ� �Ǿ����ϴ�.
**************************
� ������ �Ͻðڽ��ϱ�?
1.üũ��  2.üũ�ƿ� 3.���ǻ��� 4.��������
**************************
1 <-- �Է�
����濡 üũ�� �Ͻðڽ��ϱ�?
102 <-- �Է�
������ üũ�� �Ͻðڽ��ϱ�?
���� <-- �Է�
102�濡�� �̹� ����� �ֽ��ϴ�.
**************************
� ������ �Ͻðڽ��ϱ�?
1.üũ��  2.üũ�ƿ� 3.���ǻ��� 4.��������
**************************
2 <-- �Է�
������� üũ�ƿ� �Ͻðڽ��ϱ�?
101 <-- �Է�
101�濡�� üũ���� ����� �����ϴ�.
**************************
� ������ �Ͻðڽ��ϱ�?
1.üũ��  2.üũ�ƿ� 3.���ǻ��� 4.��������
**************************
3 <-- �Է�
���ȣ : 102, ������ : ������
**************************
� ������ �Ͻðڽ��ϱ�?
1.üũ��  2.üũ�ƿ� 3.���ǻ��� 4.��������
**************************
4 <-- �Է�
**************************
ȣ�� ���� �ݾҽ��ϴ�.
**************************
	 */
	//ȣ���� ���ȣ�� �������� ������ HashMap
	HashMap<String,String> hotelMap;
	//����ڿ��� �Է¹ޱ� ���� Scanner
	Scanner sc;
	
	//������
	public TestMap(){
		//Ŭ���� �ν��Ͻ� ������ ȣ�ڸʰ� ��ĳ�ʸ� �ʱ�ȭ ���ش�.
		hotelMap = new HashMap<String,String>();
		sc = new Scanner(System.in);
	}
	
	//���α׷� ����
	public void startProgram(){
		System.out.println("**************************");
		System.out.println("ȣ�� ���� �������ϴ�.");
		System.out.println("**************************");
		
		//�������� �Է½� ���α׷��� ������ ���� while���� �������;� �ϱ� ������ while���� �̸��� �ٿ��ش�.
		loopWhile : while(true){
			System.out.println("**************************");
			System.out.println("� ������ �Ͻðڽ��ϱ�?");
			System.out.println("1.üũ��  2.üũ�ƿ� 3.���ǻ��� 4.��������");
			System.out.println("**************************");
			
			//����ڷκ��� �Է¹ޱ�
			int i = sc.nextInt();
			
			//����ڿ��� �Է¹��� ���ڷ� ������ �����Ѵ�
			switch(i){
			case 1: //üũ��
				checkIn();
				break;
			case 2: //üũ�ƿ�
				checkOut();
				break;
			case 3: //���ǻ���
				roomStatus();
				break;
			case 4: //��������
				System.out.println("**************************");
				System.out.println("ȣ�� ���� �ݾҽ��ϴ�.");
				System.out.println("**************************");
				//while���� �̸��� break�Ͽ� ������ �ݺ����� ����������.
				break loopWhile;
			default :
				System.out.println("**************************");
				System.out.println("�߸��Է� �ϼ̽��ϴ�");
				System.out.println("**************************");
			}
		}
	}
	
	//üũ��
	private void checkIn(){
		System.out.println("����濡 üũ�� �Ͻðڽ��ϱ�?");
		String roomNum = sc.next();
		System.out.println("������ üũ�� �Ͻðڽ��ϱ�?");
		String personName = sc.next();
		
		//ȣ�ڸʿ� ���� Ű(���ȣ)�� �ִٸ� �̹� üũ���� �����̹Ƿ� �濡 �̹� ����� �ִٰ� ������ְ�
		//���� Ű�� ���� ���� ����ִ� ���̹Ƿ� ȣ�ڸʿ� ���� ������ش�
		if(hotelMap.containsKey(roomNum)){
			System.out.println(roomNum + "�濡�� �̹� ����� �ֽ��ϴ�.");
		}else{
			hotelMap.put(roomNum, personName);
			System.out.println("üũ�� �Ǿ����ϴ�");
		}
	}
	
	//üũ�ƿ�
	private void checkOut(){
		System.out.println("������� üũ�ƿ� �Ͻðڽ��ϱ�?");
		String roomNum = sc.next();
		
		//ȣ�ڸʿ� ���� Ű(���ȣ)�� �ִٸ� üũ�� �� �����̹Ƿ� üũ�ƿ��� �� �� ������
		//���ȣ�� �������� ������ üũ�� ������ ���� �����̹Ƿ� üũ�ƿ��� �� ����� ���ٰ� ������ش�.
		if(hotelMap.containsKey(roomNum)){
			hotelMap.remove(roomNum);
			System.out.println("üũ�ƿ� �Ǿ����ϴ�.");
		}else{
			System.out.println(roomNum + "�濡�� üũ���� ����� �����ϴ�.");
		}
	}
	
	//���ǻ���
	private void roomStatus(){
		//ȣ�ڸ����κ��� Ű���� �޾ƿ´�. �� Ű���� ���ȣ ��Ʈ �̴�.
		Set<String> keySet = hotelMap.keySet();
		
		//���ȣ�� �ϳ��� �������� ���� Iterator�� ��ȯ�Ѵ�.
		Iterator<String> itr = keySet.iterator();
		
		//Iterator�� hasNext()(���� ���ȣ�� �ִ°�) �� true�� ���� ���ȣ�� �ϳ��� ������ ������ش�.
		while(itr.hasNext()){
			String roomNumber = itr.next().toString();
			String personName = hotelMap.get(roomNumber).toString();
			System.out.println("���ȣ : "+roomNumber+", ������ : "+personName);
		}
	}
	
	public static void main(String[] args) {
		/*
		HashMap<String,String> hotelMap = new HashMap<String,String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**************************");
		System.out.println("ȣ�� ���� �������ϴ�.");
		System.out.println("**************************");
		while(true){
			System.out.println("**************************");
			System.out.println("� ������ �Ͻðڽ��ϱ�?");
			System.out.println("1.üũ��  2.üũ�ƿ� 3.���ǻ��� 4.��������");
			System.out.println("**************************");
			
			int i = sc.nextInt();
			if(i==1){
				System.out.println("����濡 üũ�� �Ͻðڽ��ϱ�?");
				String roomNum = sc.next();
				System.out.println("������ üũ�� �Ͻðڽ��ϱ�?");
				String personName = sc.next();
				
				if(hotelMap.containsKey(roomNum)){
					System.out.println(roomNum + "�濡�� �̹� ����� �ֽ��ϴ�.");
				}else{
					hotelMap.put(roomNum, personName);
					System.out.println("üũ�� �Ǿ����ϴ�");
				}
				
			}else if(i==2){
				System.out.println("������� üũ�ƿ� �Ͻðڽ��ϱ�?");
				String roomNum = sc.next();
				
				if(hotelMap.containsKey(roomNum)){
					hotelMap.remove(roomNum);
					System.out.println("üũ�ƿ� �Ǿ����ϴ�.");
				}else{
					System.out.println(roomNum + "�濡�� üũ���� ����� �����ϴ�.");
				}
				
			}else if(i==3){
				Set<String> keySet = hotelMap.keySet();
				Iterator<String> itr = keySet.iterator();
				while(itr.hasNext()){
					String roomNumber = itr.next().toString();
					String personName = hotelMap.get(roomNumber).toString();
					System.out.println("���ȣ : "+roomNumber+", ������ : "+personName);
				}
			}else if(i==4){
				System.out.println("**************************");
				System.out.println("ȣ�� ���� �ݾҽ��ϴ�.");
				System.out.println("**************************");
				break;
			}else{
				System.out.println("**************************");
				System.out.println("�߸��Է� �ϼ̽��ϴ�");
				System.out.println("**************************");
			}
		}
		*/
		
		TestMap obj = new TestMap();
		obj.startProgram();
	}
}
