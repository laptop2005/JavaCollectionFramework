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
		System.out.println("호텔 문을 열었습니다.");
		System.out.println("**************************");
		while(true){
			System.out.println("**************************");
			System.out.println("어떤 업무를 하시겠습니까?");
			System.out.println("1.체크인  2.체크아웃 3.객실상태 4.업무종료");
			System.out.println("**************************");
			
			int i = sc.nextInt();
			if(i==1){
				System.out.println("어느방에 체크인 하시겠습니까?");
				String roomNum = sc.next();
				System.out.println("누구를 체크인 하시겠습니까?");
				String personName = sc.next();
				
				if(hotelMap.containsKey(roomNum)){
					System.out.println(roomNum + "방에는 이미 사람이 있습니다.");
				}else{
					hotelMap.put(roomNum, personName);
					System.out.println("체크인 되었습니다");
				}
				
			}else if(i==2){
				System.out.println("어느방을 체크아웃 하시겠습니까?");
				String roomNum = sc.next();
				
				if(hotelMap.containsKey(roomNum)){
					hotelMap.remove(roomNum);
					System.out.println("체크아웃 되었습니다.");
				}else{
					System.out.println(roomNum + "방에는 체크인한 사람이 없습니다.");
				}
				
			}else if(i==3){
				Set keySet = hotelMap.keySet();
				Iterator itr = keySet.iterator();
				while(itr.hasNext()){
					String roomNumber = itr.next().toString();
					String personName = hotelMap.get(roomNumber).toString();
					System.out.println("방번호 : "+roomNumber+", 투숙객 : "+personName);
				}
			}else if(i==4){
				System.out.println("**************************");
				System.out.println("호텔 문을 닫았습니다.");
				System.out.println("**************************");
				break;
			}else{
				System.out.println("**************************");
				System.out.println("잘못입력 하셨습니다");
				System.out.println("**************************");
			}
		}
			
	}
}
