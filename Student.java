package dev.java.propenster;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Student{
	

	private int studentID;
	private String studentName;
	private String studentDepartment;
	private Course studentCourseChoice;

	public Student(int id, String name, String dept, Course courseChoice){
		this.studentID = id;
		this.studentName = name;
		this.studentDepartment = dept;
		this.studentCourseChoice = courseChoice;
	}

	public int getStudentID(){
		return this.studentID;
	}
	public void setStudentID(int id){
		this.studentID = id;
	}
	public String getStudentName(){
		return this.studentName;
	}
	public void setStudentName(String name){
		this.studentName = name;
	}
	public String getStudentDepartment(){
		return this.studentDepartment;
	}
	public void setStudentDepartment(String dept){
		this.studentDepartment = dept;
	}

	public Course getStudentCourseChoice(){
		return this.studentCourseChoice;
	}
	public void setStudentCourseChoice(Course course){
		this.studentCourseChoice = course;
	}

	public void getStudentDetails(){
		System.out.println("Student ID: {0}\nName: {1}\nDepartment: {2}\nCourse Registered: {3}", (getStudentID(), getStudentName(), getStudentDepartment(), getStudentCourseChoice()));
	}



	public static void main(String[] args) {
		
	}
}