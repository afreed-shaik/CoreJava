package com.training;

import java.util.Scanner;

public class ThreeDigitPalindrome {
	static void threeDigitPalindrome() {
		int rem,rem1,rem2,n1,n2,sum;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any three digit number:");
		int n=scan.nextInt();
		rem=n%10;
		n1=n/10;
		rem1=n1%10;
		n2=n1/10;
		rem2=n2%10;
		sum=rem*100+rem1*10+rem2*1;
		System.out.println(n==sum);
	}

	public static void main(String[] args) {
		
		threeDigitPalindrome();
	}

}
