package com.assign15;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Digit Number: ");
		int number = sc.nextInt();
		int temp = number;
		int count = 0;
		int temp2 = number;
		int sum= 0;
		while(number!=0)
		{
			int rem =number%10;
			number/=10;
			count++;
		}
		while(temp!=0)
		{
			int rem =temp%10;
			//System.out.println(rem);
			temp/=10;
			//System.out.println(temp);
			long result = 1;
        for(int i=1;i<=count;i++)
        {
            result*=rem;
           // System.out.println("result "+result);
        }
        sum+=result;
		}
		System.out.println(sum);
		//System.out.println(count);
		sc.close();
		if(sum == temp2)System.out.println(temp2+" It is amstrong number.. !!");
		else System.out.println(temp2+" It is not amstrong number.. !!");
	}

}
