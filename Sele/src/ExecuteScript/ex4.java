package ExecuteScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://demo.automationtesting.in/Register.html");
		
		//to create alert or pop up

		ob.executeScript("alert('fffhtime out')");
		//ob.executeScript("window.confrim('time out')");
		Thread.sleep(3000);

		Alert al = ob.switchTo().alert();
		Thread.sleep(3000);	
		//al.dismiss();
		
	    al.accept();  
}

}
