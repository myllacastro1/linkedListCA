package immigration_dept;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class InnisLinkedList {
	//InnisLinkedList<String> person = new InnisLinkedList<String>();
	int id;
	String date = getCurrentDate();
	String firstName;
	String lastName;
	String passport;
	
	
	public InnisLinkedList() {
		
	}
	
	public InnisLinkedList(String firstName, String lastName, String passport, int id){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passport = passport;
		
	}
	
	
	private static String getCurrentDate() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		return dtf.format(localDate);
	}
	
	
}
