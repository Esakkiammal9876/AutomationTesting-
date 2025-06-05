package ExecuteScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class ex2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		// zoom in : greater than 100
		// zoom out : less than 100
		
		ob.executeScript("document.body.style.zoom='150%'"); //zoom in
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom='100%'"); //Normal
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom='50%'"); //zoom out
		Thread.sleep(3000);
		//ob.quit();

	}

}


