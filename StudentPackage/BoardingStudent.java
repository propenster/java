package StudentPackage.dev.java.propenster;
import java.time.LocalDate;

public class BoardingStudent extends Student{
	private int id;
	private String name;
	private String department;
	private Course course;
	//Now subclasses additional fields...
	private String hostelAddress;

	public DayStudent(
		int studentID,
		String studentName,
		String studentDepartment,
		Course studentCourseChoice,
		String hostelAddress)
	{
		//Constructor for fields to be inherited from the Super Class
		// Using the 'super' keyword...
		super(studentID,
			studentName,
			studentDepartment,
			studentCourseChoice
			);
		this.hostelAddress = hostelAddress;
	}
	//Create a setter and getter for the local instance vairable to this class...
	public void setStudentHostelAddress(String hostelAddress){
		this.hostelAddress = hostelAddress;
	}
	public String getStudentHostelAddress(){
		return this.hostelAddress;
	}
	//Replicate the method in the super class with the same name...
	public void getStudentDetails(){
		super.getStudentDetails();
		System.out.println("Hostel Address: {0}", getStudentHostelAddress());
		// or System.out.println(String.format"%s", getStudentHostelAddress())
	}

	public static void main(String[] args) {
		DayStudent newDayStudent = new DayStudent(1, "David Adetunji", "Oceanography", new Course("MST 301", "Marine Coastal Waters Introduction", 3, new LocalDate.now()));

		newDayStudent.getStudentDetails();

		Student boardingStudent = new BoardingStudent(1, "David Adetunji", "Oceanography", new Course("MST 301", "Marine Coastal Waters Introduction", 3, new LocalDate.now()));
		boardingStudent.getStudentDetails(); 

	}
}