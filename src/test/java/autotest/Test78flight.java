package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test78flight {

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
	    //select an item by givig value
	     String x="ember";
	     obj.selectItemByName(dd, x);
	     Thread.sleep(5000);
	     //get selected item and test it
	     String y=obj.getSelectedItemsInSingaleSelector(dd);
	     if(x.equalsIgnoreCase(y))
	     {
	    	 System.out.println("Test passed");
	     }
	     else
	     {
	    	 System.out.println("Test failed"); 
	     }
	    		 
//driver.close();
	}

}
