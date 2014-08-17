package browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
	public static void main(String args[]){
		System.setProperty("webdriver.IE.driver",System.getProperty("user.home")+"\\src\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://yahoomail.com");
		
	}

}
