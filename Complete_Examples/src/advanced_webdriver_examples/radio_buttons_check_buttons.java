package advanced_webdriver_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radio_buttons_check_buttons {
	public static void main(String args[]){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		List<WebElement> radio=driver.findElements(By.xpath("//*[@name='group1']"));
		//count of radio buttons for particular group
		System.out.println("Total radio buttons: "+radio.size());
		//list all options
		for(int i=0;i<radio.size();i++){
			System.out.println(radio.get(i).getAttribute("value"));
		}
		
		//to check default selection
		System.out.println("************Before selection***************");
		System.out.println(radio.get(0).getAttribute("checked"));
		System.out.println(radio.get(1).getAttribute("checked"));
		System.out.println(radio.get(2).getAttribute("checked"));
		//selection 
				radio.get(0).click();
		System.out.println("************After selection****************");
		System.out.println(radio.get(0).getAttribute("checked"));
		System.out.println(radio.get(1).getAttribute("checked"));
		System.out.println(radio.get(2).getAttribute("checked"));
	}

}
