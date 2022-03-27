package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjects {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver  =  new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//WebElement isntances
		
		WebElement firstNameTextBox = driver.findElement(By.id("firstName"));
		WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
		WebElement emailIdTextBox= driver.findElement(By.id("userEmail"));
		WebElement mobileNumTextBox= driver.findElement(By.id("userNumber"));
		WebElement subjectTextBox = driver.findElement(By.xpath("(.//div[contains(@class,'subjects')])[2]"));
		WebElement currentAddTextBox = driver.findElement(By.id("currentAddress"));
		WebElement male= driver.findElement(By.xpath(".//input[@id='gender-radio-1']"));
		
		//click FirstName
		
		Thread.sleep(5000);
		firstNameTextBox.click();
		firstNameTextBox.sendKeys("HASHMEEN");
		Thread.sleep(5000);
		lastNameTextBox.sendKeys("ABC");
		Thread.sleep(5000);
		emailIdTextBox.sendKeys("durgesh1tiwari@gmail.com");
		firstNameTextBox.clear();
		Thread.sleep(5000);
		
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("arguments[0].scrollIntoView(true);",male);
	     Thread.sleep(5000);
	     js.executeScript("arguments[0].click();", male);
		
		
		
	//	male.click();
		
		
	}

}
