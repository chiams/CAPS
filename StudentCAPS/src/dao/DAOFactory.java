package dao;

public abstract class DAOFactory {


	public static StudentDAO getStudentDao() {
		StudentDAO sdao = new StudentDAOImpl();
		return sdao;
		}

}
