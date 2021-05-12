package com.training;

import java.util.Scanner;

public class BigOfTwoDigit {
	static void bigOfTwoDigit(int n) {
		int rem,n1,rem1;
		rem=n%10;
		n1=n/10;
		rem1=n1%10;
		if(rem>rem1) {
			System.out.println(rem);
		}
		else {
			System.out.println(rem1);
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any two digit number:");
		int n=scan.nextInt();
		bigOfTwoDigit(n);
	}

}
