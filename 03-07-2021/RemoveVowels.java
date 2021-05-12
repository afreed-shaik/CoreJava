package com.assign07;

import java.util.Scanner;

public class RemoveVowels {
	static String removeVowels(String str) {
		String vow = "aeiou";
		String res = "";
		int count = 0 ;
		if (str != null) {
			for (int i = 0; i < str.length(); i++) {
				count = 0;
				for (int j = 0; j < vow.length(); j++) {
					if(str.charAt(i) == vow.charAt(j)) {
						count = count + 1;
						break;						
					}
				}
				if(count == 0) {
					res += str.charAt(i)+"";
				}
			}
		}
		else {
			return res =  null;
		}
		
		 
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Enter String ");
		Scanner sc = new Scanner(System.in);
		System.out.println(removeVowels(sc.nextLine()));
	}
}
