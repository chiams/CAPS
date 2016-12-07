package model;

import java.util.Date;

public class EnrolmentDTO {
	
	private String studentID;
	private String courseID;
	private Date courseStart;
	private Date enrolmentBy;
	private String studentGrade;
	public int noOfStudents;
	
	public EnrolmentDTO(String studentID, String courseID, Date courseStart, Date enrolmentBy, String studentGrade, int noOfStudents) {
		super();
		this.studentID = studentID;
		this.courseID = courseID;
		this.courseStart = courseStart;
		this.enrolmentBy = enrolmentBy;
		this.studentGrade = studentGrade;
		this.noOfStudents= noOfStudents;
	}
	
	

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public Date getCourseStart() {
		return courseStart;
	}
	public void setCourseStart(Date courseStart) {
		this.courseStart = courseStart;
	}
	public Date getEnrolmentBy() {
		return enrolmentBy;
	}
	public void setEnrolmentBy(Date enrolmentBy) {
		this.enrolmentBy = enrolmentBy;
	}
	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}



	@Override
	public String toString() {
		return "EnrolmentDTO [studentID=" + studentID + ", courseID=" + courseID + ", courseStart=" + courseStart
				+ ", enrolmentBy=" + enrolmentBy + ", studentGrade=" + studentGrade + ", noOfStudents=" + noOfStudents
				+ "]";
	}
	

	

}
