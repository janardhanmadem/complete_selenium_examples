package advanced_2_examples;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploading_file {
	public static void main(String args[]) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "G:\\workspace\\Complete_Examples\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:\\www.salesforce.com");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //login
        driver.findElement(By.xpath("//*[@id='button-login']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("janardhan.m@apalya.com");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("apalya01");
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        Thread.sleep(1000L);
        //click on file tab
        driver.findElement(By.xpath("//*[@id='File_Tab']")).click();
        driver.findElement(By.xpath("//*[@id='File_Tab']")).click();
        driver.findElement(By.xpath("//*[@id='multiUploadBtn']")).click();
        StringSelection ss=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        //driver.findElement(By.xpath("//*[@id='fileUploaderDiv']/div[2]/span")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
        Thread.sleep(1000L);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000L);
       // WebDriverWait wait=new WebDriverWait(driver,40);
        new FluentWait<WebDriver>(driver)
        .withTimeout(40,TimeUnit.SECONDS)
        .pollingEvery(5,TimeUnit.SECONDS)
        .ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='multiUploadCloseBtn']")));
        driver.findElement(By.xpath("//*[@id='multiUploadCloseBtn']")).click();
        
        
	}

}
