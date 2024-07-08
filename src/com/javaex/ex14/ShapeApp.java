package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		//배열
		Rectangle[] rectArr = new Rectangle[3];
		Circle[] cArr = new Circle[3];

		Rectangle s01 = new Rectangle(3, 3, "빨강", "노랑");
		Rectangle s02 = new Rectangle(10, 12, "노랑", "검정");
		Rectangle s03 = new Rectangle(15, 2, "파랑", "빨강");

		rectArr[0] = s01;
		rectArr[1] = s02;
		rectArr[2] = s03;

		for (int i = 0; i < rectArr.length; i++) {
			rectArr[i].draw();
		}

		Circle c01 = new Circle(3, "빨강", "노랑");
		Circle c02 = new Circle(10, "노랑", "검정");
		Circle c03 = new Circle(15, "파랑", "빨강");

		cArr[0] = c01;
		cArr[1] = c02;
		cArr[2] = c03;

		for (int i = 0; i < cArr.length; i++) {
			cArr[i].draw();
		}
	}
}
