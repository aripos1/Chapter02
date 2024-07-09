package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {

		// 도형 배열
		Shape[] sArr = new Shape[3];

		// 도형
		Shape s01 = new Rectangle(3, 3, "빨강", "노랑");
		Shape s02 = new Circle(3, "빨강", "노랑");
		Shape s03 = new Triangle(10,20, "빨강", "노랑");
		
		sArr[0] = s01;
		sArr[1] = s02;
		sArr[2] = s03;
		
		System.out.println(sArr[0].toString());
		System.out.println(sArr[1].toString());
		System.out.println(sArr[2].toString());
		
		for(int i = 0; i <sArr.length; i++) {
			sArr[i].draw();
		}
		
		for(int i = 0; i <sArr.length; i++) {
			sArr[i].area();
		}
		
		System.out.println(((Circle)s02).getRadius());
		
		System.out.println(((Rectangle)s01).getHeight());
		
		// 배열
//		Rectangle[] rArr = new Rectangle[3];
//		Circle[] cArr = new Circle[3];
//		Triangle[] tArr = new Triangle[3];
//		// 사각형
//		Rectangle r01 = new Rectangle(3, 3, "빨강", "노랑");
//		Rectangle r02 = new Rectangle(10, 12, "노랑", "검정");
//		Rectangle r03 = new Rectangle(15, 2, "파랑", "빨강");
//
//		rArr[0] = r01;
//		rArr[1] = r02;
//		rArr[2] = r03;
//
//		for (int i = 0; i < rArr.length; i++) {
//			rArr[i].draw();
//		}
//
//		Circle c01 = new Circle(3, "빨강", "노랑");
//		Circle c02 = new Circle(10, "노랑", "검정");
//		Circle c03 = new Circle(15, "파랑", "빨강");
//
//		cArr[0] = c01;
//		cArr[1] = c02;
//		cArr[2] = c03;
//
//		for (int i = 0; i < cArr.length; i++) {
//			cArr[i].draw();
//		}
//		Triangle t01 = new Triangle(3, 3, "빨강", "노랑");
//		Triangle t02 = new Triangle(10, 12, "노랑", "검정");
//		Triangle t03 = new Triangle(15, 2, "파랑", "빨강");
//
//		tArr[0] = t01;
//		tArr[1] = t02;
//		tArr[2] = t03;
//
////		for (int i = 0; i < tArr.length; i++) {
////			tArr[i].draw();
////
////		}
	}
}
