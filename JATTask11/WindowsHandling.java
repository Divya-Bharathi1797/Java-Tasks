package JATTask11WindowsandFrames;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	String URL= "https://the-internet.herokuapp.com/windows";
	WebDriver driver;
	
	public void LaunchApp() {
	 driver=new ChromeDriver();
		driver.get(URL);		
		driver.manage().window().maximize();
	}
	
	public void ParentWindow()  {
		String ParentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	
		 Set<String> ChildWindows=driver.getWindowHandles();
		for(String handle : ChildWindows) {
			if(!handle.equals(ParentWindow)) {
				driver.switchTo().window(handle);
			String ExpectedChildWindowTitle= "New Window";
			String ActualChildWindowTitle=driver.getTitle();
			if(ActualChildWindowTitle.equals(ExpectedChildWindowTitle)) {
				System.out.println("Title Matched");
			}
			else {
				System.out.println("Title Not Matched");
				
			}
			
			driver.close();
			}
			driver.switchTo().window(ParentWindow);
			
			String ExpectedParentWindowTitle= "The Internet";
			String ActualParentWindowTitle=driver.getTitle();
			System.out.println(ActualParentWindowTitle);
			if(ActualParentWindowTitle.equals(ExpectedParentWindowTitle)) {
				System.out.println("Parent Window Title Matched");
			}
			else {
				System.out.println("Parent Window Title Not Matched");
			}
			
		}
		}	
	

	public static void main(String[] args)  {
		WindowsHandling obj=new WindowsHandling();
		obj.LaunchApp();
		obj.ParentWindow();

	}

}
