package seleniumlocator;

import org.openqa.selenium.chrome.ChromeDriver;

public class l4 {
	
	public static void main(String[] args) {
		
		//css : cascade style sheet
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		 //1.tagname and id      syntax: tagname#id
		ob.findElementByCssSelector("input#user").sendKeys("hi");
		
		//2. tagname and classname    syntax : tagname.classname
		//ob.findElementByCssSelector("input.txt_log").sendKeys("hello");
		
		//3.tagname and attribute     syntax: tagname[attribute='value']
		//ob.findElementByCssSelector("input[type='text']").sendKeys("bye");
		
		//4. tagname and prefix of attribute     syntax: tagname[attribute^='prefix value']
		//ob.findElementByCssSelector("input[type^='te']").sendKeys("bye");
		
		//5. tagname and suffix of attribute     syntax: tagname[attribute$='suffix value']
		//ob.findElementByCssSelector("input[type$='xt']").sendKeys("bye");
		
		//6. tagname and substring of attribute     syntax: tagname[attribute*='value']
		//ob.findElementByCssSelector("input[type*='ex']").sendKeys("bye");
		
		//7.tagname.classname and attribute     syntax: tagname.classname[attribute='value']
		//ob.findElementByCssSelector("input.txt_log[type='text']").sendKeys("bye");
		
		// shortcut: copy=>  copy selector
		ob.findElementByCssSelector("#user").sendKeys("hi");
		
		ob.findElementByCssSelector("#pass").sendKeys("8765gig");
		
		ob.findElementByCssSelector("#right_col_top > form > div > input").click();
		
		 ob.close();
	}
}
