package com.javaex.ex17;

public class Rectangle extends Shape implements Drawable{

	private int width;
	private int height;

	public Rectangle() {
	}

	public Rectangle(int width, int height,String fillColor, String lineColor) {
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
		System.out.println("====사각형을 그렸습니다.====");
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("면색 : " + fillColor);
		System.out.println("선색 : " + lineColor);
		System.out.println("넓이 : " + area());
		System.out.println("======================");
	}

	public double area() {
		return width*height;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
	
	
}
