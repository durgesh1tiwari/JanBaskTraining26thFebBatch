import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

//Interface: Can not create any object of an interface,Only reference varibale
//Abstract Class:Can not create any object of Abstract Class,Only reference varibale	
		
	//	WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.navigate().to("https://demoqa.com/buttons");
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		driver.navigate().back();
//Close single instance		
		driver.close();
		
//Close multiple instances
		driver.quit();


	}

}
