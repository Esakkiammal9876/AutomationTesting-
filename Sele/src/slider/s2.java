package slider;

import org.openqa.selenium.chrome.ChromeDriver;

public class s2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.slideteam.net/change-management-powerpoint-presentation-slides.html");
		
		ob.findElementById("custom-prev").click();
	}

}
