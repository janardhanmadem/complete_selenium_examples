package browsers;

import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.jna.platform.win32.Netapi32Util.User;

public class chrome_browser {
	public static void main(String args[]) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "G:\\workspace\\Complete_Examples\\src\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.yahoo.com");
		Thread.sleep(2000L);
		//driver.manage().window().maximize();
		
	}

}
