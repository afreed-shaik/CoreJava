package com.assign15;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scan.nextInt();
		System.out.println(n);
		while(n != 1) {
			
			if(n % 2 ==0) {
				n = n / 2;
			}
			else {
				n = n * 3 + 1;
			}
			System.out.println(n);
		}
	}

}
