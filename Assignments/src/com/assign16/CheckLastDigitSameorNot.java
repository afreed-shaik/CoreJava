package com.assign16;

import java.util.Scanner;

public class CheckLastDigitSameorNot {

	static String checkLastDigit(int number1, int number2) {
		String str = "";
		int lastDigit = number1 % 10 ;
		int lastDigit1 = number2 % 10 ;
		
		if (lastDigit == lastDigit1) {
			str += lastDigit+" : IS the Last digits Of both integer values" ;
		}
		else {
			str += "Last Digits are Not Same" ;
		}
		
		
		return str;
		
	}

	public static void main(String[] args) {
		System.out.println("Enter two numbers to check last Digit Same OR Not");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Num : ");
		int number1 = sc.nextInt();
		System.out.println("Enter Second Num : ");
		int number2 = sc.nextInt();
		System.out.println(checkLastDigit(number1, number2));

	}

}
