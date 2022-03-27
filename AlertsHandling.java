package webelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver  =  new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//button[@id='confirmButton']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertMessage = alert.getText();
		
		System.out.println("Alert Message is: "+ alertMessage);
		
		Thread.sleep(5000); 
		
	//	alert.accept();
		
		alert.dismiss();
		
		String confirmationMessage=driver.findElement(By.id("confirmResult")).getText();
		
		System.out.println("Confirmation message is: " + confirmationMessage );		
		
	
		
	}

}
