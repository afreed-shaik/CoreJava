package com.assign15;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int res = diff(sc.nextInt());
		System.out.println("The difference of: "+res);
	}

	public static int diff(int num)
	{
		
		return (21-num);

	}

}
