package advanced_2_examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertbox {
	public static void main(String args[]) throws Throwable{
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "G:\\workspace\\Complete_Examples\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:\\in.rediff.com");
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='btn_login']")).click();
		Thread.sleep(5000L);
		//CONTROL SWITCH TO alertbox
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
	    //a1.dismiss();
	    //contrrol switch to alert box to page
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//*[@id='loginform1']/div[1]/span/b")).click();
	    Thread.sleep(2000L);
	    driver.findElement(By.xpath("//*[@id='signin_info']/a[2]")).click();
	}

}
