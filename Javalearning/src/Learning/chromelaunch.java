package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromelaunch {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
	//WebDriver driver = new EdgeDriver();

	driver.get("https://rahulshettyacademy.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//driver.close();
	//driver.navigate().back();
	driver.findElement(By.className("theme-btn")).click();
	driver.findElement(By.id("name")).sendKeys("Divya");
	driver.findElement(By.cssSelector("input#email")).sendKeys("asdf");




	}

}
