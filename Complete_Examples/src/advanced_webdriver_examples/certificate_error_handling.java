package advanced_webdriver_examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class certificate_error_handling {
	public static void main(String args[]){
		FirefoxProfile fp=new FirefoxProfile();
		fp.setAcceptUntrustedCertificates(true);
		fp.setAssumeUntrustedCertificateIssuer(false);
		WebDriver driver=new FirefoxDriver(fp);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://support.google.com");
		//for chrome no need to write code,chrome.exe will manage certificates
		System.setProperty("webdriver.chrome.driver","G:\\workspace\\Complete_Examples\\src\\chromedriver.exe");
		driver=new ChromeDriver();
		//for ie
		System.setProperty("webdriver.IE.driver",System.getProperty("user.home")+"\\src\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		//certificate error in ie
		driver.get("https://support.google.com");
		driver.navigate().to("javascript:document.getElementById('overridelink').click()");
		
		//other method
		driver.get("baseUrl");
		driver.findElement(Byname("overridelink")).sendKeys(Keys.ENTER);
		
		
	}

	private static By Byname(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
