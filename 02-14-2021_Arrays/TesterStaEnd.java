package com.assign14;

import java.util.Scanner;

class StartAndEnd {
	int[] fizzArray(int[] inputArray) {
		int start = inputArray[0];
		int end = inputArray[1];
		int[] narr = new int[end - start];
		for(int i = 0; i <= narr.length - 1 ;i++) {
			if(start < end) {
				narr[i] = start;
				start++;
			}
		}
		return narr ;
		
	}
}
public class TesterStaEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] inputArray = new int[2];
		System.out.println("Enter Start and End Numbers as elements in array");
		for(int i = 0; i <= inputArray.length -1 ;i++) {
			inputArray[i] = scan.nextInt();
		}
		StartAndEnd sae = new StartAndEnd();
		int[] result = sae.fizzArray(inputArray);
		for(int i = 0;i <= result.length - 1;i++) {
			System.out.println(result[i] + " ");
		}
	}

}
