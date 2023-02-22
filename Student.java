package org.system;

public class Student extends Department{
		public void studentName(String name) {
			System.out.println("Student Name :"+name);
		}
		public void studentDept(String dept) {
			System.out.println("Student Department :"+dept);
		}
		public void studentId(int id) {
			System.out.println("Student ID :"+id);
		}

		public static void main(String[] args) {
			Student detail=new Student();
			detail.collegeName("Harvard University");
			detail.collegeCode(0046);
			detail.collegeRank("NO:01");
			detail.deptName("Computer Science");
			detail.studentName("Wajid");
			detail.studentDept("Computer Science");
			detail.studentId(21360);
		}

}
