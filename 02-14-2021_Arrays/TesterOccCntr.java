package com.assign14;

import java.util.Scanner;
class OccurrenceCounter {
	int getCount(int[] inputArray, int givenNumber) {
		int count = 0;
		for(int i = 0;i <= inputArray.length - 1;i++) {
			if(inputArray[i] == givenNumber) {
				count++;
			}
		}
		if(count <= 0) {
			return -1;
		}
		return count;
		
	}
}
public class TesterOccCntr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:");
		int size = scan.nextInt();
		int[] inputArray = new int[size];
		for(int i = 0; i <= size - 1;i++) {
			System.out.println("Enter the values into array till it get full");
			inputArray[i] = scan.nextInt();
		}
		System.out.println("Enter the value to search:");
		int givenNumber = scan.nextInt();
		OccurrenceCounter oc = new OccurrenceCounter();
		int result = oc.getCount(inputArray, givenNumber);
		System.out.println(givenNumber + " is repeated for " + result + " times");
	}

}
