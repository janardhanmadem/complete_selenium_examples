package advanced_webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class page_loading_timeout {

	public static void main(String args[]){
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http:\\www.gmail.com");
		
	}
}
