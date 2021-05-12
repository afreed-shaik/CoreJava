package com.assign14;

import java.util.Scanner;

class MaxNumber {
	int getMax(int[] inputArray) {
		int max = inputArray[0];
		for(int i = 0; i <= inputArray.length - 1;i++) {
			if(max < inputArray[i]) {
				max = inputArray[i];
			}
			//else {
				//return -1;
			//}
		}
		return max;
		
	}
}
public class TesterMx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:");
		int size = scan.nextInt();
		int[] inputArray = new int[size];
		for(int i = 0; i <= size - 1;i++) {
			System.out.println("Enter the values into array till it get full");
			inputArray[i] = scan.nextInt();
		}
		MaxNumber mx = new MaxNumber();
		if(size == 10) {
			int res = mx.getMax(inputArray);
			System.out.println("The maximum number in the array:" + res);
		}
		else {
			System.out.println("-1");
		}

	}

}
