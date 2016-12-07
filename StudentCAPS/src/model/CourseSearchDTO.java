package model;

public class CourseSearchDTO {
	private String courseID;
	private String courseName;
	private int courseSize;
	
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
	public int getCourseSize() {
		return courseSize;
	}
	public void setCourseSize(int courseSize) {
		this.courseSize = courseSize;
	}


}
