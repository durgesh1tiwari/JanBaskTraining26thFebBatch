package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver  =  new ChromeDriver();
        
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		
		String findText = driver.findElement(By.xpath("(.//a[contains(.,'Computer')])[1]")).getText();
		
		System.out.println(findText);
		
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Shoes");
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("small-searchterms")).clear();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
		
		driver.close();
		
		
		
	}

}
