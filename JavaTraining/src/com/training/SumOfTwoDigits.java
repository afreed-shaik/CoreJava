package com.training;

import java.util.Scanner;

public class SumOfTwoDigits {

	public static void main(String[] args) {
		int rem,rem1,n1,sum;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two digit number:");
		int n=scan.nextInt();
		rem=n%10;
		n1=n/10;
		rem1=n1%10;
		sum=rem+rem1;
		System.out.println(sum);
	}

}
