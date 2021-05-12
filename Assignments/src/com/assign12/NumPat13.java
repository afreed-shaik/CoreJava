package com.assign12;

import java.util.Scanner;

public class NumPat13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range:");
		int range = scan.nextInt();
		for(int row = 1; row <= range;row++) {
			for(int space = 1;space <= range - row; space++) {
				System.out.print(" " + " ");
			}
			for(int diag = 1 ; diag <= (2 * row) - 1;diag++) {
				System.out.print("*" + " ");
			}
			
		System.out.println();	
		}
	}

}
