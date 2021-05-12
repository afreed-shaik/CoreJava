package com.assign16.practice;

import java.util.Scanner;

public class Range {
	boolean withinRange(int first, int second) {
		int temp;
		if(first >= 30 && second <= 40 || first >= 40 && second <= 50) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int first = scan.nextInt();
		System.out.println("Enter second number:");
		int second = scan.nextInt();
		Range r = new Range();
		System.out.println(r.withinRange(first, second));

	}

}
