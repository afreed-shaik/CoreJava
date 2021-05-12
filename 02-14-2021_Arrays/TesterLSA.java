package com.assign14;

import java.util.Arrays;
import java.util.Scanner;

class LeftShiftArray {
	int[] withoutTen(int[] inputArray) {
		for(int i = 0;i <= inputArray.length - 1;i++) {
			if(inputArray[i] == 10)
			{
				inputArray[i] = 0;
			}
		}
		Arrays.sort(inputArray);
		return inputArray;
		
	}
}
public class TesterLSA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = scan.nextInt();
		int[] inputArray = new int[size];
		for(int i = 0;i <= inputArray.length - 1;i++) {
			inputArray[i] = scan.nextInt();
		}
		
		LeftShiftArray  lsa = new LeftShiftArray();
		int[] resarr = lsa.withoutTen(inputArray);
		for(int i = resarr.length-1;i >= 0; i--) {
			System.out.print(resarr[i]+" ");
		}

	}

}
