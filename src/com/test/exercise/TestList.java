package com.test.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class TestList {
/*
*****************************************
성적입력프로그램을 시작합니다.
*****************************************
*****************************************
1.성적입력  2.성적조회  3.종료
*****************************************
1 <- 입력
학생이름 : 
홍길동 <- 입력
국어성적 : 
90 <- 입력
영어성적 : 
50 <- 입력
수학성적 : 
70 <- 입력
*****************************************
성적 입력이 완료되었습니다.
*****************************************
*****************************************
1.성적입력  2.성적조회  3.종료
*****************************************
1 <- 입력
학생이름 : 
성춘향 <- 입력
국어성적 : 
80 <- 입력
영어성적 : 
90 <- 입력
수학성적 : 
80 <- 입력
*****************************************
성적 입력이 완료되었습니다.
*****************************************
*****************************************
1.성적입력  2.성적조회  3.종료
*****************************************
2 <- 입력
*****************************************
이름:홍길동, 국어: 90, 영어: 50, 수학:70
이름:성춘향, 국어: 80, 영어: 90, 수학:80
*****************************************
성적 조회가 완료되었습니다.
*****************************************
*****************************************
1.성적입력  2.성적조회  3.종료
*****************************************
3 <- 입력
*****************************************
프로그램을 종료합니다.
***************************************** 
 */	
	//성적정보를 담을 리스트
	ArrayList<ScoreVO> scoreList;
	//사용자에게 입력받기 위한 스캐너
	Scanner sc;
	
	//생성자
	public TestList(){
		//클래스 인스턴스 생성시 성적정보리스트와 스캐너를 초기화 해준다.
		scoreList = new ArrayList<ScoreVO>();
		sc = new Scanner(System.in);
	}
	
	//프로그램 시작
	public void startProgram(){
		System.out.println("*****************************************");
		System.out.println("성적입력프로그램을 시작합니다.");
		System.out.println("*****************************************");
		
		//사용자가 종료를 위해 3을 입력할때까지 프로그램은 계속해서 실행되어야 하기 때문에 while문으로 반복
		while(true){
			System.out.println("*****************************************");
			System.out.println("1.성적입력  2.성적조회  3.종료");
			System.out.println("*****************************************");
			
			//사용자에게 숫자를 입력 받는다.
			int i = sc.nextInt();
			
			//사용자에게 입력받은 숫자로 업무수행
			switch(i){
			case 1: //성적입력
				inputGrade();
				break;
			case 2: //성적조회
				checkGrade();
				break;
			case 3: //종료
				System.out.println("*****************************************");
				System.out.println("프로그램을 종료합니다.");
				System.out.println("*****************************************");
				break;
			default :
				System.out.println("*****************************************");
				System.out.println("잘못 입력하셨습니다");
				System.out.println("*****************************************");
			}
			
			//사용자가 3번을 입력했다면 프로그램 종료를 위해 while문을 빠져나가는 break
			if(i==3){
				break;
			}
		}
	}
	
	//성적입력
	private void inputGrade(){
		//사용자로부터 학생의 성적정보를 입력받는다.
		System.out.println("학생이름 : ");
		String name = sc.next();
		System.out.println("국어성적 : ");
		int korean = sc.nextInt();
		System.out.println("영어성적 : ");
		int english = sc.nextInt();
		System.out.println("수학성적 : ");
		int math = sc.nextInt();
		
		//리스트에 성적정보를 담기 위해 성적VO에 정보를 넣는다.
		ScoreVO vo = new ScoreVO();
		vo.setName(name);
		vo.setKorean(korean);
		vo.setEnglish(english);
		vo.setMath(math);
		
		//리스트에 성적정보를 추가
		scoreList.add(vo);
		
		System.out.println("*****************************************");
		System.out.println("성적 입력이 완료되었습니다.");
		System.out.println("*****************************************");
	}
	
	//성적조회
	private void checkGrade(){
		System.out.println("*****************************************");
		//리스트에서 성적정보를 가져와 출력한다.
		for(int inx=0;inx<scoreList.size();inx++){
			ScoreVO vo = (ScoreVO)scoreList.get(inx);
			System.out.println("이름:"+vo.getName()+", 국어: "+vo.getKorean()+", 영어: "+vo.getEnglish()+", 수학:"+vo.getMath());
		}
		System.out.println("*****************************************");
		System.out.println("성적 조회가 완료되었습니다.");
		System.out.println("*****************************************");
	}
	
	public static void main(String[] args) {
		/*
		
		ArrayList<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****************************************");
		System.out.println("성적입력프로그램을 시작합니다.");
		System.out.println("*****************************************");
		while(true){
			System.out.println("*****************************************");
			System.out.println("1.성적입력  2.성적조회  3.종료");
			System.out.println("*****************************************");
			
			int i = sc.nextInt();
			if(i==1){
				System.out.println("학생이름 : ");
				String name = sc.next();
				System.out.println("국어성적 : ");
				int korean = sc.nextInt();
				System.out.println("영어성적 : ");
				int english = sc.nextInt();
				System.out.println("수학성적 : ");
				int math = sc.nextInt();
				
				ScoreVO vo = new ScoreVO();
				vo.setName(name);
				vo.setKorean(korean);
				vo.setEnglish(english);
				vo.setMath(math);
				
				scoreList.add(vo);
				
				System.out.println("*****************************************");
				System.out.println("성적 입력이 완료되었습니다.");
				System.out.println("*****************************************");
				
			}else if(i==2){
				System.out.println("*****************************************");
				for(int inx=0;inx<scoreList.size();inx++){
					ScoreVO vo = (ScoreVO)scoreList.get(inx);
					System.out.println("이름:"+vo.getName()+", 국어: "+vo.getKorean()+", 영어: "+vo.getEnglish()+", 수학:"+vo.getMath());
				}
				System.out.println("*****************************************");
				System.out.println("성적 조회가 완료되었습니다.");
				System.out.println("*****************************************");
			}else if(i==3){
				System.out.println("*****************************************");
				System.out.println("프로그램을 종료합니다.");
				System.out.println("*****************************************");
				break;
			}else{
				System.out.println("*****************************************");
				System.out.println("잘못 입력하셨습니다");
				System.out.println("*****************************************");
			}
		}
		*/
		
		TestList obj = new TestList();
		obj.startProgram();
	}
}
