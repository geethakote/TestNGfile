package autotest;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test79flight {

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
	     String x[]= {"css","html","ember"};
	     obj.selectItemsByNames(dd, x);
	     Thread.sleep(5000);
	     //get and test all selected items
	     List<String> y=obj.getAllSelectedItems(dd);
	     if(Arrays.asList(x).equals(y))
	     {
	    	 System.out.println("Test passed");
	
	     }
	     else
	     {
	    	 System.out.println("Test failed");
 
	     }
	     driver.close();

	}

}
