package advanced_webdriver_examples;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class take_screenshot {
	public static void main(String args[]) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.bbc.com/");
		driver.manage().window().maximize();
		try{
		//screen shot
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("G:\\selenium\\Selenium\\screenshots\\"+driver.getTitle()+".jpg"));
		}catch(Exception e){
			System.out.println("error message"+e.getMessage());
			e.printStackTrace();
		}
		driver.close();
	}

}
