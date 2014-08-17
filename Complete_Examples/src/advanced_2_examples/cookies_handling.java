package advanced_2_examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cookies_handling {
	public static void main(String args[]){
		WebDriver driver=new FirefoxDriver();
		driver.get("http:\\www.gmail.com");
		driver.manage().window().maximize();
		Set<Cookie> c=driver.manage().getCookies();
		//no of cookies for the site
		System.out.println("Total cookies :"+c.size());
		Iterator<Cookie> itr=c.iterator();
		//print all cookies names
		while(itr.hasNext()){
			Cookie k=itr.next();
			System.out.println(k.getDomain()+"--"+k.getName()+"---"+k.getValue());
		}
		//to delete particular cookie
		//driver.manage().deleteCookieNamed("GAPS");
		//to delete all cookies
		driver.manage().deleteAllCookies();
		Set<Cookie> m=driver.manage().getCookies();
		System.out.println("Total cookies :"+m.size());
	}

}
