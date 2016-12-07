package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.CourseDTO;
import model.CourseSearchDTO;
import model.EnrolmentDTO;
import model.StudentGradesDTO;

public interface StudentDAO {

    public ArrayList<CourseDTO> findAllcourse(String studentID) throws DAOException, SQLException;
    public ArrayList<CourseDTO> findCourseByCriteria(CourseSearchDTO sear) throws DAOException;
    //public void enrolcourse(EnrolmentDTO enrol) throws DAOException;
    public ArrayList<StudentGradesDTO> listcoursewithGPA(String studentID)throws DAOException, SQLException;
    
}