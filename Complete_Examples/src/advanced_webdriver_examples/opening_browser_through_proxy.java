package advanced_webdriver_examples;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class opening_browser_through_proxy {
	public static void main(String args[]){
		Proxy p=new Proxy();
		p.setProxyAutoconfigUrl("http://freeproxyserver.net/");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, p);
		FirefoxDriver driver=new FirefoxDriver(cap);
		driver.get("http://youtube.com");
		driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		ChromeDriver d1=new ChromeDriver(cap);
		d1.get("http://yahoo.com");
		d1.manage().window().maximize();
	}

}
