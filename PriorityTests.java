package testNgTestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTests {

//@Test annotation defines the test case	

	/*
	 * @BeforeMethod public void lauchBroswer() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");
	 * 
	 * WebDriver driver = new ChromeDriver(); }
	 */
	
	
	
	
	@Test(enabled=false,priority = 1,description = "This test is testing alert fucntionality")
	public void alertTestCase() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.xpath(".//button[@id='confirmButton']")).click();

		Alert alert = driver.switchTo().alert();

		String alertMessage = alert.getText();

		System.out.println("Alert Message is: " + alertMessage);
	}

	@Test(enabled=true,priority = 4,invocationCount = 5)
	public void lauchGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https:www.google.com");

		driver.manage().window().maximize();
	}

	@Test(enabled=false,priority = 2)
	public void launchCogmento() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://ui.cogmento.com/home");

		driver.manage().window().maximize();
	}

	@Test(enabled=false)
	public void launchSauceDemo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
	}

	@Test(enabled=false)
	public void launchSemoQA() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();
	}

}
