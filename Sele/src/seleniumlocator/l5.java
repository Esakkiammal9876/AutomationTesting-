package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		ob.findElementByXPath("//*[@id=\"user\"]").sendKeys("heelooo");
		//ob.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("hiiiii");
		
		//ob.findElementByXPath("//*[@id=\"navbar\"]/a").click();
		
		//ob.findElementByXPath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div/form/div/div[1]/div/div/div[1]/div[2]/div").click();
		
		//xpath = xml path language
		//xpath - absolute - copy full xpath
		//ob.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("hi");
		
		//xpath - relative - copy xpath(website)
		//ob.findElementByXPath("//*[@id=\"user\"]").sendKeys("hi");
		
		//syntax: //[@locator/attribute='value']
		//ob.findElementByXPath("//*[@id='user']").sendKeys("hello");
		
		//ob.findElementByXPath("//*[@type='password']").sendKeys("bye");
		Thread.sleep(2000);
		ob.quit();
	
	}

}
