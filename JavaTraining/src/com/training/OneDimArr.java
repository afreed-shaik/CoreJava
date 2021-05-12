package com.training;

import java.util.Scanner;

public class OneDimArr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:");
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int index = 0;index <= arr.length - 1;index++) {
			System.out.println("Enter array value:");
			arr[index] = scan.nextInt();
		}
		System.out.println();
		//for(int index = 0;index <= arr.length - 1;index++) {
			//System.out.println(arr[index]);
			//arr[index] = scan.nextInt();
		//}
		for(int val : arr) {
			System.out.println(val);
		}
	}

}
