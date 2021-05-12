package com.assign16.practice;

import java.util.Scanner;

public class CloseTo10 {
	int closeTo10(int first, int second) {
		int temp;
		int a;
		int b;
		a = Math.abs(10 - first);
		b = Math.abs(10 - second);
		if(a == b) {
			temp = first - second;
		}
		else if(a > b){
			temp = second;
		}
		else {
			temp = first;
		}
		return temp;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int first = scan.nextInt();
		System.out.println("Enter second number:");
		int second = scan.nextInt();
		CloseTo10 c = new CloseTo10();
		System.out.println(c.closeTo10(first, second));
	}

}
