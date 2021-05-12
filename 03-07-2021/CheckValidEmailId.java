package com.assign07;

import java.util.Scanner;

public class CheckValidEmailId {
	static String isValidMailID(String mail_id) {
		String result = "";
		int count = 0;
		int temp = 0;
		for (int i = 0; i < mail_id.length(); i++) {
			if(mail_id.charAt(i) == '@') {
				count++;
			}
		}	
		boolean b = false;
		if(mail_id.charAt(0) >= 97 && mail_id.charAt(0) <= 123) {
			if(mail_id.contains("@") == true) {
				if(count == 1) {
					if(mail_id.endsWith(".com") == true || mail_id.endsWith(".co.in")) {
						for (int i = 0; i < mail_id.length(); i++) {
							if(mail_id.charAt(i) >= 65 && mail_id.charAt(i) <= 90) {
								temp = temp + 1;
								result += -5;
								break;
							}
						}
						if(temp == 0) 
							b = true ;
					}
					else {
						result += -4;
					}
				}
				else {
					result += -3;
				}				
			}
			else {
				result += -2;
			}
		}
		else {
			result += -1;
		}
		// Check mail Id Whether TRUE or FALSE
			if(b) {
				result += "Valid Mail_Id";
			}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter MAil ID");
		Scanner sc = new Scanner(System.in);
		String mail_id = sc.next();
		System.out.println(isValidMailID(mail_id));
	}
}
