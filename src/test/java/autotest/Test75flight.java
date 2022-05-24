package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test75flight {

	public static void main(String[] args) throws Exception
	{
		//Demo to multi selector drop down
		 WebDriverManager.chromedriver().setup();
	     RemoteWebDriver driver=  new ChromeDriver();
	     driver.get("https://semantic-ui.com/modules/dropdown.html");
	     Thread.sleep(5000);
	     //locate a div tag dropdown
	     WebElement dd=driver.findElement(By.xpath("//a[@id='multiple-selection']/following-sibling::div"));
	     DivDropDownUtilityClass obj=new DivDropDownUtilityClass();
	     if(obj.isMultiSelect(dd))
	     {
	    	 System.out.println("Multi select dropdown");
	     }
	     else
	     {
	    	 System.out.println("Single select dropdown");
	     }
	     int x[]= {2,3,6,8};
	     obj.selectItemsByIndexes(dd, x);
	     Thread.sleep(5000);
	     //deselect items by index
	     int y[]= {1,4};
	     obj.deselectItemsByIndexes(dd, y);
	     Thread.sleep(5000);

	}

}
