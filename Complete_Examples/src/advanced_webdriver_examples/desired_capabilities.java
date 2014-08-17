package advanced_webdriver_examples;

//import java.net.Proxy;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desired_capabilities {
	public static void main(String args[]){
		Proxy p=new Proxy();
		p.setProxyAutoconfigUrl("http://freeproxyserver.net/");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setJavascriptEnabled(true);
		cap.setCapability(CapabilityType.PROXY, p);
		FirefoxDriver driver=new FirefoxDriver(cap);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		ChromeDriver d1=new ChromeDriver(cap);
		
		
		
	}

}
