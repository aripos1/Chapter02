package com.javaex.ex18;

public class Point {

	public int x;
	public int y;
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public final int getX() {
		return x;
	}
	public final void setX(int x) {
		this.x = x;
	}
	public final int getY() {
		return y;
	}
	public final void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("점을 그렸습니다.");
		System.out.println(x+","+y);
		System.out.println("=============");
	}
	
	
}
