package JATTask9SeleniumLocators;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wikipedia {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String Url="https://www.wikipedia.org/";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Artificial intelligence");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//List<WebElement> Suggest= driver.findElements(By.xpath("//a[@class='suggestion-link']"));
		List<WebElement> Suggest= driver.findElements(By.xpath("//h3[@class='suggestion-title']"));
	
		for (WebElement option : Suggest) {
            String text = option.getText();
            System.out.println(text); 
            if (text.equalsIgnoreCase("Artificial intelligence")) {
                option.click();
                break;
           }}
		
		driver.findElement(By.xpath("//a[@href=\"#History\"]/div/span[2]")).click();
		WebElement Element= driver.findElement(By.xpath("//h2[@id=\"History\"]"));
		String SectionTitle=Element.getText();
		System.out.println(SectionTitle);
		driver.close();
	}}
