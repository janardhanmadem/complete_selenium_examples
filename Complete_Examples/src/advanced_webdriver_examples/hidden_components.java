package advanced_webdriver_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hidden_components {
	public static void main(String args[]){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.bbc.com/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText()+"----"+list.get(i).isDisplayed());
		}
	}

}
// element not visible--false
//element visible --true
//element not visible but true means developer develop link with no text