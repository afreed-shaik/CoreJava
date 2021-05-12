package com.assign16;

import java.util.Scanner;

public class Within10Of100Or200 {

static boolean checkNum(int num) {
		
		if(num >= 90 && num <= 110) {
			return true;
		}
		else if(num >= 190 && num <= 210){
			return true;
		}
		else
		
		return false;
		
	}
	
	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		System.out.println(checkNum(number));
		}
	}
}
