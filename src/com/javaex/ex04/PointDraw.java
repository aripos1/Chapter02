package com.javaex.ex04;

public class PointDraw {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		
		
		p1.setX(3);
		p1.setY(5);
		
		p2.setX(10);
		p2.setY(23);
		
		p1.draw();
		p2.draw();
	}

}
