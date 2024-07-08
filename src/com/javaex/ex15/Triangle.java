package com.javaex.ex15;

public class Triangle extends Shape{

	private int width;
	private int height;

	public Triangle() {
	}

	public Triangle(int width, int height,String fillColor, String lineColor) {
		super(fillColor,lineColor);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public void draw() {
		System.out.println("====삼각형을 그렸습니다.====");
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("면색 : " + fillColor);
		System.out.println("선색 : " + lineColor);
		System.out.println("======================");
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
	
	
}
