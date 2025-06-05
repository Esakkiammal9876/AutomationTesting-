package seleniumButtons;

import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		
		ob.findElementById("bmwradio").click();
		Thread.sleep(3000);
		ob.findElementById("benzradio").click();
		Thread.sleep(3000);
		ob.findElementById("hondaradio").click();
		Thread.sleep(3000);
		ob.quit();
	}

}
