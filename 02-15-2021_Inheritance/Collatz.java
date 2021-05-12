package com.assign15;

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in range");
		Collatz.getCollarz(sc.nextInt());

	}
	public static void getCollarz(int num)
	{
		 while (num != 1) 
	     { 
	         System.out.print(num + " "); 
	         if ((num & 1) == 1)
	        	 num = 3 * num + 1; 
	         else
	        	 num = num / 2; 
	     }
	        System.out.print(num); 

	}

}
