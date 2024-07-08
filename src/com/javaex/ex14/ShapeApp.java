package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		
		//3 3 빨강 노랑

		Rectangle s01 = new Rectangle(3, 3, "빨강", "노랑");
		Rectangle s02 = new Rectangle(10, 12, "노랑", "검정");
		Rectangle s03 = new Rectangle(15, 2, "파랑", "빨강");
		
//		System.out.println(s01.toString());
//		System.out.println(s01.toString());
//		System.out.println(s01.toString());
		
		s01.draw();
		s02.draw();
		s03.draw();
		
		Circle c01 = new Circle(3, "빨강", "노랑");
		Circle c02 = new Circle(10, "노랑", "검정");
		Circle c03 = new Circle(15, "파랑", "빨강");
		
		c01.draw();
		c02.draw();
		c03.draw();
		
	}
}
