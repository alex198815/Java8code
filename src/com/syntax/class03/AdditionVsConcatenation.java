package com.syntax.class03;

public class AdditionVsConcatenation {
	
	public static void main(String[]args) {
		
		int a=100;
		int b=200;
		
		String x=" Hello ";
		String y=" Friends ";
		
		System.out.println(a+b+x+y);//300hellofriends
		System.out.println(a+x+b+y);//100 hello 200 friends
		System.out.println(x+y+(a+b));//Hello friends 100200
		
	}

}
