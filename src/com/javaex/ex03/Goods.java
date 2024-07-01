package com.javaex.ex03;

public class Goods {
	
	private String name;
	private int price;

	public Goods(String n, int i) {
		name = n;
		price = i;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int i) {
		price = i;
	}

	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		
		System.out.println("상품명 : " + getName() + "\t" + "가격 : " + getPrice());
		
	}
}
