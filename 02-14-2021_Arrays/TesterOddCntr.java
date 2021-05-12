package com.assign14;

import java.util.Scanner;

class OddCounter {
	int getOddCount(int[] inputArray) {
		int count = 0;
		for(int i = 0; i <= inputArray.length - 1 ; i++) {
			if(inputArray[i] % 2 == 1) {
				count++;
			}
		}
		return count ;
	}
}
public class TesterOddCntr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:");
		int size = scan.nextInt();
		int[] inputArray = new int[size];
		for(int i = 0; i <= size - 1;i++) {
			System.out.println("Enter the values into array till it get full");
			inputArray[i] = scan.nextInt();
		}
		OddCounter od = new OddCounter();
		if(size == 10) {
			int  res = od.getOddCount(inputArray);
			
				System.out.println("The no.of Odd Numbers in the given input array is:" + res);
			
		}
		else {
			System.out.println("The size of the array is only equal to 10 then only it will execute");
		}
	}

}
