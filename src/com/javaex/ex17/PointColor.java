package com.javaex.ex17;

public class PointColor extends Point implements Drawable {

	private String pointColor;

	public PointColor(int x, int y) {
		super(x, y);
	}

	public PointColor(int x, int y, String pointColor) {
		super(x, y);
		this.pointColor = pointColor;
	}

	public void draw() {
		System.out.println("====점과 색을 그렸습니다.====");
		System.out.println("x :" + getX());
		System.out.println("y :" + getY());
		System.out.println("점색 :" + pointColor);
		System.out.println("====================");
	}

}
