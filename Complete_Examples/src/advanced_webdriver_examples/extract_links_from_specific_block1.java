package advanced_webdriver_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class extract_links_from_specific_block1 {
	public static void main(String args[]) throws Throwable{
		WebDriver driver=new FirefoxDriver();
		driver.get("http:\\www.bbc.com");
		driver.manage().window().maximize();
		WebElement box=driver.findElement(By.xpath("//*[@id='news_moreTopStories']"));
		List<WebElement> links=box.findElements(By.tagName("a"));
		System.out.println("no of links:"+links.size());
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getTitle());
			driver.get("http:\\www.bbc.com");
			Thread.sleep(2000L);
			//build cache
			box=driver.findElement(By.xpath("//*[@id='news_moreTopStories']"));
			links=box.findElements(By.tagName("a"));
			System.out.println("********************");
		}
		
	}

}
