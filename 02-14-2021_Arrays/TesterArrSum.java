package com.assign14;

import java.util.Scanner;

class ArraySum {
	int getSum(int[] inputArray) {
		int sum = 0;
		for(int i = 0; i <= inputArray.length - 1 ; i++) {
			sum += inputArray[i];
		}
		return sum;
		
	}
}
public class TesterArrSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:");
		int size = scan.nextInt();
		int[] inputArray = new int[size];
		for(int i = 0; i <= size - 1;i++) {
			System.out.println("Enter the values into array till it get full");
			inputArray[i] = scan.nextInt();
		}
		ArraySum as = new ArraySum();
		int sumres = as.getSum(inputArray);
		System.out.println("The addition of the elements present in the array is:" + sumres );
	}

}
