package advanced_2_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class mylistener extends AbstractWebDriverEventListener {
	public void afterNavigateBack(WebDriver driver){
		System.out.println("Hello");
	}

}
