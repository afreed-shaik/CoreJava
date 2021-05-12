package com.assign15;

import java.util.Scanner;

public class RussianMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int first = scan.nextInt();
		System.out.println("Enter second number:");
		int second = scan.nextInt();
		//int res = first * second;
		int num = 0;
		while(first != 1) {
			
			num = ((first ) * (second )); 
			
			
			
			first = first / 2;
			second = second * 2;
//			if(num == res)
//			{
//				System.out.println(num);
//			}
			
		}
		System.out.println(num);
	}

}
