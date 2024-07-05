package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {

		Goods computer = new Goods("LG그램", 100000);
		Goods cup = new Goods("머그컵", 2000);
		Goods camera = new Goods("니콘",40000);
		
		Goods[] goodsArr = new Goods[3];

		goodsArr[0] = computer;
		goodsArr[1] = cup;
		goodsArr[2] = camera;
		

		for (int i = 0; i < goodsArr.length; i++) {

			System.out.println(goodsArr[i].showInfo());
//		System.out.println(computer.toString());
//		System.out.println(cup.toString());
		}
	}

}
