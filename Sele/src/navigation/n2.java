package navigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class n2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	   
	     driver.executeScript("window.open('https://www.mycontactform.com','_blank');");
	    
	 //get the control of first tab: driver.getwindowhandle()=> String => parent
	 //get the control of both tabs: driver.getwindowhandles() s1={google, mycontactform.com}

	     String parent=driver.getWindowHandle();// control will be in the parent window //google
	 // collecting all the handle
	     Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected) s1={google, mycontactform.com}
	  //step3: iteration
	 
	// iterate through the elements present in set
	     Iterator<String> I1 = s1.iterator();  // hasNext , next()
	  // hasnext=> whether content is there
	  // next -> read the content 
	  
	  while(I1.hasNext())// whether any content is there 
	    {
	      String child_window=I1.next();
	      if(!parent.equals(child_window))// parent is not equal to child window - (parent != child)
    	  { // control is moved to child window 
        driver.switchTo().window(child_window);
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.findElementByLinkText("Help").click();
        Thread.sleep(4000);
        driver.close();
      } 
    }
  
  /*parent: google.com     s1={google.com, mycontactform.com}
   * first iteration:
   *     I1 points to the first element in set => google.com
   *     while I1.hasnext=> content 
   *         I1.next reads google.com and store in parent window
   *         child_window=google
   *         parent!=child_windiow
   *         google!=child_windiow
   *second iteration:
   *    I1 points to the second eklement in set-> mycontactform.com
   *    while I1.hasnext=> content   
   *       I1.next reads contactform and store in child_Widnow
   *       child_window=mycontactform.com
   *       if parent!=child_window
   *          google!=mycontactform
   *             switching control to child_window,mycontactform.conm
   *             titkle
   *             4 seconds
   *             Help=> clicking
   *             4 seconds
   *             close 
   *             mycontactform.com alone will be close
   *third iteration
   *    no content ; while loop terminates* 
   * */
 
  driver.switchTo().window(parent);//google 
  System.out.println(driver.getTitle());// google
  
  Thread.sleep(5000);
  driver.findElementByLinkText("Images").click();
  Thread.sleep(5000);
  driver.quit();
	}
}
