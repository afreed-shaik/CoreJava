package com.assign14;

import java.util.Scanner;

class ReturnEvenNumber {
	int returnCount(int[] inputArray) {
		int count = 0;
		for(int i = 0;i <= inputArray.length - 1;i++) {
			if(inputArray[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}
public class TesterRtnEvCnt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:");
		int size = scan.nextInt();
		int[] inputArray = new int[size];
		for(int i = 0; i <= size - 1;i++) {
			System.out.println("Enter the values into array till it get full");
			inputArray[i] = scan.nextInt();
		}
		ReturnEvenNumber ren = new ReturnEvenNumber();
		int res = ren.returnCount(inputArray);
		System.out.println("The Even Numbers are:" + res);
	}

}
