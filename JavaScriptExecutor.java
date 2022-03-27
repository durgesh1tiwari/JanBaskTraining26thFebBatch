package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver  =  new ChromeDriver();
        
		driver.get("https://www.salesforce.com/in/?ir=1");
		
		driver.manage().window().maximize();
		
		WebElement salesforce = driver.findElement(By.xpath(".//*[contains(text(),'Why Salesforce')]"));
		
		Thread.sleep(5000);
		
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("arguments[0].scrollIntoView(true);",salesforce);
	     Thread.sleep(5000);
	     js.executeScript("arguments[0].click();", salesforce);
	     
	     driver.close();
		
		
	}

}
