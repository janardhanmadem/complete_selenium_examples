package advanced_2_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable_managing_dynamically {
	public static void main(String args[]){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.xpath("//*[@id='main']/table[1]"));
		//get row size
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Total no of rows :"+rows.size());
		//getting column size
		for(int rownum=1;rownum<rows.size();rownum++){
			List<WebElement> cols=rows.get(rownum).findElements(By.tagName("td"));
			if(rownum==1){
			System.out.println("Total no of columns :"+cols.size());
			}
			for(int colnum=0;colnum<cols.size();colnum++){
				System.out.print(cols.get(colnum).getText()+"----");
			}
			System.out.println();
		}
		
		
	}

}
