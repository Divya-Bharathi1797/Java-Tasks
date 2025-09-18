package JATTask9SeleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String Url="https://www.demoblaze.com/";
		driver.get(Url);
		driver.manage().window().maximize();
		String ActualTitle= driver.getTitle();
		String ExpectedTitle= "STORE";
		System.out.println("Title of the page is " + ActualTitle);
		if(ActualTitle.equals(ExpectedTitle)) {
		System.out.println("Page landed on Correct WebSite");
		}
		else {
		System.out.println("Page not landed on Correct WebSite");
		}
		driver.close();

		}

	}


