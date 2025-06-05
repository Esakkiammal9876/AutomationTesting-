//moving window to an particular point

package Seleniumget;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class m2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//create an object for point class
		//pass desired x and y value in it
		Thread.sleep(4000);
		Point pt  = new Point(200,400);
		ob.manage().window().setPosition(pt);
	
	}

}
