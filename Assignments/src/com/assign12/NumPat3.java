package com.assign12;

import java.util.Scanner;

public class NumPat3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range:");
		int range = scan.nextInt();
		for(int row = range; row >= 1; row--) {
			for(int col = range; col >= 1; col--) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}

}
