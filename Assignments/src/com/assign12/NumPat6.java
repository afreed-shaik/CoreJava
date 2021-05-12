package com.assign12;

import java.util.Scanner;

public class NumPat6 {

	public static void main(String[] args) {
		int count = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range:");
		int range = scan.nextInt();
		for(int row = 1; row <= range; row++) {
			for(int col = 1; col <= row ; col++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}

	}

}
