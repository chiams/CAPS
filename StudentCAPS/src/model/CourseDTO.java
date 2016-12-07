package model;

import java.util.Date;

public class CourseDTO {

	private String courseID;
	private String lecturerID;
	private String courseName;
	private Date startDate;
	private Date endDate;
	private double courseFees;
	private String courseCredits;
	private String comments;
	private int courseSize;
	public CourseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseDTO(String courseID, String lecturerID, String courseName, Date startDate, Date endDate,
			double courseFees, String courseCredits, String comments, int ourseSize) {
		super();
		this.courseID = courseID;
		this.lecturerID = lecturerID;
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.courseFees = courseFees;
		this.courseCredits = courseCredits;
		this.comments = comments;
		this.courseSize = ourseSize;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getLecturerID() {
		return lecturerID;
	}
	public void setLecturerID(String lecturerID) {
		this.lecturerID = lecturerID;
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
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	public String getCourseCredits() {
		return courseCredits;
	}
	public void setCourseCredits(String courseCredits) {
		this.courseCredits = courseCredits;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getCourseSize() {
		return courseSize;
	}
	public void setCourseSize(int ourseSize) {
		this.courseSize = ourseSize;
	}
	@Override
	public String toString() {
		return "CourseDTO [courseID=" + courseID + ", lecturerID=" + lecturerID + ", courseName=" + courseName
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", courseFees=" + courseFees
				+ ", courseCredits=" + courseCredits + ", comments=" + comments + ", ourseSize=" + courseSize + "]";
	}
	
	
	
}
