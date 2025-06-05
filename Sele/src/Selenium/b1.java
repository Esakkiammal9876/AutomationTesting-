package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class b1 {
	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
	ChromeDriver ob = new ChromeDriver();
	ob.get("https://www.shopsy.in/");
	
	ob.findElementByXPath("//*[@id=\"__next\"]/main/div[1]/div/div[2]/div[1]/div/div/div[1]").click();
	Thread.sleep(3000);
	ob.findElementByClassName("sc-4a2e88f0-1 ggSRsZ").sendKeys("9463826317");
}
	

}
