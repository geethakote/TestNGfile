package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		callMethods(driver);
		driver.findElement(By.name("identifier")).sendKeys("geetha.test84");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("geetha1984@");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		
		callMethods(driver);
		
		/*driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]")).click(); 
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Sign out")).click();
	    Thread.sleep(5000);
		
	    callMethods(driver);
	    driver.close();*/
	}
	     public static void callMethods(RemoteWebDriver driver) throws Exception
	     {
	    	 LinkUtilityclass obj=new LinkUtilityclass(driver);
	    	 System.out.println("count of all links is " +obj.getLinksCount());
	    	 List<String> rs=obj.getBrokenLinks();
	    	 System.out.println("count of broken links is " +rs.size());
	    	 for (String r:rs)
	    	 {
	    		 System.out.println(r);
	    	 }
	     }
		

	}

	


