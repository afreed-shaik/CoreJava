package com.assign14;

import java.util.Scanner;

class EvenList {
	static int i;
	 int[] getEvenArray(int[] inputArray) {
		int count = 0;
		for(int i = 0; i <= inputArray.length - 1; i++) {
			if(inputArray[i] % 2 == 0) {
				count++;
			}
		}
		int[] resarr = new int[count];
		int j = 0;
		for(int i = 0;i <= inputArray.length - 1;i++) {
			if(inputArray[i] % 2 == 0) {
				resarr[j] = inputArray[i];
				j++;
			}
		}
		return resarr;
	
		
		
	}
	
	
}

public class TesterEvArr {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:");
		int size = scan.nextInt();
		int[] inputArray = new int[size];
		for(int i = 0; i <= size - 1;i++) {
			System.out.println("Enter the values into array till it get full");
			inputArray[i] = scan.nextInt();
		}
		EvenList el = new EvenList();
		if(size >= 10) {
			int[] evenArray = el.getEvenArray(inputArray);
			for(int i = 0;i <= evenArray.length - 1;i++) {
				System.out.println(evenArray[i] + " ");
			}
		}
		else {
			System.out.println("null");
		}
		
	}


}
