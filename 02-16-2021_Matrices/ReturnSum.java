package com.assign16;

import java.util.Scanner;

public class ReturnSum {


	static int returnSumDouble(int number1, int number2) {
		int result ;
		if (number1 != number2) {
			result = number1 + number2 ;
		}
		else {
			result = ( number1 + number2 ) * 2 ;
		}
		
		return result;
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Num : ");
		int number1 = sc.nextInt();
		System.out.println("Enter First Num : ");
		int number2 = sc.nextInt();
		System.out.println(returnSumDouble(number1, number2));

	}


}
