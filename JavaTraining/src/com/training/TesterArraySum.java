package com.training;

import java.util.Scanner;
class ArraySum
{
	int getSum(int[] inputArray)
	{
		int sum = 0;
		for(int i = 0;i<inputArray.length;i++)
		{
			sum = sum +  inputArray[i];
		}
		return sum;
	}
}
public class TesterArraySum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int arraySize = sc.nextInt();
		int[] arr = new int[arraySize];
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println("Enter the values into array ");
			arr[i] = sc.nextInt();
		}
		ArraySum as = new ArraySum();
		if(arraySize == 0) 
		{
			System.out.println("-1");
		}
		else {
			int  res = as.getSum(arr);
			System.out.println("Result is : "+res);
			
		}
		

	}

}
