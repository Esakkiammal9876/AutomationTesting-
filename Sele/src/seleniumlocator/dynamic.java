package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {
	
	public static void main(String[] args) {
		
		// following-preceding
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//username=> login button
		//ob.findElementByXPath("//*[@id=\"user\"]//following::input[2]").click();
		
		//login=> username 
		//ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input//preceding::input[2]").sendKeys("hello");
		
		//parent=> child
		///String tx = ob.findElementByXPath("//*[@id=\"right_col_bottom\"]//child::p[2]").getText();
		//System.out.println(tx);
		
		// child
		//System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[2]//parent::div").getLocation());
		
		//following-sibling
		String tx = ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/img//following-sibling::p[3]").getText();
		System.out.println(tx);
		
		//preceding-sibling
		//String tx = ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[4]//preceding-sibling::p[1]").getText();
		//System.out.println(tx);
	}
}
