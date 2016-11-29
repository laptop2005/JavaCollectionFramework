package com.test.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestMap {
	
	/*
**************************
호텔 문을 열었습니다.
**************************
**************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
**************************
1 <-- 입력
어느방에 체크인 하시겠습니까?
101 <-- 입력
누구를 체크인 하시겠습니까?
홍길동 <-- 입력
체크인 되었습니다
**************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
**************************
1 <-- 입력
어느방에 체크인 하시겠습니까?
102 <-- 입력
누구를 체크인 하시겠습니까?
성춘향 <-- 입력
체크인 되었습니다
**************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
**************************
3 <-- 입력
방번호 : 102, 투숙객 : 성춘향
방번호 : 101, 투숙객 : 홍길동
**************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
**************************
2 <-- 입력
어느방을 체크아웃 하시겠습니까?
101 <-- 입력
체크아웃 되었습니다.
**************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
**************************
1 <-- 입력
어느방에 체크인 하시겠습니까?
102 <-- 입력
누구를 체크인 하시겠습니까?
허준 <-- 입력
102방에는 이미 사람이 있습니다.
**************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
**************************
2 <-- 입력
어느방을 체크아웃 하시겠습니까?
101 <-- 입력
101방에는 체크인한 사람이 없습니다.
**************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
**************************
3 <-- 입력
방번호 : 102, 투숙객 : 성춘향
**************************
어떤 업무를 하시겠습니까?
1.체크인  2.체크아웃 3.객실상태 4.업무종료
**************************
4 <-- 입력
**************************
호텔 문을 닫았습니다.
**************************
	 */
	//호텔의 방번호와 투숙객을 저장할 HashMap
	HashMap<String,String> hotelMap;
	//사용자에게 입력받기 위한 Scanner
	Scanner sc;
	
	//생성자
	public TestMap(){
		//클래스 인스턴스 생성시 호텔맵과 스캐너를 초기화 해준다.
		hotelMap = new HashMap<String,String>();
		sc = new Scanner(System.in);
	}
	
	//프로그램 시작
	public void startProgram(){
		System.out.println("**************************");
		System.out.println("호텔 문을 열었습니다.");
		System.out.println("**************************");
		
		//업무종료 입력시 프로그램을 끝내기 위해 while문을 빠져나와야 하기 때문에 while문에 이름을 붙여준다.
		loopWhile : while(true){
			System.out.println("**************************");
			System.out.println("어떤 업무를 하시겠습니까?");
			System.out.println("1.체크인  2.체크아웃 3.객실상태 4.업무종료");
			System.out.println("**************************");
			
			//사용자로부터 입력받기
			int i = sc.nextInt();
			
			//사용자에게 입력받은 숫자로 업무를 수행한다
			switch(i){
			case 1: //체크인
				checkIn();
				break;
			case 2: //체크아웃
				checkOut();
				break;
			case 3: //객실상태
				roomStatus();
				break;
			case 4: //업무종료
				System.out.println("**************************");
				System.out.println("호텔 문을 닫았습니다.");
				System.out.println("**************************");
				//while문의 이름을 break하여 상위의 반복무을 빠져나간다.
				break loopWhile;
			default :
				System.out.println("**************************");
				System.out.println("잘못입력 하셨습니다");
				System.out.println("**************************");
			}
		}
	}
	
	//체크인
	private void checkIn(){
		System.out.println("어느방에 체크인 하시겠습니까?");
		String roomNum = sc.next();
		System.out.println("누구를 체크인 하시겠습니까?");
		String personName = sc.next();
		
		//호텔맵에 같은 키(방번호)가 있다면 이미 체크인한 객실이므로 방에 이미 사람이 있다고 출력해주고
		//같은 키가 없을 경우는 비어있는 방이므로 호텔맵에 새로 등록해준다
		if(hotelMap.containsKey(roomNum)){
			System.out.println(roomNum + "방에는 이미 사람이 있습니다.");
		}else{
			hotelMap.put(roomNum, personName);
			System.out.println("체크인 되었습니다");
		}
	}
	
	//체크아웃
	private void checkOut(){
		System.out.println("어느방을 체크아웃 하시겠습니까?");
		String roomNum = sc.next();
		
		//호텔맵에 같은 키(방번호)가 있다면 체크인 된 객실이므로 체크아웃을 할 수 있으나
		//방번호가 존재하지 않으면 체크인 한적이 없는 객실이므로 체크아웃을 할 사람이 없다고 출력해준다.
		if(hotelMap.containsKey(roomNum)){
			hotelMap.remove(roomNum);
			System.out.println("체크아웃 되었습니다.");
		}else{
			System.out.println(roomNum + "방에는 체크인한 사람이 없습니다.");
		}
	}
	
	//객실상태
	private void roomStatus(){
		//호텔맵으로부터 키셋을 받아온다. 이 키셋은 방번호 셋트 이다.
		Set<String> keySet = hotelMap.keySet();
		
		//방번호를 하나씩 가져오기 위해 Iterator로 변환한다.
		Iterator<String> itr = keySet.iterator();
		
		//Iterator가 hasNext()(다음 방번호가 있는가) 가 true인 동안 방번호를 하나씩 가져와 출력해준다.
		while(itr.hasNext()){
			String roomNumber = itr.next().toString();
			String personName = hotelMap.get(roomNumber).toString();
			System.out.println("방번호 : "+roomNumber+", 투숙객 : "+personName);
		}
	}
	
	public static void main(String[] args) {
		/*
		HashMap<String,String> hotelMap = new HashMap<String,String>();
		
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
				Set<String> keySet = hotelMap.keySet();
				Iterator<String> itr = keySet.iterator();
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
		*/
		
		TestMap obj = new TestMap();
		obj.startProgram();
	}
}
