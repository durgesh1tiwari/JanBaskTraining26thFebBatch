package testNgTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions {

	
	String appURL = "https://www.saucedemo.com/";
	WebDriver driver;
	
	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();		
		driver.get(appURL);	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		System.out.println("User Name entered");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("secret_sauce");
		System.out.println("Password entered");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Login button clicked");
		
		
	}
	
	
	@Test(priority = 0,description = "This test check the login functionality")
	public void TC_01() {

		System.out.println("I am into @Test Method");
		
	}
	
	@Test(priority = 3,description = "This test checks add to bag fucntionality")
	public void TC_02() throws InterruptedException {
		try {
			Thread.sleep(5000);
			System.out.println("Clciking on Add to bag button");
			driver.findElement(By.xpath(".//button[@id='add-to-cart-sauce-labs-backpack']")).click();
			System.out.println("Clicked on Add to bag button");	
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		finally {
			System.out.println("Into FInally block");
		}
		

	}
	
	@Test(priority = 80,description = "Thios test checks sorting")
	public void TC_03() throws InterruptedException {
		
		Select sel = new Select(driver.findElement(By.className("product_sort_container")));
		sel.selectByIndex(2);
		Thread.sleep(5000);
	//	sel.selectByVisibleText("Name (A to Z)");
		
	}
	
	
	@Test()
	public void TC_04() {
		
	//Assertions: it is the 
		
		
		
		
	}
	
	
	
	
	@AfterMethod
	public void closeBroswerInstance() {
		driver.quit();
	}
	
	
	
}
