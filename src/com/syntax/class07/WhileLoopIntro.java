package com.syntax.class07;

public class WhileLoopIntro {
	
	public static void main(String[]args) {
		int time=12;
		
		if (time>12) {
			System.out.println("good day ");
			
		}
		System.out.println("------While Loop");
		///
		
		while(time>12) {
			System.out.println("good day");
			time++;
		}
	
		// i want to print numbers from 1 to 50
		int num=1;
		
		while(num<=50) {
			System.out.println(num);
			num++;
		}
		// new task
		System.out.println("print 10 to 60");
		
		int a=10;
		
		while(a<=60) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println("good day");
		
		int b=100;
		while (b>=60) {
			System.out.print(b+" ");
			b--;
		}
		
	}

}
