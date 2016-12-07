package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.CourseDTO;
import model.CourseSearchDTO;
import model.EnrolmentDTO;
import model.StudentDTO;
import model.StudentGradesDTO;

public class StudentDAOImpl implements StudentDAO {
	private static final String dbUrl = "jdbc:mysql://localhost:3306/StudentCAPS";
	private static final String dbUserName = "root";
	private static final String dbPassword = "password";
	
	

	//finds all courses that the student has not enrolled in
	@Override
	public ArrayList<CourseDTO> findAllcourse(String studentID) throws DAOException, SQLException {
		// TODO Auto-generated method stub
		ArrayList<CourseDTO> items = new ArrayList<CourseDTO>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String selectSql = "SELECT "
				+ "course.courseID, course.courseName, course.courseSize,course.courseFees, "
				+ "course.courseCredits, course.comments, course.startDate, course.endDate"
				+ " FROM course, enrolment "
				+ "WHERE course_courseID = course.courseID and enrolment.user_userid ="+studentID+ "and enrolment.studentGrade is not null;";
		Connection conn = null;
	
			conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			Statement st = conn.createStatement();
			Logger.getLogger(getClass().getName()).log(Level.INFO,
					"Executing select: " + selectSql);
			ResultSet rs = st.executeQuery(selectSql);
			while (rs.next()) {
				CourseDTO cour = new CourseDTO();
				cour.setCourseID(rs.getString("courseID"));
				cour.setCourseName(rs.getString("courseName"));
				cour.setCourseSize(rs.getInt("courseSize"));
				cour.setStartDate(rs.getDate("startDate"));
				cour.setEndDate(rs.getDate("endDate"));
				cour.setCourseFees(rs.getDouble("courseFees"));
				cour.setCourseCredits(rs.getString("courseCredits"));
				cour.setComments(rs.getString("comments"));
				items.add(cour);
			}
			st.close();
			return items;
	}
	
	
	//list all courses with grades for the student
	public ArrayList<StudentGradesDTO> listcoursewithGPA(String studentID) throws DAOException, SQLException {
		ArrayList<StudentGradesDTO> Sgradelist = new ArrayList<StudentGradesDTO>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String selectSql = "SELECT course.courseID, course.courseName,course.startDate, "
				+ "course.endDate, course.courseCredits, enrolment.studentGrade "
				+ "from course, enrolment "
				+ "WHERE course_courseID = course.courseID "
				+ "and enrolment.user_userid =" + studentID +" and enrolment.studentGrade is not null;";
			Connection conn = null;
	
			conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			Statement st = conn.createStatement();
			Logger.getLogger(getClass().getName()).log(Level.INFO,
					"Executing select: " + selectSql);
			ResultSet rs = st.executeQuery(selectSql);
			while (rs.next()) {
				StudentGradesDTO Sgrades = new StudentGradesDTO();
				Sgrades.setCourseID(rs.getString("courseID"));
				Sgrades.setCourseName(rs.getString("courseName"));
				Sgrades.setStartDate(rs.getDate("startDate"));
				Sgrades.setEndDate(rs.getDate("endDate"));
				Sgrades.setCourseCredits(rs.getInt("courseCredits"));
				Sgrades.setCourseGrade(rs.getString("studentGrade"));
				Sgradelist.add(Sgrades);
			}
			st.close();
			return Sgradelist;
	}
	
	//Have not implemented this method on JSP yet
	public ArrayList<CourseDTO> findCourseByCriteria(CourseSearchDTO sear)
			throws DAOException {
		ArrayList<CourseDTO> list = new ArrayList<CourseDTO>();
		String selectSql = null;
		if (sear.getCourseID().trim().equalsIgnoreCase("")) {

			selectSql = "SELECT * FROM course WHERE courseID LIKE '"
					+ sear.getCourseID().trim() + "%';";
		} else {
			if (sear.getCourseName().trim().equalsIgnoreCase("")) {
				selectSql = "SELECT * FROM course WHERE courseName LIKE '"
						+ sear.getCourseName().trim() + "%';";
			} else {
				selectSql = "SELECT * FROM course WHERE courseSize LIKE '"
						+ sear.getCourseSize() + "%';";
			}
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			Statement st = conn.createStatement();
			Logger.getLogger(getClass().getName()).log(Level.INFO,
					"Executing select: " + selectSql);
			ResultSet rs = st.executeQuery(selectSql);
			while (rs.next()) {
				CourseDTO onecour = new CourseDTO();
				onecour.setCourseName(rs.getString("name"));
				onecour.setCourseName(rs.getString("cname"));
				onecour.setCourseSize(rs.getInt("csize"));
				onecour.setStartDate(rs.getDate("sdate"));
				onecour.setEndDate(rs.getDate("edate"));
				onecour.setCourseFees(rs.getDouble("fees"));
				onecour.setCourseCredits(rs.getString("ccredits"));
				onecour.setComments(rs.getString("comments"));
				list.add(onecour);				
			}
			st.close();
		} catch (Exception e) {
			String error = "Error selecting users. Nested Exception is: " + e;
			Logger.getLogger(getClass().getName()).log(Level.SEVERE, error);
			throw new DAOException();
		} finally {
			try {
				conn.rollback();
				conn.close();
			} catch (Exception e) {
			}
		}
		
		return list;
	}
	
	//waiting for thazin to complete 
	public void enrolcourse(EnrolmentDTO enrol) throws DAOException {
//		Date date = new Date(0);
//		
//		String insertSql = "INSERT INTO enrolment VALUES('" + enrol.getCourseID()
//				+ "', '" + enrol.getStudentID() + "', '" + enrol.getCourseStart()
//				+ "', '" + enrol.setEnrolmentBy(date)
//				+ "');";
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		Connection conn = null;
//		try {
//			conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
//			Statement st = conn.createStatement();
//			Logger.getLogger(getClass().getName()).log(Level.INFO,
//					"Executing insert: " + insertSql);
//			int res = st.executeUpdate(insertSql);
//			System.out.println(res);
//			st.close();
//		} catch (Exception e) {
//			String error = "Error selecting users. Nested Exception is: " + e;
//			Logger.getLogger(getClass().getName()).log(Level.SEVERE, error);
//			throw new DAOException();
//		} finally {
//			try {
//				conn.rollback();
//				conn.close();
//			} catch (Exception e) {
//			}
//		}
//		
	}

	
	
	
}
	
	
	

	