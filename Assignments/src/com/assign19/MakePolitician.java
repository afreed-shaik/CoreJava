package com.assign19;

 interface Politician {
	void ruling();
}

class Teacher {
	void teaches() {
		System.out.println("The teacher should have to teach a lesson to the students in an understandable way");
	}
}
class Speaker extends Teacher implements Politician  {
	public void ruling() {
		System.out.println("The ruling of politician should have to be in a right path");
		
	}
	public void teaches() {
		System.out.println("The teacher should have to explain everything in a practical way");
	}
}

class MakePolitician {
	public static void main(String[] args) {
		Speaker s = new Speaker();
		Politician p = new Speaker();
//		s.ruling();
//		s.teaches();
		p.ruling();
		s.teaches();
		
		
		
		
		
	}
}
