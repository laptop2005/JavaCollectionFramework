package com.test.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class TestList {
	
	public static void main(String[] args) {
		
		ArrayList scoreList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("*****************************************");
			System.out.println("1.�����Է�  2.������ȸ  3.����");
			System.out.println("*****************************************");
			
			int i = sc.nextInt();
			if(i==1){
				System.out.println("�л��̸� : ");
				String name = sc.next();
				System.out.println("����� : ");
				int korean = sc.nextInt();
				System.out.println("����� : ");
				int english = sc.nextInt();
				System.out.println("���м��� : ");
				int math = sc.nextInt();
				
				ScoreVO vo = new ScoreVO();
				vo.setName(name);
				vo.setKorean(korean);
				vo.setEnglish(english);
				vo.setMath(math);
				
				scoreList.add(vo);
				
				System.out.println("*****************************************");
				System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�.");
				System.out.println("*****************************************");
				
			}else if(i==2){
				System.out.println("*****************************************");
				for(int inx=0;inx<scoreList.size();inx++){
					ScoreVO vo = (ScoreVO)scoreList.get(inx);
					System.out.println("�̸�:"+vo.getName()+", ����: "+vo.getKorean()+", ����: "+vo.getEnglish()+", ����:"+vo.getMath());
				}
				System.out.println("*****************************************");
				System.out.println("���� ��ȸ�� �Ϸ�Ǿ����ϴ�.");
				System.out.println("*****************************************");
			}else if(i==3){
				System.out.println("*****************************************");
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("*****************************************");
				break;
			}else{
				System.out.println("*****************************************");
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				System.out.println("*****************************************");
			}
		}
		
	}
}
