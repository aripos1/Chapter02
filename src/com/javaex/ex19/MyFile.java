package com.javaex.ex19;

import java.io.IOException;

public class MyFile {

	public String read(String path) {

		String result = "학교종이 땡땡땡 어서모이자";

		return result;
	}

	public String read2(String path) {

		String result = "";
		try {
			throw new IOException();
		} catch (IOException e) {
			System.out.println("파일이 없습니다");
		}
		
		return result;

	}

	public void read3(String path) throws IOException {

		String result = "";

		throw new IOException();
	}

}
