package webelements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver  =  new ChromeDriver();
		
		driver.get("http://demo.virtuemart.net/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		List<WebElement> elements = driver.findElements(By.xpath(".//*[@id='menuwrapper']/ul/li/a"));
		
		int size = elements.size();
		List<String> elementsText = new ArrayList<>();
		
		for(int i=0;i<size;i++) {
			
			elementsText.add(elements.get(i).getText());
			
			System.out.println("Value at index:" + i +"is :" + elementsText);
	
		}	
		System.out.println("Menu List" + elementsText);
		
		
		driver.findElement(By.xpath("(.//*[@id='menuwrapper']/ul/li/a)[6]")).click();
		
		
		
		}
		


	
	
}
