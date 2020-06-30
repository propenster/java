package dev.java.propenster;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Datetime{



	public static void main(String[] args) {
		LocalDate newDateObj = LocalDate.now();
		System.out.println(newDateObj);

		LocalTime newTimeObj = LocalTime.now();
		System.out.println(newTimeObj);

		LocalDateTime newDateTimeObj = LocalDateTime.now();
		System.out.println(newDateTimeObj);

		/*
			Now Let's use the DateFormatter to kinda 
			format our Date Time Object in a prettier way....
			See the magic below...
		*/
			/*
				See the FOrmat.... patterns here...
				You put any of these into the ofPatter method of the
				DateTimeFormatter

				yyyy-MM-dd	"1988-09-29"	
				dd/MM/yyyy	"29/09/1988"	
				dd-MMM-yyyy	"29-Sep-1988"	
				1zE, MMM dd yyyy	"Thu, Sep 29 1988"
			*/

		LocalDateTime myDateTimeObjToBeFormatted = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateTimeObjToBeFormatted);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateTimeObjToBeFormatted.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	}
}