package com.test.exercise;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
	public static void main(String[] args) {
		
		HashSet lottoSet = new HashSet();
		
		while(true){
			int lottoNumber = (int)(Math.random()*46) + 1;
			lottoSet.add(lottoNumber);
			if(lottoSet.size()>=6){
				break;
			}
		}
		
		Iterator itr = lottoSet.iterator();
		System.out.println("이번주 로또번호는?");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		/*
		 * 응용으로 로또 5천원어치 또는 돈을 낸 만큼 로또를 주는 프로그램을 만들어 보자
		 * */
	}
}
