package com.javaex.ex04;

public class Point {

	private int x, y;

	public void setX(int a) {
		x = a;
	}

	public void setY(int b) {
		y = b;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;

	}

	public void draw() {
		System.out.println("점 [x="+getX()+", y="+getY()+"]을 그렸습니다.");
	}
	
}
