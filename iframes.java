package webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/frames");

		driver.manage().window().maximize();
//Switch to frame by index	: Method overloading	
		driver.switchTo().frame(0);
		
//swtich to frame by name : Method overloading
		driver.switchTo().frame("Method overloading");
//Switch to parent frame		
		driver.switchTo().defaultContent();	
		
	}

}
