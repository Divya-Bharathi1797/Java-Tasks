package JATTask10SeleniumWebComponent;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(0);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));
		WebElement source= driver.findElement(By.xpath("//div[@id='draggable']"));				
		WebElement target= driver.findElement(By.xpath("//div[@id='droppable']"));			
		
		Actions Act=new Actions(driver);
		Act.dragAndDrop(source, target).build().perform();
		WebElement GetText=driver.findElement(By.xpath("//p[text()='Dropped!']"));
		System.out.println(GetText.getText());	
		
		
		String Textcolor=target.getCssValue("color");
		System.out.println("Text color of Dropped is " + Textcolor);
		if(Textcolor.equals("rgba(119, 118, 32, 1)")) {
			System.out.println("Text color of Dropped is verified and successfull" );
		}
		else {
			System.out.println("Text Color not verified");
		}
		
		String Droppedtext= target.getText();
		if(Droppedtext.equals("Dropped!")) {
			System.out.println("Drag and Drop is successfull-Text verified");
		}
		else {
			System.out.println("Not Matched");
		}		
		
		driver.close();
	
	
}

}
