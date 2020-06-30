package StudentPackage.dev.java.propenster;
import java.time.LocalDate;

public class DayStudent extends Student{
	private int id;
	private String name;
	private String department;
	private Course course;
	//Now subclasses additional fields...
	private String HomeAddress;

	public DayStudent(
		int studentID,
		String studentName,
		String studentDepartment,
		Course studentCourseChoice,
		String address)
	{
		//Constructor for fields to be inherited from the Super Class
		// Using the 'super' keyword...
		super(studentID,
			studentName,
			studentDepartment,
			studentCourseChoice
			);
		this.HomeAddress = address;
	}
	//Create a setter and getter for the local instance vairable to this class...
	public void setStudentHomeAddress(String HomeAddress){
		this.HomeAddress = HomeAddress;
	}
	public String getStudentHomeAddress(){
		return this.HomeAddress;
	}
	//Replicate the method in the super class with the same name...
	public void getStudentDetails(){
		super.getStudentDetails();
		System.out.println("Home Address: {0}", getStudentHomeAddress());
	}

	public static void main(String[] args) {
		DayStudent newDayStudent = new DayStudent(1, "David Adetunji", "Oceanography", new Course("MST 301", "Marine Coastal Waters Introduction", 3, new LocalDate.now()));

		newDayStudent.getStudentDetails();

		tudent dayStudent = new DayStudent(1, "David Adetunji", "Oceanography", new Course("MST 301", "Marine Coastal Waters Introduction", 3, new LocalDate.now()));
		dayStudent.getStudentDetails();

	}
}