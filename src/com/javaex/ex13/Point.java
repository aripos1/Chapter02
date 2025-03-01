package com.javaex.ex13;

public class Point {

	protected int x;
	protected int y;

	public Point() {

	}

	public Point(int x,int y) {
		this.x =x;
		this.y =y;
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
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void showInfo() {

		System.out.println(x+","+y);
	}

}
