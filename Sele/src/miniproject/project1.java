package miniproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class project1 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://in.linkedin.com/");
		
		//ob.findElementById("user").sendKeys("mes_sweetie_");
		//ob.findElementByName("pass").sendKeys("Sudha&#21");
		
		

}
}