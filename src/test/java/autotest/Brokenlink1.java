package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink1
{
public static void main(String[] args) throws Exception 
        {
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			 
		      driver.navigate().to("https://www.google.co.in");
		      driver.findElement(By.name("q")).sendKeys("abdul kalam", Keys.ENTER);
			callMethods(driver);
			driver.findElement(By.xpath("(//cite[text()='https://en.wikipedia.org'])[1]")).click();
			callMethods(driver);
			
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
