package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test76flight {

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
	     String x[]= {"css","html","ember"};
	     obj.selectItemsByNames(dd, x);
	     Thread.sleep(5000);
	     //deselect item by giveing names
	     String y[]= {"css","html"};
	     obj.deselectItemsByNames(dd, y);
	     Thread.sleep(5000);

	}

}
