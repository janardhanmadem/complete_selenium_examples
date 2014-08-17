package advanced_webdriver_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handling_dropdown {
public static void main(String args[]){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.echoecho.com/htmlforms11.htm");
	//driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fui%3D2%26pli%3D1&ltmpl=default");
	driver.manage().window().maximize();
	//selection from drop list
	WebElement droplist=driver.findElement(By.name("dropdownmenu"));
			droplist.sendKeys("Cheese");
	//count of options
	List<WebElement> alloptions=droplist.findElements(By.tagName("option"));
	System.out.println("Total options in the list are :"+alloptions.size());
	//print
	for(int i=0;i<alloptions.size();i++){
		System.out.println(alloptions.get(i).getText());
	}
	//selection validation
	for(int i=0;i<alloptions.size();i++){
	System.out.println(alloptions.get(i).getText()+"---"+alloptions.get(i).getAttribute("selected"));
	}
	
	}
	
}

