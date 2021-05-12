package com.training;

import java.util.Scanner;

public class BigOfThreeDigit {
	static int rem,n1,rem1,n2,rem2;
	static int bigOfThreeDigit(int n) {
		
		rem=n%10;
		n1=n/10;
		rem1=n1%10;
		n2=n1/10;
		rem2=n2%10;
		if(rem>rem1) {
			if(rem>rem2) {
				return rem;
			}
			else {
				return rem2;
			}
		}
		else {
			if(rem1>rem2) {
				return rem1;
			}
			else {
				return rem2;
			}
		}
		//return rem+" "+rem1+" "+rem2;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any three digit number:");
		int n=scan.nextInt();
		System.out.println(bigOfThreeDigit(n));
		

	}

}
