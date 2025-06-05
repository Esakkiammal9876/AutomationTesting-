package navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class n1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.google.com");
		
		ob.findElementByLinkText("Images").click();
		
		ob.navigate().back();
		Thread.sleep(3000);
		ob.navigate().forward();
		Thread.sleep(3000);
		ob.close();
		
	}

}
