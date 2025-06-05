package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//linktext: word/words=> click on to new url will be opened
		
		ob.findElementByLinkText("Forgotten password?").click();
		//ob.findElementByPartialLinkText("For").click();
		ob.quit();


}

}
