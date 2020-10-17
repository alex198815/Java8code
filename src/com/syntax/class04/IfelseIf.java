package com.syntax.class04;

public class IfelseIf {
	public static void main(String[] args) {
		
		/*
		 * we need to compare 2 numbers
		 * bigger,smaller or equal
		 */
		
		int num1=9;
		int num2=99;
		
		if(num1>num2) {// true
			System.out.println(num1+" is bigger than "+num2);
		}else if (num1<num2) {//what if this true
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
		System.out.println("-----------------------");
		/*
		 * Based on the of the week we will print class schedule
		 */
		
		int day=3;
		
		if(day==1) {
			System.out.println("Today is monday we have no class");
		}else if (day==2) {
			System.out.println("today we have manual class");
		}else if (day==3) {
			System.out.println("today is wednesday and we have manuak class");
		}else if (day==4) {
			System.out.println("Today is Thursday and we have review class");
		}else if (day==5) {
			System.out.println(" Today is Friday but i have class tomorrow");
		}else if (day==6) {
			System.out.println(" today is Saturday i miss Java class");
		}else if (day==7) {
			System.out.println("Today is Sunday i did a lot of coding");
		}else {
			System.out.println("This is invalid week day");
		}
	}

}
