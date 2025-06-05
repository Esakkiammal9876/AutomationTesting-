package ExecuteScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		System.out.println(ob.executeScript("return document.title"));
		System.out.println(ob.executeScript("return document.URL"));
		
		ob.quit();
	
	}
	

}
