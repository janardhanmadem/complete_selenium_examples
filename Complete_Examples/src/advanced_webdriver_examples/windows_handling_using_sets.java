
package advanced_webdriver_examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windows_handling_using_sets {
	public static void main(String args[]){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//main window
		driver.get("http://www.jobserve.com/in/en/Job-Search/");
		//generating window id
		Set<String> winids=driver.getWindowHandles();
		System.out.println("Total Browsers :"+winids.size());
		Iterator<String> it=winids.iterator();
		System.out.println(it.next());
		//click to open next window
		driver.findElement(By.xpath("//*[@id='footerfeedback']")).click();
		System.out.println("********************************");
		//main tab and new tab,control is on main tab
		winids=driver.getWindowHandles();
		//get no of windows
		System.out.println("Total Browsers :"+winids.size());
		it=winids.iterator();
		String mainwindowid=it.next();
		String tabwindowid=it.next();
		System.out.println("Main window id :"+mainwindowid);
		System.out.println("new window id :"+tabwindowid);
		//switching control from main to tab window
		driver.switchTo().window(tabwindowid);
		driver.findElement(By.xpath("//*[@id='TXName']")).sendKeys("janardhan");
		driver.findElement(By.xpath("//*[@id='TXEmail']")).sendKeys("mademvv@gmail.com");
		driver.findElement(By.xpath("//*[@id='TXComment']")).sendKeys("Nice job");
		driver.findElement(By.xpath("//*[@id='contactbutton']")).click();
		driver.close();
		//switch control from tab to main window
		driver.switchTo().window(mainwindowid);
		driver.findElement(By.xpath("//*[@id='expanded_foot']/div/div[4]/p/a[1]")).click();
		driver.close();
	}

}
