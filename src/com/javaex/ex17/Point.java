package com.javaex.ex17;

public class Point extends Shape implements Drawable{

	private int x;
	private int y;
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("====점을 그렸습니다.====");
		System.out.println("x :"+ x);
		System.out.println("y :"+ y);
		System.out.println("====================");
	}

	@Override
	public double area() {
		return 0;
	}
	
	
}
