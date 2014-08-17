package advanced_2_examples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class downloading_file {
	public static void main(String args[]){
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.download.floderlist", 2);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip,application/msword");
		WebDriver driver=new FirefoxDriver(profile);
		driver.manage().window().maximize();
		//In google we can search mime type for pdf
		//http://www.webmaster-toolkit.com/mime-types.shtml
		//we can download file using selenium only in firefox
		driver.get("http://developer.sonymobile.com/downloads/drivers/xperia-zl2-driver/");
		driver.findElement(By.xpath("//*[@id='main']/div/article/div[1]/p[2]/a")).click();
	
}
}
