package com.assign07;

import java.util.Scanner;

public class SumOfEvenNumbers {
	static void getSumOfEvenNumbers(int[] a) {
		int sum = 0;
		for(int i = 0;i < a.length;i++) {
			if(a[i] % 2 == 0) {
				sum +=a[i];
			}
		}
		System.out.println("Sum of even numbers "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int [] num = new int[size];
		System.out.println("Enter the elements:");
		for(int i = 0;i < num.length;i++) {
		num[i] = sc.nextInt();
		}
		int i = 0;
		while(i < num.length) {
			System.out.println(num[i]);
			i++;
		}
//		for(int i = 0;i < num.length;i++) {
//			System.out.print(num[i]);
//		}
		
		getSumOfEvenNumbers(num);
	}
}
