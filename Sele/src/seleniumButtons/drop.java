package seleniumButtons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		
		
		//create an object for select class
		// pass dropdown box as input
		// index/value/visible text
		
		// only one option can be selected
		 WebElement ele = ob.findElementById("carselect");
		 Select s= new Select(ele);
		 // s.selectByIndex(2);
		s.selectByVisibleText("Benz");
		//s.selectByValue("honda");
	}

}
