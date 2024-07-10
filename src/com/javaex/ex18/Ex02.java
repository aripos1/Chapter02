package com.javaex.ex18;

public class Ex02 {

	public static void main(String[] args) {

		int[] iArr = new int[3];

		iArr[0] = 3;
		iArr[1] = 6;
		iArr[2] = 9;

		try {
			for (int i = 0; i < iArr.length; i++) {
				System.out.println(iArr[4]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("배열 범위 오류");

		} finally {

		}
	}

}
