package browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Simple_Firefox_Browser {
	

	public static void main(String args[]){
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://accounts.google.com");
		//driver.manage().window().maximize();
	}

}
