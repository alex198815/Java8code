package com.syntax.class05;

import java.util.Scanner;

public class Recap {
	public static void main (String[]args) {
		
		Scanner scanner;
		scanner=new Scanner(System.in);
		
		//i want to capture sentence;
		String sentence=scanner.nextLine();
		System.out.println("You entered sentece "+sentence);
		
		//i want to capture number
		int number=scanner.nextInt();
		System.out.println("You entered number: "+number);
		
		//i want to capture i word
		String word=scanner.next();
		System.out.println("You entered number; "+word);
		
		//I want to capture 1 character
		System.out.println("Please enter any single character");
		char singleCharacter=scanner.next().charAt(0);
		System.out.println("You entered number ; "+singleCharacter);
		
		
	}

}
