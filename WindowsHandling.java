package webelements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dutiwari\\Downloads\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();

		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String parent = it.next();
		String child = it.next();

		System.out.println("Parent window --> " + parent);
		System.out.println("child  window --> " + child);

		// driver.switchTo().window(child);

		/*
		 * Thread.sleep(3000); driver.findElement(By.linkText("Our Story")).click();
		 * Thread.sleep(3000); driver.close();
		 */

	}

}
