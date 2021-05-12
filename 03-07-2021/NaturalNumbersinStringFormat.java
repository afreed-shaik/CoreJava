package com.assign07;

public class NaturalNumbersinStringFormat {
	static String printNaturalUsingString(String str) {
		String result = "";
		String str1 = str.replaceAll("-", ","); // replace " - " to " , "
		String[] str2 = str1.split(",");     // remove ","
		int[] array = new int[str2.length]; 
		// convert String to Integer Array
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(str2[i]);
		}
		
	    // find maximum number in Array
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		// Find minimun Number in Array
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		// Print natural numbers
		
		for (int i = min; i <= max; i++) {
			result += i +" ";
		}
		
		
		return result; 
	}

	public static void main(String[] args) {
		String str = "90-7,34,1,56-89";
		System.out.println(printNaturalUsingString(str));

	}
}
