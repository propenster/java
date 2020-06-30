package StudentPackage.dev.java.propenster;
import java.time.LocalDate;
public class Course{

	private String courseCode;
	private String courseTitle;
	private int numberOfUnits;
	private LocalDate DateCreated;

	public DayStudent(String courseCode, String courseTitle, int numberOfUnits, LocalDate newDateCreated){
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		this.numberOfUnits = numberOfUnits;
		this.setDateCreated(newDateCreated);
	}



	public LocalDate getDateCreated(){
		return this.DateCreated;
	}
	public void setDateCreated(LocalDate newDateCreated){
		this.DateCreated = newDateCreated;
	}


	public static void main(String[] args) {
		DayStudent newDayStudent = new DayStudent(1, "David Adetunji", "Oceanography", new Course("MST 301", "Marine Coastal Waters Introduction", 3, new LocalDate.now()));
	}
}