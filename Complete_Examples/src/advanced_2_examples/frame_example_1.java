package advanced_2_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame_example_1 {
	public static void main(String args[]){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://timesofindia.indiatimes.com/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
	}}


