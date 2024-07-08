package com.javaex.ex12;

public class Student extends Person {

	private String schoolName;

	public Student() {

	}

	public Student(String schoolName) {
		this.schoolName = schoolName;

	}

	public Student(String name, int age, String schoolName) {
		super(name, age);
//		super.setName(name);
//		super.setAge(age);
		this.schoolName = schoolName;
//		System.out.println("학교 1:" + schoolName);

	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void personInfo() {
	
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("학교 :" + schoolName);

	}

}
