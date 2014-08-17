package advanced_webdriver_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class extract_links_from_specific_block2 {
	public static WebDriver driver;
	public static void main(String args[]){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bbc.com/");
		String part1="//*[@id='news_moreTopStories']/ul/li[";
		String part2="]/a";
		int i=1;
		while(iselementpresent(part1+i+part2)){
			String text=driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(text);
			driver.findElement(By.xpath(part1+i+part2)).click();
			System.out.println(driver.getTitle());
			driver.get("http://www.bbc.com/");
			i++;
		}
		}
		public static boolean iselementpresent(String xpath){
			int count=driver.findElements(By.xpath(xpath)).size();
			if(count==0)
				return false;
			else
				return true;
		}
	}


