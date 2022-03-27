package class19_File_Exception_Handling;

import java.io.File;
import java.io.IOException;

public class FileCreationDeletion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	//	createFolder();
	//	createNewFile();
	//	removeFolder();
		removeFile();
		
	}
	
	
	public static void createFolder() {
		
		File fileObj = new File("C:\\Users\\dutiwari\\Desktop\\Files\\AUtomation");
		fileObj.mkdir();
		System.out.println("Folder got created");
		
		
		  if(fileObj.exists()==true) {
		  
		  System.out.println("Folder Does exists"); }
		  
		  else {
		  
		  System.out.println("Folder Does not exists"); }
		 
		
	}
	
	
	public static void removeFolder() {
		
		File fileObject = new File("C:\\Users\\dutiwari\\Desktop\\Files\\AUtomation");
		fileObject.delete();
		
	}
	
	
	
	public static void createNewFile() throws IOException {
		
		File fileObj = new File("C:\\Users\\dutiwari\\Desktop\\Files\\AutomatedCreatedCSVfile.csv");
		
		fileObj.createNewFile();
		
	}
	
public static void removeFile() {
		
		File fileObject = new File("C:\\Users\\dutiwari\\Desktop\\Files\\AutomatedCreatedCSVfile.csv");
		fileObject.delete();
		
	}
	

}
