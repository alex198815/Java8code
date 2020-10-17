package com.syntax.class02;

public class Variables {

	public static void main(String[]args) {
		
		String name="Olga";
		//I would like to say ;My name is Olga
		
		System.out.println("My name is "+name);
		
		String lastName="Sorrels";
		//i would like to print Olga Sorrels
		System.out.println(name+" "+lastName);
		
		String city="Miami";
		//Olga lives in Miami
		System.out.println(name+" lives in "+city);
		
		char grade='B';
		//Olga is B student
		System.out.println(name+" is "+grade+" student");
		
		int age=28;
		//Olga is 28 years old
		
		System.out.println(name+" is "+age+" years old ");
		/*
		 * toattach/concantenate Any value(char,int,String,double)
		 * to a String we use + (String concatenation operator)
	
		 */
		int date=27;
		String month="September";
		System.out.println(date+" "+month);
		
		String state="DC";
		String anotherState="DC ";
	}
	
}
