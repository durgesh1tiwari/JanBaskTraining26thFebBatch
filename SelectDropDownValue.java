package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver  =  new ChromeDriver();
        
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(15000);
		
		
		Select sel = new Select(driver.findElement(By.className("product_sort_container")));
		
		sel.selectByIndex(2);
		
		Thread.sleep(5000);
		
	//	sel.selectByValue("hilo");
		
		Thread.sleep(5000);
		
		sel.selectByVisibleText("Name (A to Z)");
		
		
	}

}
