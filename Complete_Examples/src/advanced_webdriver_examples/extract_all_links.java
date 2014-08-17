package advanced_webdriver_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class extract_all_links {
	public static void main(String args[]){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.bbc.com");
		driver.manage().window().maximize();
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println("Tota links:"+ alllinks.size());
		//work with particular link
		WebElement link35=alllinks.get(15);
		System.out.println(link35.getText());
		
		//System.out.println(link35)--wrong way of coding;
		//to print all links
		for(int i=0;i<alllinks.size();i++){
			System.out.println(alllinks.get(i).getText());
		}
		
		
	}

}
