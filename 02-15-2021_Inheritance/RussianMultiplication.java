package com.assign15;

import java.util.Scanner;

public class RussianMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 0;
		
		System.out.println("Enter first number:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		
		if(num2 % 2 == 0) 
			val = (num1 * num2) * (num2 / 2);
		else
			val = ((num1 * 2) * (num2 / 2) + num1);
		System.out.println(val);
	}

}
