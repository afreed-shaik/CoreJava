package com.training;

import java.util.Scanner;

public class DiffOfTwoDigits {

	public static void main(String[] args) {
		int rem,rem1,n1,diff;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two digit number:");
		int n=scan.nextInt();
		rem=n%10;
		n1=n/10;
		rem1=n1%10;
		diff=rem-rem1;
		System.out.println(Math.abs(diff));
	}

}
