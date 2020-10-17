package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		int num=80;
		String str="i am a String";
		
		Scanner scan=new Scanner(System.in);//enables input to the console
		//i am adding some message to the user
		System.out.println("Please enter first name");
		String value=scan.nextLine();//waits for input and once you provided input- hit enter
		
		System.out.println("i capture String value ="+value);
		
		
		System.out.println("Please enter your last name");
		 String name=scan.nextLine();
		 System.out.println("Nice to meet you"+name);
		 
		}

}
