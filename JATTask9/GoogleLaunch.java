package JATTask9SeleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLaunch {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	String Url="http://google.com";
	driver.get(Url);
	driver.manage().window().maximize();
	String CurrentUrl= driver.getCurrentUrl();
	String CurrentpageTitle= driver.getTitle();
	System.out.println("URL of the current page is " + CurrentUrl + " and Title is " + CurrentpageTitle);
	driver.navigate().refresh();
	driver.close();

	}

}
