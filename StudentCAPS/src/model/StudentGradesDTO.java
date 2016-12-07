package model;

import java.util.Date;

public class StudentGradesDTO {

	private String studentID;
	private String firstName;
	private String secondName;
	private String yearStudy;
	private String courseID;
	private String courseName;
	private Date startDate;
	private Date endDate;
	private int courseCredits;
	private String courseGrade;	
	private double cGPA;
	public StudentGradesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentGradesDTO(String studentID, String firstName, String secondName, String yearStudy, String courseID,
			String courseName, Date startDate, Date endDate, int courseCredits, String courseGrade, double cGPA) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.secondName = secondName;
		this.yearStudy = yearStudy;
		this.courseID = courseID;
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.courseCredits = courseCredits;
		this.courseGrade = courseGrade;
		this.cGPA = cGPA;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getYearStudy() {
		return yearStudy;
	}
	public void setYearStudy(String yearStudy) {
		this.yearStudy = yearStudy;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getCourseCredits() {
		return courseCredits;
	}
	public void setCourseCredits(int courseCredits) {
		this.courseCredits = courseCredits;
	}
	public String getCourseGrade() {
		return courseGrade;
	}
	public void setCourseGrade(String courseGrade) {
		this.courseGrade = courseGrade;
	}
	public double getcGPA() {
		return cGPA;
	}
	public void setcGPA(double cGPA) {
		this.cGPA = cGPA;
	}
	@Override
	public String toString() {
		return "StudentGradesDTO [studentID=" + studentID + ", firstName=" + firstName + ", secondName=" + secondName
				+ ", yearStudy=" + yearStudy + ", courseID=" + courseID + ", courseName=" + courseName + ", startDate="
				+ startDate + ", endDate=" + endDate + ", courseCredits=" + courseCredits + ", courseGrade="
				+ courseGrade + ", cGPA=" + cGPA + "]";
	}
	

	
	
}
