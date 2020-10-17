package com.syntax.class07;

public class Recap {
	public static void main(String[]args) {
		
		String day="Sunday";
		
		switch (day) {
		
		case "Monday": 
		case "Tusday":
		case"Wednsday":
		case "Thursday":
		case "Friday":
			System.out.println("Weekday");
			break;
			default:
				System.out.println("weekend");
		}
		
		}
	}


