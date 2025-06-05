package resizing;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class res {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//create an object for dimension class
		//pass desired height and width in it
		//apply it on the window
		
		Dimension d = new Dimension(300,900);//(w,h)
		ob.manage().window().setSize(d);
		//ob.close();
		
		
	}
}
