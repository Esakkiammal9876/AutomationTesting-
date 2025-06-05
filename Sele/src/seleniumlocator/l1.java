package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.mycontactform.com");
		
		/* there are 8 locators
		 * 
		 * id
		 * name
		 * classname
		 * linktext
		 * partial linktext
		 * tagname
		 * XPath 
		 * CSS
		 * 
		 */
		
		//id
		driver.findElementById("user").sendKeys("dhivyakarthi123");
		
		//name
		driver.findElementByName("pass").sendKeys("1243546");
		
		//class
		driver.findElementByClassName("btn_log").click();
		}
}	
