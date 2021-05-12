package com.assign15;

import java.util.Scanner;

public class TwinPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		TwinPrimes.getPairOfNumber(sc.nextInt());
	}
	public static void getPairOfNumber(int range)
	{
		boolean prime[] = new boolean[range + 1]; 
        for (int i=0;i<=range;i++) 
            prime[i] = true; 
        for (int p=2;p*p<=range;p++) 
        {    
            if (prime[p] == true) 
            { 
                for (int i=p*2;i<=range;i+=p) 
                    prime[i] = false; 
            } 
        } 
        for (int i=2;i<=range-2;i++) 
        { 
            if (prime[i] == true && prime[i + 2] == true) 
                System.out.print(" (" + i + ", " + (i + 2) + ")"); 
	}

}

}