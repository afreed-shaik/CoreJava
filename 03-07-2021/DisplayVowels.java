package com.assign07;

import java.util.Scanner;

public class DisplayVowels {
	static String displayVowels(String name) {
		String res = "";
		String str = "AEIOU";
		char[] vowel = str.toCharArray();
		char[] ch = name.toUpperCase().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < vowel.length; j++) {
				if(ch[i] == vowel[j] ) {
					res += ch[i];
					break;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Enter String ");
		Scanner sc = new Scanner(System.in);
		System.out.println(displayVowels(sc.next()));
	}
}
