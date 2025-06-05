package seleniumlocator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l3 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		
		/* Tag name
		 * image : img
		 * links : a
		 * elements: div,input.select
		 * 
		 */
		List<WebElement> l = ob.findElementsByTagName("img"); //images
		System.out.println("Number of images "+ l.size());
		
		List<WebElement> l1 = ob.findElementsByTagName("a");
		System.out.println("Number of links "+ l1.size());
		
		List<WebElement> l2 = ob.findElementsByTagName("input");
		System.out.println("Number of elements with input tag "+ l2.size());
		
		List<WebElement> l3 = ob.findElementsByTagName("div");
		System.out.println("Number of elements with div  "+ l3.size());
		
		ob.quit();
	}
}