package testNgTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionsClass2 {


	String appURL = "https://www.saucedemo.com/";
	WebDriver driver;
	
	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();		
		driver.get(appURL);	
	
	}
	
	
	@Test()
	public void loginWithValidCredentials() {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		System.out.println("User Name entered");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("secret_sauce");
		System.out.println("Password entered");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Login button clicked");
		
	}
	
	
	@Test()
	public void loginWithValidCredentials(String userName,String Password) {
		
		driver.findElement(By.id("user-name")).sendKeys(userName);
		System.out.println("User Name entered");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(Password);
		System.out.println("Password entered");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Login button clicked");
		
	}

	
	@Test()
	public void loginWithInValidUserName() {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user!!!@@@##@");
		System.out.println("User Name entered");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Login button clicked");
		
		String errorMsg = driver.findElement(By.xpath(".//h3[@data-test='error']")).getText();
		
		String expectedMessge = "Epic sadface: Password is required";
		
		System.out.println("Error msge: " + errorMsg);
		
		Assert.assertEquals(errorMsg, expectedMessge, "Error message does not matched,Hence failed");

	}
	
	@Test
	public void validateLogo() {
		
		
		boolean isLogoDisplayed = driver.findElement(By.xpath(".//div[@class='login_logo']")).isDisplayed();
		
		//if is isLogoDisplayed =true,then it will pass, else it will fail and printthe defined message
		
		Assert.assertTrue(isLogoDisplayed, "SauceLabs logo was not displayed on homepage");
		
		
	}
	
	
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
}
