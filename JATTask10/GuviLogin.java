package JATTask10SeleniumWebComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuviLogin {
	
	String URL="https://www.guvi.in/";
	WebDriver driver;	
	
	public void LaunchBrowser() {
		 driver=new ChromeDriver();
		
	}
	public void LaunchApp() {
		driver.get(URL);		
		driver.manage().window().maximize();
	}
	
	public void SignUp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.id("name")).sendKeys("Guvitest");
		driver.findElement(By.id("email")).sendKeys("Guvitest10@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Guvi@123");
		driver.findElement(By.id("mobileNumber")).sendKeys("1231231231");
		driver.findElement(By.id("signup-btn")).click();
	}
	
	public void Maybelaterpage() {
		driver.findElement(By.id("laterBtn")).click();
		WebElement text=driver.findElement(By.xpath("//div[@class='left-head']/h1"));
		System.out.println(text.getText());
		driver.navigate().back();	
	}
	
	public void loginpage() {
		driver.findElement(By.id("login-btn")).click();
		driver.findElement(By.id("email")).sendKeys("divyabharathi1797@gmail.com");
		driver.findElement(By.id("password")).sendKeys("******");
		driver.findElement(By.className("login-btn")).click();
		String Title= driver.getTitle();
		WebElement Welcome= driver.findElement(By.className("welcome-text"));
		WebElement Name= driver.findElement(By.className("userName"));
		if(Welcome.isDisplayed() && Name.isDisplayed()) {
			System.out.println("User logged in successfully");
		}
		else {
			System.out.println("Login failed");
		}
		System.out.println(Title);
		
		driver.quit();
		
	}
	public static void main(String[] args) {
		GuviLogin obj=new GuviLogin();
		obj.LaunchBrowser();
		obj.LaunchApp();
		obj.SignUp();
		obj.Maybelaterpage();
		obj.loginpage();
		
	
	}

}
