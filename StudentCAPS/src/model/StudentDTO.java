package model;

public class StudentDTO {

	private String studentID;
	private String firstName;
	private String secondName;
	private String address;
	private String yearStudy;
	private String email;
	private double cGPA;
	
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDTO(String studentID, String firstName, String secondName, String address, String yearStudy,
			String email, double cGPA) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.secondName = secondName;
		this.address = address;
		this.yearStudy = yearStudy;
		this.email = email;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getYearStudy() {
		return yearStudy;
	}

	public void setYearStudy(String yearStudy) {
		this.yearStudy = yearStudy;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getcGPA() {
		return cGPA;
	}

	public void setcGPA(double cGPA) {
		this.cGPA = cGPA;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentID=" + studentID + ", firstName=" + firstName + ", secondName=" + secondName
				+ ", address=" + address + ", yearStudy=" + yearStudy + ", email=" + email + ", cGPA=" + cGPA + "]";
	}

	
	
		
}
