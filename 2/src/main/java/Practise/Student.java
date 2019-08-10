package Practise;

public class Student extends Teacher {
	
	public Student()
	{
		System.out.println("Student const");
	}
	
	public void m1()
	{
		System.out.println("Student method");
	}
	
	public static void main(String args[])
	{
		Student s=new Student();
		s.m1();
	}

}
