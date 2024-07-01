package com.javaex.ex02;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.price = 1000000;
		
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		
		
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		
		
		System.out.println("상품이름 : "+computer.name+"\t"+"가격 :"+computer.price);
		System.out.println("상품이름 : "+cup.name+"\t"+"가격 :"+cup.price);
		System.out.println("상품이름 : "+camera.name+"\t"+"가격 :"+camera.price);
	}

}
