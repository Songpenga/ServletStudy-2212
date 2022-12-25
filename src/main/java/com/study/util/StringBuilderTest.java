package com.study.util;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = "문자열1";
		str += "문자열2";
		str.replaceAll("문자열2", "문자열3");
		
		System.out.println(str);
		
		StringBuilder builder = new StringBuilder(); //비동기
		StringBuffer buffer = new StringBuffer(); //동기
		
		

	}

}
