package class19_File_Exception_Handling;

public class SingleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// code that may raise exception
			int data = 100 / 10;
			System.out.println("I am in try block");
			System.out.println("Result is :" + data);
		} catch (ArithmeticException e) {
			System.out.println("I am in catch block");
			System.out.println(e);
		}
		// rest code of the program
		
		finally {
			System.out.println("I will alwaya run: Out of the Try catch block");
		}
		

	}

	
	public void method() {
		
		
		try {
			
		//Actual workable code
			
		//Get database url
			//make connection to database
			//create some sql query
			//pass it to fecth data from any table
			//filter the reult set
			
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			
			//Capturing the exception, reason for failure
			
			//SQLExecotion,Invalidexception,systx
			
		}
		
		finally {
			
			//I will always run
			
			//Close my all the connections
			
		}
		
		
	}
	
	
	
	
}
