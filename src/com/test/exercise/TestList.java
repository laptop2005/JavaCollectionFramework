package com.test.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class TestList {
/*
*****************************************
�����Է����α׷��� �����մϴ�.
*****************************************
*****************************************
1.�����Է�  2.������ȸ  3.����
*****************************************
1 <- �Է�
�л��̸� : 
ȫ�浿 <- �Է�
����� : 
90 <- �Է�
����� : 
50 <- �Է�
���м��� : 
70 <- �Է�
*****************************************
���� �Է��� �Ϸ�Ǿ����ϴ�.
*****************************************
*****************************************
1.�����Է�  2.������ȸ  3.����
*****************************************
1 <- �Է�
�л��̸� : 
������ <- �Է�
����� : 
80 <- �Է�
����� : 
90 <- �Է�
���м��� : 
80 <- �Է�
*****************************************
���� �Է��� �Ϸ�Ǿ����ϴ�.
*****************************************
*****************************************
1.�����Է�  2.������ȸ  3.����
*****************************************
2 <- �Է�
*****************************************
�̸�:ȫ�浿, ����: 90, ����: 50, ����:70
�̸�:������, ����: 80, ����: 90, ����:80
*****************************************
���� ��ȸ�� �Ϸ�Ǿ����ϴ�.
*****************************************
*****************************************
1.�����Է�  2.������ȸ  3.����
*****************************************
3 <- �Է�
*****************************************
���α׷��� �����մϴ�.
***************************************** 
 */	
	//���������� ���� ����Ʈ
	ArrayList<ScoreVO> scoreList;
	//����ڿ��� �Է¹ޱ� ���� ��ĳ��
	Scanner sc;
	
	//������
	public TestList(){
		//Ŭ���� �ν��Ͻ� ������ ������������Ʈ�� ��ĳ�ʸ� �ʱ�ȭ ���ش�.
		scoreList = new ArrayList<ScoreVO>();
		sc = new Scanner(System.in);
	}
	
	//���α׷� ����
	public void startProgram(){
		System.out.println("*****************************************");
		System.out.println("�����Է����α׷��� �����մϴ�.");
		System.out.println("*****************************************");
		
		//����ڰ� ���Ḧ ���� 3�� �Է��Ҷ����� ���α׷��� ����ؼ� ����Ǿ�� �ϱ� ������ while������ �ݺ�
		while(true){
			System.out.println("*****************************************");
			System.out.println("1.�����Է�  2.������ȸ  3.����");
			System.out.println("*****************************************");
			
			//����ڿ��� ���ڸ� �Է� �޴´�.
			int i = sc.nextInt();
			
			//����ڿ��� �Է¹��� ���ڷ� ��������
			switch(i){
			case 1: //�����Է�
				inputGrade();
				break;
			case 2: //������ȸ
				checkGrade();
				break;
			case 3: //����
				System.out.println("*****************************************");
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("*****************************************");
				break;
			default :
				System.out.println("*****************************************");
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				System.out.println("*****************************************");
			}
			
			//����ڰ� 3���� �Է��ߴٸ� ���α׷� ���Ḧ ���� while���� ���������� break
			if(i==3){
				break;
			}
		}
	}
	
	//�����Է�
	private void inputGrade(){
		//����ڷκ��� �л��� ���������� �Է¹޴´�.
		System.out.println("�л��̸� : ");
		String name = sc.next();
		System.out.println("����� : ");
		int korean = sc.nextInt();
		System.out.println("����� : ");
		int english = sc.nextInt();
		System.out.println("���м��� : ");
		int math = sc.nextInt();
		
		//����Ʈ�� ���������� ��� ���� ����VO�� ������ �ִ´�.
		ScoreVO vo = new ScoreVO();
		vo.setName(name);
		vo.setKorean(korean);
		vo.setEnglish(english);
		vo.setMath(math);
		
		//����Ʈ�� ���������� �߰�
		scoreList.add(vo);
		
		System.out.println("*****************************************");
		System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�.");
		System.out.println("*****************************************");
	}
	
	//������ȸ
	private void checkGrade(){
		System.out.println("*****************************************");
		//����Ʈ���� ���������� ������ ����Ѵ�.
		for(int inx=0;inx<scoreList.size();inx++){
			ScoreVO vo = (ScoreVO)scoreList.get(inx);
			System.out.println("�̸�:"+vo.getName()+", ����: "+vo.getKorean()+", ����: "+vo.getEnglish()+", ����:"+vo.getMath());
		}
		System.out.println("*****************************************");
		System.out.println("���� ��ȸ�� �Ϸ�Ǿ����ϴ�.");
		System.out.println("*****************************************");
	}
	
	public static void main(String[] args) {
		/*
		
		ArrayList<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****************************************");
		System.out.println("�����Է����α׷��� �����մϴ�.");
		System.out.println("*****************************************");
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
		*/
		
		TestList obj = new TestList();
		obj.startProgram();
	}
}
