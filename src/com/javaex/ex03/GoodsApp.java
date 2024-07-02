package com.javaex.ex03;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods[] p = new Goods[3];
		p[0] = new Goods("LG그램", 1000000);
		p[1] = new Goods("니콘", 400000);
		p[2] = new Goods("머그컵", 2000);

		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 상품의 숫자를 입력하세요.");
		System.out.println("1.컴퓨터 2.카메라 3.컵");
		int num = sc.nextInt();

		if (num >= 1 && num <= 3) {
			Goods selected = p[num - 1];
//			System.out.println("상품명 : " + selectedGoods.getName() + "\t" + "가격 : " + selectedGoods.getPrice());
			System.out.println(selected.toString());
		} else {
			System.out.println("다시 입력해주세요.");
		}
		sc.close();

	}

}
