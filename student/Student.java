package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Student Name Method");
	}
	public void studentDept()
	{
		System.out.println("Student department Name Method");	
	}
	public void studentId()
	{
		System.out.println("Student ID Method");
}
	public static void main(String[] args) {
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}
}
