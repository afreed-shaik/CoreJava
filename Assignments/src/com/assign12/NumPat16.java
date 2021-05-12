package com.assign12;

import java.util.Scanner;

public class NumPat16 {

	public static void main(String[] args) {
		int count = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range:");
		int range = scan.nextInt();
		
		for(int row = 1; row <= range; row++) {
			for(int space = 1;space <= range - row; space++) {
				System.out.print(" " + " ");
			}
			for(int diag = 1 ; diag <= row ;diag++) {
				System.out.print(count-- + " ");
				count = count++ + row;
			}
			
		System.out.println();	
		}

	}

}
