package com.nadan.java.polymorphism;

import java.util.ArrayList;

public class Family {

	public static void main(String[] args) {
		
		//컬렉션 배열에 제네릭으로 부모 객체 타입을 넣어준다. 이렇게 함으로써 배열에 모든 자식 객체를 넣어줄 수 있고,
		//get을 통해 같은 메소드를 호출하더라도 다른 결과를 출력할 수 있다!!
		ArrayList<Father> list = new ArrayList<>();
		Father father = new Father(); //부모 객체
		Father son = new Son();  //아들 객체를 부모 타입으로 형 변환
		Father daughter = new Daughter();  //딸 객체를 부모 타입으로 형 변환

		list.add(father);
		list.add(son);
		list.add(daughter);
		
		for(int i=0; i<list.size(); i++){
			list.get(i).goWork();
		}
		
		
		

	}

}
