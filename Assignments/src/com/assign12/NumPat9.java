package com.assign12;

import java.util.Scanner;

public class NumPat9 {

	public static void main(String[] args) {
		int a = 65;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range:");
		int range = scan.nextInt();
		for(int row = 1; row <= range; row++) {
			
			for(int col = 1; col <= row ; col++) {
				char c = (char)a;
				System.out.print(c + " ");
				
				//count++;
				a++;
			}
			//row++;
			System.out.println();
		}
	}

}
