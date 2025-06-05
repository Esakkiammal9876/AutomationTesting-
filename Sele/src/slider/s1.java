package slider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class s1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://jqueryui.com/slider/");
		
		//switch ur control to that frame
		//frame,id,name or index
		ob.switchTo().frame(0);
		
		Actions ac = new Actions(ob);
		WebElement e1 = ob.findElementById("slider"); 
		//WebElement e2 = ob.findElementById("slider-vertical");
		ac.dragAndDropBy(e1, 60, 0).build().perform();
		Thread.sleep(4000); 
		
		
		
		//horizontal slider:move along x-axis,y value will be 0
		//vertical slider:move along y-axis,x value will be 0
		ob.quit();
		}

}
