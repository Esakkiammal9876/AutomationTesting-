package Seleniumget;

import org.openqa.selenium.chrome.ChromeDriver;

public class m1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		System.out.println(ob.getTitle());
		
		System.out.println(ob.getCurrentUrl());
		
		//size: height and width of the window
		//Dimension
		System.out.println(ob.manage().window().getSize());
		
		//position:x and y value of the window
		//point
		System.out.println(ob.manage().window().getPosition());
		
		//browser details
		System.out.println(ob.getCapabilities());
		
	
	//ob.quit();

}
}
