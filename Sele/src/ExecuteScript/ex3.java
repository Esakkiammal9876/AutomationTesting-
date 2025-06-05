package ExecuteScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class ex3 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://demo.automationtesting.in/Register.html");
		
		//pg down and pg up
		
		/*ob.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		ob.quit();*/
		
		ob.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
		ob.quit();

}
}
