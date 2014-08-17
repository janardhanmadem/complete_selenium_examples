package browsers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class profile_firefox {
	public static void main(String args[]) throws Throwable{
		ProfilesIni pro=new ProfilesIni();
		FirefoxProfile p=pro.getProfile("test");
		System.out.println("Profile is:"+p);
		FirefoxDriver driver=new FirefoxDriver(p);
		driver.get("http://www.yahoo.com");
		Thread.sleep(2000L);
		//driver.manage().window().maximize();
		
	}

}
