package com.assign12;

import java.util.Scanner;

public class NumPat12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range:");
		int range = scan.nextInt();
		 for(int row = 1; row <= range; row++) {
			 for(int col = 1; col <= range; col++) {
				 if(row == 1 || row == 5 || col == 1 || col == 5) {
					 System.out.print("*" + " ");
				 }
				 else {
					 System.out.print(" " + " ");
				 }
			 }
			 System.out.println();
		 }

	}

}
