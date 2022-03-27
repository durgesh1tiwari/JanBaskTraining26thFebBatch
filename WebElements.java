package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver  =  new ChromeDriver();
        
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();

//findElement will uniquely identlfy the web element
//findElements will find multiple matching elements		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		driver.close();
		
		
		
		
		
		
	}

}
