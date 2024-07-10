package com.javaex.ex18;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		double result = 100 / num;

		System.out.println(result);

		sc.close();
	}
}
