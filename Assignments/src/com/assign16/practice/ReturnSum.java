package com.assign16.practice;

import java.util.Scanner;

public class ReturnSum {
	int returnSum(int first, int second) {
		int temp;
		if(first == second) {
			temp = (first + second) * 2;
		}
		else {
			temp = first + second;
		}
		return temp;
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int first = scan.nextInt();
		System.out.println("Enter second number:");
		int second = scan.nextInt();
		//CloseTo10 c = new CloseTo10();
		ReturnSum rs = new ReturnSum();
		System.out.println(rs.returnSum(first, second));
	}

}
