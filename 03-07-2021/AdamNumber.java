package com.assign07;

import java.util.Scanner;

public class AdamNumber {
//	static boolean isAdamNumber(int number) {
//		boolean b = false;
//	    
//	    int multilplication1 = number * number ;
//	    int multilplication2 = getReverse(number) * getReverse(number) ;
//	    
//		    if(multilplication1 == getReverse(multilplication2)) {
//		    	b = true;
//		    }
//		return b;		
//	} // IsAdam method close
//	
//	static int getReverse(int number) {
//		String str = String.valueOf(number); // Convert int to String
//		StringBuffer sb = new StringBuffer(str); // convert string to StringBuffer
//		str = sb.reverse().toString();  // Reverse the String Stored in String 
//	    int reverseNum = Integer.parseInt(str);  // convert String to integer
//		return reverseNum;		
//	} // getRevere Close
//
//	public static void main(String[] args) {
//		System.out.println("Enter Number to Check Adam Number");
//		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		System.out.println("IS The Given Numbers is ADAM Number ? "+ isAdamNumber(number));
//
//	} // main close
	
	static int reverseNum(int num) {
        int rev = 0, rem = 0;
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        return rev;     }     static String adamNum(int input) {
        int square = 0, revInput = 0, val, revSquare = 0;
        String res = "";
        square += input * input;         res += "The square of number " + input + " is " + square + "\n"; // input = 13; square = 169
        revInput += reverseNum(input);
        res += "The reverse of " + input + " is " + revInput + "\n"; // revInput = 31
        revSquare = revInput * revInput;
        res += "The square of " + revInput + " is "+ revSquare +"\n"; //square of 31 is 961
        val = reverseNum(revSquare);
        //res += val + "\n"; //val = 169
        if (square == val) {
            res += input +" is Adam Number";
        } else {
            res += input +" is not Adam Number";
        }
        return res;
    }     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check adam or not");
        System.out.print(adamNum(sc.nextInt()));
    }
}
