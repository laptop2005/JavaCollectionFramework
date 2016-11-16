package com.test.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class TestList {
	
	public static void main(String[] args) {
		
		ArrayList scoreList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
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
		
	}
}
