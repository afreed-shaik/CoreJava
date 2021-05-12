package com.assign07;

public class ContainsPattern {
	static String[] getWordsContainsPattern(String[] words, String pattern) {
		int index = 0;
	//	String res = "";
		String[] result = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			if(words[i].toUpperCase().contains(pattern.toUpperCase())) {
				result[index] = words[i].toUpperCase();
				index = index + 1;
				//res += words[i]+ "\r";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] words = {"South Africa", "Afghanistan", "Sri Lanka", 
				          "New Zealand", "West Indies", "England", "India", 
				          "Australia","Pakistan", "Bangladesh"};

		String pattern = "an";
		
		for (String res : getWordsContainsPattern(words, pattern)) {
			if( res != null) {
				System.out.println(res);
			}
		}
	}
}
