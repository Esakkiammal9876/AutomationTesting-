package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class basics  {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		
		//maximize
		ob.manage().window().maximize();		
		//refresh
		for(int i=0;i<3;i++) {
			ob.navigate().refresh();
		}
		
		//hold the pg
		Thread.sleep(3000);
		
		ob.quit();
	}

}



