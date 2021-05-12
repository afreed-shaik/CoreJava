package com.assign16.practice;

import java.util.Scanner;

public class Within10of100Or200 {
	boolean nearHundred(int num) {
		if(num >= 90 && num <= 110 || num >= 190 && num <= 210) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scan.nextInt();
		Within10of100Or200 w = new Within10of100Or200();
		System.out.println(w.nearHundred(num));
		}
	}

}
