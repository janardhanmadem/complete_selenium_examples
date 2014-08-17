package advanced_2_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class front_back_buttons {
public static void main(String args[]) throws Throwable{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://accounts.google.com/");
	//need help  page
	driver.findElement(By.xpath("//*[@id='link-forgot-passwd']")).click();
	Thread.sleep(5000L);
	//back button
	driver.navigate().back();//back gmail.com
	Thread.sleep(5000L);
	//forward button
	driver.navigate().forward();//open help page again
	Thread.sleep(5000L);
	driver.quit();
}
}
