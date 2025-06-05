package seleniumButtons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		
		//create an object for select class
				// pass dropdown box as input
				// index/value/visible text
				
				// only one option can be selected
				WebElement ele = ob.findElementById("multiple-select-example");
				Select s= new Select(ele);
				s.selectByIndex(0);
				s.selectByVisibleText("Peach");
				s.selectByValue("orange");
				Thread.sleep(3000);
				s.deselectByIndex(1);
				ob.quit();
	}

}
