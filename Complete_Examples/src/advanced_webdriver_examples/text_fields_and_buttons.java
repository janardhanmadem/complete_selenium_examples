package advanced_webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class text_fields_and_buttons {
	public static void main(String args[]) throws Throwable{
		WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "G://workspace//Complete_Examples//src//chromedriver.exe");
		//WebDriver driver1=new ChromeDriver();
		driver.get("http:\\www.myplex.com");
		driver.manage().window().maximize();
		//to get default search string
		String x=driver.findElement(By.name("search")).getAttribute("value");
		System.out.println(x);
		//to enter some value in the search
		driver.findElement(By.name("search")).sendKeys("charles");
		String y=driver.findElement(By.name("search")).getAttribute("value");
		System.out.println(y);
		Thread.sleep(2000L);
		//driver.findElement(By.xpath("//*[@id='search1']")).sendKeys(Keys.ENTER);
		//clearing the input text
		driver.findElement(By.xpath("//*[@id='search1']")).clear();
		String z=driver.findElement(By.name("search")).getAttribute("value");
		System.out.println(z);
		
		/////////////////////Buttons/////////////////
		String l=driver.findElement(By.xpath("//*[@id='movies-price']")).getText();//its not a button
		System.out.println(l);
		//buttons
		driver.get("https://accounts.google.com/");
		String m=driver.findElement(By.xpath("//*[@id='signIn']")).getAttribute("value");
		System.out.println(m);
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
		
		
		
		
		
	}

}
