package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.DAOException;
import dao.DAOFactory;
import dao.StudentDAO;
import dao.StudentDAOImpl;
import exception.NotFoundException;
import model.CourseDTO;
import model.CourseSearchDTO;
import model.StudentGradesDTO;

public class StudentService {
	
	private StudentDAO studentDao;
	
	public StudentService() {
		studentDao = DAOFactory.getStudentDao();
	}
	
	
    @SuppressWarnings("finally")
	public ArrayList<CourseDTO> findAllcourse(String studentID) {
    	ArrayList<CourseDTO> List = new ArrayList<CourseDTO>();
		try {
			List = studentDao.findAllcourse(studentID);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			return List;
		}
    }
    
    
    @SuppressWarnings("finally")
    public ArrayList<StudentGradesDTO> listcoursewithGPA(String studentID) {
    	ArrayList<StudentGradesDTO> SgradeList = new ArrayList<StudentGradesDTO>();
		try {
			SgradeList = studentDao.listcoursewithGPA(studentID);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			return SgradeList;
		}
    }
    
    
    //waiting to be implemented
    @SuppressWarnings("finally")
	public ArrayList<CourseDTO> findCourseByCriteria(CourseSearchDTO cso){
		ArrayList<CourseDTO> currentList = new ArrayList<CourseDTO>();
		try {
			currentList = studentDao.findCourseByCriteria(cso);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			return currentList;
		}
		
	}
    

}
