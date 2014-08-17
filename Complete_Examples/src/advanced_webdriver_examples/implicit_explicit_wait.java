package advanced_webdriver_examples;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit_explicit_wait {
	public static void main(String args[]) throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.get("http:\\www.myplex.com/");
	    //implicit wait--global wait
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id='Login2']")).click();
	    Thread.sleep(2000L);
	    driver.findElement(By.xpath("//*[@id='login-userid']")).sendKeys("mademvv@gmail.com");
	    driver.findElement(By.xpath("//*[@id='login-password']")).sendKeys("apalya01");
	    driver.findElement(By.xpath("//*[@id='login-submit']")).click();
	    Thread.sleep(2000L);
	   //log out
	    //wait for the element for the element to be present
	    driver.findElement(By.xpath("//*[@id='Profile']/a")).click();
	    
	    //Thread.sleep(2000L);
	   /** WebDriverWait wait=new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='slider1-content']/div")));**/
	  //wait for the element for the element not to be present 
	  //  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='slider1-content']/div")));
	    
	    //fluent wait
	    //wait for the element to appear
	    new FluentWait<WebDriver>(driver)
	    .withTimeout(3,TimeUnit.SECONDS)
	    .pollingEvery(1,TimeUnit.SECONDS)
	    .ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='slider1-content']/div")));
	    //wait for element to be disappear
	   /** new FluentWait<WebDriver>(driver)
	    .withTimeout(5,TimeUnit.SECONDS)
	    .pollingEvery(1,TimeUnit.SECONDS)
	    .ignoring(NoSuchElementException.class).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='slider1-content']/div")));
	    **/
	    System.out.println("Tested completed");
	}

}
