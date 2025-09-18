package JATTask11WindowsandFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	String URL= "http://the-internet.herokuapp.com/nested_frames";
	WebDriver driver;
	
	public void LaunchApp() {
	 driver=new ChromeDriver();
		driver.get(URL);		
		driver.manage().window().maximize();
	}
	
	public void LeftFrame() {
		driver.switchTo().frame(0);
		List<WebElement> Frame=driver.findElements(By.tagName("frame"));
		System.out.println("number of frames " + Frame.size());
		
		WebElement Leftframe= driver.findElement(By.cssSelector("[name='frame-left']"));
		driver.switchTo().frame(Leftframe);
		String LeftFrameActual=driver.findElement(By.tagName("body")).getText();
		String LeftFrameExpected= "LEFT";
		if(LeftFrameActual.equals(LeftFrameExpected)) {
			System.out.println("Left Frame Title Verified");			
		}
		else {
			System.out.println("Left Frame Title Not Verified");	
		}
		driver.switchTo().parentFrame();
	}
		
	public void MiddleFrame() {
		WebElement Middleframe= driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]"));
		driver.switchTo().frame(Middleframe);
		String MiddleFrameActual=driver.findElement(By.tagName("body")).getText();
		String MiddleFrameExpected= "MIDDLE";
		if(MiddleFrameActual.equals(MiddleFrameExpected)) {
			System.out.println("Middle Frame Title Verified");			
		}
		else {
			System.out.println("Middle Frame Title Not Verified");	
		}
		driver.switchTo().parentFrame();
	
	
	}
	
	public void RightFrame() {
		
		WebElement Rightframe= driver.findElement(By.xpath("//frame[@name=\"frame-right\"]"));
		driver.switchTo().frame(Rightframe);
		String RightFrameActual=driver.findElement(By.tagName("body")).getText();
		String RightFrameExpected= "RIGHT";
		if(RightFrameActual.equals(RightFrameExpected)) {
			System.out.println("Right Frame Title Verified");			
		}
		else {
			System.out.println("Right Frame Title Not Verified");	
		}
		driver.switchTo().parentFrame();
		
	}
	
	public void BottomFrame() {
		driver.switchTo().defaultContent();
		WebElement Bottomframe= driver.findElement(By.xpath("//frame[@name=\"frame-bottom\"]"));
		driver.switchTo().frame(Bottomframe);
		String BottomFrameActual=driver.findElement(By.tagName("body")).getText();
		String BottomFrameExpected= "BOTTOM";
		if(BottomFrameActual.equals(BottomFrameExpected)) {
			System.out.println("Bottom Frame Title Verified");			
		}
		else {
			System.out.println("Bottom Frame Title Not Verified");	
		}
		driver.switchTo().parentFrame();
		
		driver.close();
		
	}	

	public static void main(String[] args) {
		FrameHandling obj=new FrameHandling();
		obj.LaunchApp();
		obj.LeftFrame();
		obj.MiddleFrame();
		obj.RightFrame();
		obj.BottomFrame();
		
		
	}

}
