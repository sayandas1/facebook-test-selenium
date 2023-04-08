package test.fbtest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriverException;

public class fbtest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dassa\\Downloads\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Hi,welcome to selenium testcases");
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.className("v-button")).click();
		driver.findElement(By.id("email")).sendKeys("**Email**");
		driver.findElement(By.id("pass")).sendKeys("**Password**");
		driver.findElement(By.className("v-button-primary")).click();
		System.out.println("TestCase Executed");
		Thread.sleep(5000);
		//driver.quit();
	}
}
	


