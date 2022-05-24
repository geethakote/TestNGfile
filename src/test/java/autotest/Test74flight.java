package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test74flight {

	public static void main(String[] args)  throws Exception
	{
		//Demo to multi selector drop down
		 WebDriverManager.chromedriver().setup();
	     RemoteWebDriver driver=  new ChromeDriver();
	     driver.get("https://semantic-ui.com/modules/dropdown.html");
	     Thread.sleep(5000);
	     //locate a div tag dropdown
	     WebElement dd=driver.findElement(By.xpath("//a[@id='multiple-selection']/following-sibling::div"));
	     DivDropDownUtilityClass obj=new DivDropDownUtilityClass();
	     System.out.println(obj.getItemsCount(dd));
	     List<String> values=obj.getIteamsName(driver, dd);
	     for(String value:values)
	     {
	    	 System.out.println(value);
	     }
	    
	     if(obj.isMultiSelect(dd))
	     {
	    	 System.out.println("Multi select dropdown");
	     }
	     else
	     {
	    	 System.out.println("Single select dropdown");
	     }
      obj.selectIteamByIndex(dd, 3);
      Thread.sleep(5000);
      obj.selectItemByName(dd, "california");
      Thread.sleep(5000);
	}

}
