package com.assign16.practice;

import java.util.Scanner;

public class SameLastDigit {
	boolean lastDigit(int first, int second) {
		int firstrem;
		int secondrem;
		 firstrem = first % 10;
		 secondrem = second % 10;
		 if(firstrem == secondrem) {
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
		SameLastDigit sld = new SameLastDigit();
		System.out.println(sld.lastDigit(first, second));

	}

}
