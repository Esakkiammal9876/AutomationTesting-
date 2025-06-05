package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "D:\\\\download\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//cookies:temporary information stored by the browser
		//set
		//no of cookies
		Set<Cookie> s = ob.manage().getCookies();
		System.out.println("Number of cookies "+ s.size());
		
		ob.manage().deleteAllCookies();
		
		Set<Cookie> s1 = ob.manage().getCookies();
		System.out.println("Number of cookies after Deletion "+ s1.size());
		ob.quit();
		
		}
}
