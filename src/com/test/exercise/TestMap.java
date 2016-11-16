package com.test.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		HashMap hotelMap = new HashMap();
		
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
				Set keySet = hotelMap.keySet();
				Iterator itr = keySet.iterator();
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
			
	}
}
