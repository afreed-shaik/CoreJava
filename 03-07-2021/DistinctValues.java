package com.assign07;

import java.util.Scanner;

public class DistinctValues {
	static String displayDistictValues(int[] array) {
		String res = "";
		int count ;
		for (int i = 0; i < array.length; i++) {
			count = 0;
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] == array[j]) {					
					count = count + 1;
					array[j] = -1 ;		// replace duplicate with -1			
				}			
			}
			if(array[i] != -1) {
				if(count >= 0 ) {
					res += array[i]+" ";
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Enter Array Elements");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}		
		System.out.println(displayDistictValues(array));
		
	}// Main close
}
