package com.training;

import java.util.Scanner;

public class StudentMarks {
	static  int calTotal=0, avg;
	static String studentPassed(int calTotal) {
		//calTotal = calTotal + Integer.parseInt(args[i]);
		avg = calTotal / 5;
		String grade = "";
		
		if(avg == 35) {
			grade = "F";
		}
		else if(avg >= 90 && avg <= 100) {
			grade = "A";
		}
		else if(avg >= 80 && avg <= 90) {
			grade = "B";
		}
		else if(avg >= 70 && avg <= 80) {
			grade = "C";
		}
		else if(avg >= 60 && avg <= 70) {
			grade = "D";
		}
		else {
			grade = "E";
		}
		
		return  "Student average : "+ avg + " Student Grade : " + grade + " Student Total : " + calTotal;
	}
		static void studentFailed() {
			System.out.println("Student is failed ");
			System.exit(0);
		}
		
	
	
	public static void main(String[] args) {
		//int firstSubject = Integer.parseInt(args[0]);
		//int secondSubject = Integer.parseInt(args[1]);
		//int thirdSubject = Integer.parseInt(args[2]);
		//int fourthSubject = Integer.parseInt(args[3]);
		//int fifthSubject = Integer.parseInt(args[4]);
		//System.out.println("Enter the first subject marks of a student:" + Integer.parseInt(args[0]));
		//System.out.println("Enter the second subject marks of a student:" + Integer.parseInt(args[1]));
		//System.out.println("Enter the third subject marks of a student:" + Integer.parseInt(args[2]));
		//System.out.println("Enter the fourth subject marks of a student:" + Integer.parseInt(args[3]));
		//System.out.println("Enter the fifth subject marks of a student:" + Integer.parseInt(args[4]));
		//Scanner scan=new Scanner(System.in);
	
		for(int i = 0;i < 5;i++) {
			System.out.println("Enter the subject " + i + " marks of a student : " + Integer.parseInt(args[i]));
			//int subject(i) = (int) Integer.parseInt(args[i]);
		}
		for(int i = 0;i < 5;i++) {
			if(Integer.parseInt(args[i]) < 35 ) {
				
				
				studentFailed();
				
			}
			else {
				
				calTotal = calTotal + Integer.parseInt(args[i]);
				//System.out.println(calTotal);
				//System.out.println(studentPassed(calTotal));
			}
			
		}
		System.out.println(studentPassed(calTotal));
		
	}

}
