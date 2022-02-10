package org.student;

import org.college.College;
import org.department.Department;

public class Student {
	public void StudentName() {
		System.out.println("Student Name:saravanan");
}
	public void StudentDept() {
		System.out.println("Student Department:BE");
}	
	public void StudentId() {
		System.out.println("Student ID:2345678");
}
	public static void main(String[] args) {
		College clg = new College();
		 Department dept=new Department();
		Student student=new Student();
		clg.collegeName();
		clg.collegeRank();
		clg.collegeCode();
		dept.deptName();
		student.StudentDept();
		student.StudentId();
		student.StudentName();

	}
}
