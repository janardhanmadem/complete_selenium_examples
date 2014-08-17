package advanced_webdriver_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class extract_all_inputfields{

public static void main(String args[]){

	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	List<WebElement> fields=driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
	System.out.println(fields.size());
	//fields text
	for(int i=0;i<fields.size();i++){
		System.out.println(fields.get(i).getAttribute("Value"));
		//List<WebElement> fields1=driver.findElements(By.xpath("//input[@type='text']"));
		//System.out.println("null");
	}
	//fields.get(0).sendKeys("One");
	
	

}
}
