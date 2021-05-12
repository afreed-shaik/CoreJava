package com.assign12;

import java.util.Scanner;

public class NumPat8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range:");
		int range = scan.nextInt();
		for(int row = 1; row <= range; row++) {
			for(int col = 0; col < row ; col++) {
				System.out.print(row + col + " ");
				//count++;
				
			}
			//row++;
			System.out.println();
		}

	}

}
