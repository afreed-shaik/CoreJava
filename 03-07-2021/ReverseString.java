package com.assign07;

public class ReverseString {
	static String reverseString(String name) {
		String[] res = name.split(" ");
		String result = "";
	//	char[] ch1;
		for (int i = 0; i < res.length; i++) {
			char[] ch = res[i].toCharArray();
			for (int j = ch.length - 1; j >= 0 ; j--) {
				if ( j == ch.length - 1 ) {
					int num = ch[j];
					num = num - 32 ;
					 ch[j] = (char) num;
					result += ch[j];
				} 
				else {
					result += ch[j];
				}				
			}
			result += " ";
		}		
		return result;
	}

	public static void main(String[] args) {
		String name = "Java is programming lanaguage";
		System.out.println(reverseString(name));

	}
}
