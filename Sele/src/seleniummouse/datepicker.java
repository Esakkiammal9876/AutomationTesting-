package seleniummouse;

import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://jqueryui.com/datepicker/");
		
		//switch ur control to that frame
		//frame,id,name or index
		ob.switchTo().frame(0);
		
		ob.findElementById("datepicker").click();
		for(int i=0;i<5;i++) {
			ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
		}
		
		ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(3) > td:nth-child(5) > a").click();
		
		Thread.sleep(4000);
		ob.close();
	}

}
