package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver  =  new ChromeDriver();
        
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		boolean isLoginDispalyed = driver.findElement(By.id("login-button")).isDisplayed();
		
		System.out.println("IS LOGIN DISPLAYED:" + isLoginDispalyed);
		
		if(isLoginDispalyed==true) {
		System.out.println("Login button is displayed")	;
		}
		
		else {
			System.out.println("Login button is not displayed")	;
	
		}
		
		String title = driver.getTitle();
		
		String url = driver.getCurrentUrl();
		
		System.out.println("tile" + title);
		
		System.out.println("url" + url);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
