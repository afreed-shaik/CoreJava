package com.assign07;

import java.util.Scanner;

public class CharCounter {
	static int charCounter(String input, char toFind) {
		int count = 0 ;	
		int ascii = toFind;
		if(ascii >= 97) {
			ascii = ascii - 32;
			toFind = (char) ascii;
		}
		if(input.isEmpty()) {
			count = -1;
		}
		else {
			
			for (int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == toFind) {
					count = count + 1;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter Input String");
		Scanner sc = new Scanner (System.in);
		String input = sc.next();
//	    String input = "";
		System.out.println("Enter Character to fing Ocuurence");
		char toFind = sc.next().charAt(0);
		System.out.println("Occurence Of Given character in : "+charCounter(input.toUpperCase(),toFind));
	}
}
