package com.javaex.ex19;

import java.io.IOException;

public class MyFileApp {

	public static void main(String[] args) {
		
		MyFile mf = new MyFile();
		String str = mf.read("str");
		
		System.out.println(str);
		
		String str2 = mf.read2(str);
		
		try{
			mf.read3(str2);
		}catch(IOException e) {
			
		}
	}
}
