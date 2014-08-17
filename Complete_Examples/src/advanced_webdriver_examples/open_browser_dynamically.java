package advanced_webdriver_examples;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class open_browser_dynamically {
	public static WebDriver driver;
	public static void main(String args[]) throws Throwable{
		Properties prop=new Properties();
		FileInputStream fp=new FileInputStream("G:\\workspace\\Complete_Examples\\src\\advanced_webdriver_examples\\or.properties");
		prop.load(fp);
		String x=prop.getProperty("browser");
		//WebDriver driver=null;
		System.out.println("browser "+x);
		if(x.equalsIgnoreCase("firefox")){
			 driver=new FirefoxDriver();
			
		}else if(x.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else{
			System.out.println("wrong browser is written in properties");
		}
	driver.get("http://www.yahoo.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='p_13838465-p']")).sendKeys("Apalya");
	String xpath1="//*[@id='p_13838465-results']/li[";
	String xpath2="]/a";
	int i=1;
	while(iselementpresent(xpath1+i+xpath2)){
		String y=driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
		System.out.println("Matched String is:"+y);
		i++;
	}
	driver.findElement(By.xpath("//*[@id='search-submit']")).click();
	//driver.
	Thread.sleep(2000L);
	System.out.println(driver.getTitle());
	//driver.quit();
	}
	public static boolean iselementpresent(String xpath) throws Throwable{
		//System.out.println(driver);
		Thread.sleep(4000L);
		int m=driver.findElements(By.xpath(xpath)).size();
		if(m==0){
			//System.out.println("false");
			return false;
		}else{
			//System.out.println("true");
			return true;
		}
	}
}
