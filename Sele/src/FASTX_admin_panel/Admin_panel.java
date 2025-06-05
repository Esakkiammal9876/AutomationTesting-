package FASTX_admin_panel;


import org.openqa.selenium.chrome.ChromeDriver;

public class Admin_panel {
	
	 public static void main(String[] args) 	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		 ob.get("http://ec2-3-110-51-78.ap-south-1.compute.amazonaws.com:447");
		 

		ob.findElementByXPath("//*[@id=\"mat-input-0\"]").sendKeys("admin@gmail.com");
		 
		 ob.findElementByXPath("//*[@id=\"mat-input-1\"]").sendKeys("Test@123");
		 
		 ob.findElementByXPath("/html/body/app-root/app-loginpage/div/div/div[2]/div/div[2]/form/div[3]/button").click();
		
	 }

}
