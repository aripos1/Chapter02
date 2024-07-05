package com.javaex.ex09;

public class Goods {

	private String name;
	private int price;
	public static int count;
	
	public Goods() {

	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		
		count++;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}



}
