package com.test.exercise;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
	
	//로또번호를 담을 HashSet
	HashSet<Integer> lottoSet;
	
	//생성자
	public TestSet(){
		lottoSet = new HashSet<Integer>();
	}
	
	//프로그램 시작
	public void startProgram(){
		//로또번호 생성하기
		getLotto();
		//로또번호 출력하기
		printLotto();
	}
	
	//로또번호 생성하기
	private void getLotto(){
		while(true){
			int lottoNumber = (int)(Math.random()*46) + 1;
			
			//HashSet에는 중복된 데이터가 들어가지 않는다. 따라서 로또번호가 중복되었다면 lottoSet에는 로또번호가 들어가지 않는다.
			lottoSet.add(lottoNumber);
			
			//lottoSet의 크기가 6이면 중복되지 않은 로또번호를 6개 모두 모았으므로 로또번호 생성을 종료
			if(lottoSet.size()>=6){
				break;
			}
		}
	}
	
	//로또번호 출력하기
	private void printLotto(){
		//로또번호를 하나씩 가져오기 위해 Iterator로 변환
		Iterator<Integer> itr = lottoSet.iterator();
		
		System.out.println("이번주 로또번호는?");
		
		//Iterator가 hasNext()(다음 로또번호가 있는가) 가 true인 동안 로또번호를 하나씩 가져와 출력해준다.
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		/*
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		
		while(true){
			int lottoNumber = (int)(Math.random()*46) + 1;
			lottoSet.add(lottoNumber);
			if(lottoSet.size()>=6){
				break;
			}
		}
		
		Iterator<Integer> itr = lottoSet.iterator();
		System.out.println("이번주 로또번호는?");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		*/
		
		TestSet obj = new TestSet();
		obj.startProgram();
		
		/*
		 * 응용으로 로또 5천원어치 또는 돈을 낸 만큼 로또를 주는 프로그램을 만들어 보자
		 * */
	}
}
