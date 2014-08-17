package advanced_2_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
//import org.openqa.selenium.support.events.WebDriverEventListener;

public class listenertest {
	public static void main(String args[]) throws Throwable{
		WebDriver web_driver=new FirefoxDriver();
		web_driver.manage().window().maximize();
		EventFiringWebDriver driver=new EventFiringWebDriver(web_driver);
		mylistener mylistener=new mylistener();
		driver.register(mylistener);
		driver.navigate().to("https://accounts.google.com");
		driver.findElement(By.xpath("//*[@id='link-forgot-passwd']")).click();
		Thread.sleep(2000L);
		//back button'
		System.out.println("going ot click back button");
		driver.navigate().back();
		Thread.sleep(4000L);
		//click on need help link
		driver.navigate().forward();
		Thread.sleep(3000L);
		driver.quit();
		
		
	}

}
