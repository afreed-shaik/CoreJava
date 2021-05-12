package com.assignM09;

class Student{
	public int student_id;
	public String student_name;
	private int marks;
	private char grade;
	
	public Student() {
		this.student_id = 0;
		this.student_name = null;
		this.marks = 0;
		this.grade = ' ';
	}
	
	public Student(int student_id, String student_name, int marks) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.marks = marks;
		calculateGrade();
	}
	
	private void calculateGrade() {
		if(marks > 90)
		{
			grade = 'A';
		}
		else if(marks > 80 && marks <= 90)
		{
			grade = 'B';
		}
		else if(marks > 70 && marks <= 80)
		{
			grade = 'C';
		}
		else if(marks > 60 && marks <= 70)
		{
			grade = 'D';
		}
		else
		{
			grade = 'E';
		}
	}
	
	public String displayDetails() {
		return "Student [studentId=" + student_id + ", studentName=" + student_name + ", marks=" + marks + ", grade="
				+ grade + "]";
	}
}
	


public class Tester {

	public static void main(String[] args) {
		Student student = new Student(405, "Afreed Shaik", 80);
		System.out.println(student.displayDetails());

	}

}
