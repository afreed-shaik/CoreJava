package com.assign12;

import java.util.Scanner;

public class NumPat1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range:");
		int range = scan.nextInt();
		for(int row = 1; row <= range; row++) {
			for(int col = 1; col <= range; col++) {
				System.out.print(col + " ");
				//count--;
			}
			
			System.out.println();
		}

	}

}
