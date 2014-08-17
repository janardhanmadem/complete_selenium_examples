package advanced_2_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame_example_2 {
	public static void main(String args[]){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/");
		driver.manage().window().maximize();
		//fire bug will not help to identify frame need to go to page source and check with fame name "livescores"
		driver.findElement(By.xpath("//a[@href='/ci/engine/match/scores/live.html']")).click();
		driver.switchTo().frame("liveScores");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/p[1]/span/a")).click();
		
	}

}
