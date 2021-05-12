package com.assign07;

import java.util.Scanner;

public class MinimumNumber {
	static int getNearestMinValue(int num[]) {
		int temp = num[0];
		int min = 0;
		for(int i = 0 ; i < num.length; i++) {
			if(num[i] < temp) {
				temp = num[i];
				
			}
		}
		min += temp;
		 min = min - 1;
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int []num = new int[size];
		for(int i = 0;i < num.length;i++) {
			num [i] = sc.nextInt();
		}
		System.out.println(getNearestMinValue(num));
	}
}
