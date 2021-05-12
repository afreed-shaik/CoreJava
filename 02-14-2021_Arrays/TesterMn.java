package com.assign14;

import java.util.Scanner;
class MinNumber {
	int getMin(int[] inputArray) {
		int min = inputArray[0];
		for(int i = 0;i <= inputArray.length - 1;i++) {
			if(min > inputArray[i]) {
				min = inputArray[i];
			}
			//else {
				//return -1;
			//}
		}
		return min;
	}
}
public class TesterMn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:");
		int size = scan.nextInt();
		int[] inputArray = new int[size];
		for(int i = 0; i <= size - 1;i++) {
			System.out.println("Enter the values into array till it get full");
			inputArray[i] = scan.nextInt();
		}
		MinNumber mn = new MinNumber();
		if(size == 10) {
			int res = mn.getMin(inputArray);
			System.out.println("The minimum number in the array:" + res);
		}
		else {
			System.out.println("-1");
		}

	}

}
