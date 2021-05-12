package com.assign14;

import java.util.Scanner;

class FillMultiples {
	int[] getMultiplesArray(int number) {
		int[] marr = new int[10];
		int j = 0;
		for(int i = 1; i <= 10;i++) {
			marr[j] = i * number;
			j++;
		}
		return marr;
	}
}
public class TesterMltpl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:");
		int num = scan.nextInt();
		if(num <= 0) {
			System.out.println("null");
		}
		else {
			FillMultiples fm = new FillMultiples(); 
			int[] res = fm.getMultiplesArray(num);
			for(int i = 0; i <= res.length - 1; i++) {
				System.out.println(res[i] + " ");
			}
		}
	}

}
