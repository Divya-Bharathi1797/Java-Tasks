package JATTask10SeleniumWebComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	String URL="https://jqueryui.com/datepicker/";
	WebDriver driver;	
	
	public void LaunchBrowser() {
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	public void LaunchApp() {
		driver.get(URL);		
		driver.manage().window().maximize();
	}
	
	public void switchtoframe() {
		WebElement demoFrame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(demoFrame);
	}
	
	public void Calendar(String month, String day) {
		driver.findElement(By.id("datepicker")).click();
		
		while(true) {
			String currentmonth= driver.findElement(By.className("ui-datepicker-month")).getText();
			
			if(currentmonth.equals(month)) {
				break;
			}
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		driver.findElement(By.xpath("//a[text()='"+ day +"']")).click();
		
		System.out.println("Selected Date and month is " + day + " " + month );
		
		driver.quit();
	}
	


	public static void main(String[] args) {

		DatePicker object= new DatePicker();
		object.LaunchBrowser();
		object.LaunchApp();
		object.switchtoframe();
		object.Calendar("October", "22");
	}

}
