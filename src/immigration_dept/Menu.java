package immigration_dept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to your immigration system!");
		System.out.println("Type a menu option: ");
		System.out.println("1-Add person");
		System.out.println("2-Remove person");
		System.out.println("3-Remove N people");
		System.out.println("4-Find person");
		System.out.println("5-Update person information");
		System.out.println("6-Find person");
		
		try {
			Scanner scanner = new Scanner(System.in);
			int selectedOption = scanner.nextInt();
			
			if(selectedOption == 1){
				menu2();
			}else if( selectedOption ==  2){
				System.out.println("hi2");
			}else if( selectedOption ==  3){
				System.out.println("hi3");
			}else if( selectedOption ==  4){
				System.out.println("hi4");
			}else if( selectedOption ==  5){
				System.out.println("hi5");
			}else if( selectedOption ==  6){
				System.out.println("hi6");
			}else {
				System.out.println("Please, type one of the valid");
			}
		}catch(InputMismatchException e){
			System.out.println("Invalid input");
			}
		
		
	}
	
	public static void menu2() {
		MyLinkedList list = new MyLinkedList();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("First name:");
		String firstName = scanner.next();
		
		System.out.println("Last name:");
		String lastName = scanner.next();
		
		System.out.println("Passport:");
		String passport = scanner.next();
		
		System.out.println("At position:");
		int index = scanner.nextInt();
		
		InnisLinkedList person = new InnisLinkedList(firstName, lastName, passport, 104);
		
		list.insertAtPos(person, index);
		System.out.println(list.getSize());
		
		
		System.out.println("At position 2:");
		int index2 = scanner.nextInt();
		InnisLinkedList person2 = new InnisLinkedList(firstName, lastName, passport, 104);
		list.insertAtPos(person2, index2);
		System.out.println(list.getSize());
		
	}
	
	

}

