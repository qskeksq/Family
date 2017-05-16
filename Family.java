package com.nadan.java.polymorphism;

import java.util.ArrayList;

public class Family {

	public static void main(String[] args) {
		
		//�÷��� �迭�� ���׸����� �θ� ��ü Ÿ���� �־��ش�. �̷��� �����ν� �迭�� ��� �ڽ� ��ü�� �־��� �� �ְ�,
		//get�� ���� ���� �޼ҵ带 ȣ���ϴ��� �ٸ� ����� ����� �� �ִ�!!
		ArrayList<Father> list = new ArrayList<>();
		Father father = new Father(); //�θ� ��ü
		Father son = new Son();  //�Ƶ� ��ü�� �θ� Ÿ������ �� ��ȯ
		Father daughter = new Daughter();  //�� ��ü�� �θ� Ÿ������ �� ��ȯ

		list.add(father);
		list.add(son);
		list.add(daughter);
		
		for(int i=0; i<list.size(); i++){
			list.get(i).goWork();
		}
		
		
		

	}

}
