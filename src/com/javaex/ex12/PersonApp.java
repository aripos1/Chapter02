package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {

		Person p01 = new Person("정우성", 45);
		p01.personInfo();

		Student s01 = new Student("강남중학교");
		s01.personInfo();

		Student s02 = new Student("이효리", 14, "강남중학교");

		s02.personInfo();
	}
}
