package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

//import com.gargoylesoftware.htmlunit.BrowserVersion;

public class htmlunitdriver {
	public static void main(String args[]) {
		
		WebDriver driver=new HtmlUnitDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://google.co.in");
		System.out.println("Page title:"+driver.getTitle());
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("chess");
		element.sendKeys(Keys.ENTER);
		System.out.println("Page title:"+driver.getTitle());
		driver.quit();
		
			
		
	}

}
