package com.assign07;

import java.util.Scanner;

public class RotateArray {
	static int[] movingArrayLeftToRight(int[] inputArray, int number) {
		int[] array = new int[inputArray.length];
		int length = inputArray.length;
		int j = 0;
		for (int i = 0; i < length; i++) {
			if(number >= length) {
				array[j] = inputArray[i];	
				j++;
			}
			else {
				array[number] = inputArray[i];
			}
			number++;			
		}
		
		return array;
	}

	public static void main(String[] args) {
		System.out.println("Enter Input Array");
		Scanner sc = new Scanner (System.in);
		int[] input = new int[4];
		// Insert elemenets into Array
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		System.out.println("Enter Position to shift left to right");
		int number = sc.nextInt();
		// Print Array From Left To Right
		for (int x : movingArrayLeftToRight(input,number)) {
			System.out.print(x +" ");
		}
	} // main close

}
