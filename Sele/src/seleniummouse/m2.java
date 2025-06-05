package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m2 {
	public static void main(String[] args) throws InterruptedException 	 {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");
		
		//switch ur control to that frame
		//frame,id,name or index
		ob.switchTo().frame(0);
		 
		Actions ac = new Actions(ob);
		WebElement e1 = ob.findElementById("draggable");
		WebElement e2 = ob.findElementById("droppable");
		ac.dragAndDrop(e1, e2).build().perform();
		Thread.sleep(3000);
		
		ob.close();
		
		
		
		
		}

}
