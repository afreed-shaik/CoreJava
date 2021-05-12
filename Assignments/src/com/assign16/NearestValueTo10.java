package com.assign16;

import java.util.Scanner;

	public class NearestValueTo10 {
				
				static int nearestValueTo10(int num1, int num2) {
					int a = 10-num1 ;
					int b = 10-num2 ;
					int temp = 0 ;
					if (Math.abs(a) < Math.abs(b)) {
						temp = num1 ;
					}
					else if (Math.abs(a) > Math.abs(b)) {
						temp = num2 ;
					}
					else {
						temp = 0 ;
					}
					return temp;
					
				}

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter First Num : ");
				int number1 = sc.nextInt();
				System.out.println("Enter Second Num : ");
				int number2 = sc.nextInt();
				System.out.println(nearestValueTo10(number1, number2));

	}

}
