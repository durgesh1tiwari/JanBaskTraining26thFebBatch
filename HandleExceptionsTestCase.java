package testNgTestCases;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleExceptionsTestCase {

	String appURL = "https://www.saucedemo.com/";
	WebDriver driver;
	
	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();		
		driver.get(appURL);	
	
	}

	
	@Test()
	public void loginWithInValidUserName() {
		try {
			
			driver.findElement(By.id("user-name")).sendKeys("standard_user!!!@@@##@");
			System.out.println("User Name entered");
			driver.findElement(By.id("login-button")).click();
			System.out.println("Login button clicked");
			
			String errorMsg = driver.findElement(By.xpath(".//h3[@data-test='error']")).getText();
			
			String expectedMessge = "Epic sadface: Password is required";
			
			System.out.println("Error msge: " + errorMsg);
			
			Assert.assertEquals(errorMsg, expectedMessge, "Error message does not matched,Hence failed");	
			
		}
		
		catch(Exception e) {
			
			System.out.println("Exception occured" + e);
			
			//Take Screenshot
			
			//Print the exceptiosn into log files
			
		}
		
		finally {
			System.out.println("Test Exceuted");
		}


	}
	
	
	
	
	  @AfterMethod(alwaysRun = false)
	    public void tearDown(ITestResult result) throws IOException {
	        if (!result.isSuccess()) {
	            File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            String failureImageFileName = result.getMethod().getMethodName()
	                    + new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()) + ".png";
	            File failureImageFile = new File(System.getProperty("user.dir") + "//screenshots//" + failureImageFileName);
	            failureImageFile.getParentFile().mkdir();
	            failureImageFile.createNewFile();
	         //   Files.copy(imageFile, failureImageFile);
	        }

	        driver.quit();

	    }
	
	
	
}
