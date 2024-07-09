package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

		Drawable[] dArr = new Drawable[5];
		
		Drawable d01 = new Rectangle(3,3,"빨강","노랑");
		Drawable d02 = new Circle(4,"빨강","노랑");
		Drawable d03 = new Triangle(5,10,"빨강","노랑");
		Drawable d04 = new Point(15,20);
		Drawable d05 = new PointColor(1,2,"검정");
		
		dArr[0] = d01;
		dArr[1] = d02;
		dArr[2] = d03;
		dArr[3] = d04;
		dArr[4] = d05;

		
		for(int i=0;i<dArr.length;i++) {
			dArr[i].draw();
		}
	}
}
