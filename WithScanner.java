package class19_File_Exception_Handling;

import java.util.Scanner;

public class WithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withStringData();
	//	withOtherDataType();
	}
	
	
	public static void withStringData() {
		
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter username");
		String userName = myObj.nextLine(); // Read user input	
		
		System.out.println("Username is: " + userName); // Output user input
	}
	
	
	public static void withOtherDataType() {
		
		   Scanner myObj = new Scanner(System.in);

		    System.out.println("Enter name, age and salary:");

		    // String input
		    String name = myObj.nextLine();

		    // Numerical input
		    int age = myObj.nextInt();
		    double salary = myObj.nextDouble();
		   

		    // Output input by user
		    System.out.println("Name: " + name);
		    System.out.println("Age: " + age);
		    System.out.println("Salary: " + salary);
		
		
	}
	

}
