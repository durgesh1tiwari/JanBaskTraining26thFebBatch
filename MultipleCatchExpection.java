package class19_File_Exception_Handling;


public class MultipleCatchExpection {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		 try{    
             int a[]=new int[5];    
             a[5]=30/10; 
             
             a[200] = 56;
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
            	
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                System.out.println(e.getStackTrace());
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }
		 
		 finally {
			System.out.println("I am in finally block");
		}
            System.out.println("rest of the code");    
 
	}

}
