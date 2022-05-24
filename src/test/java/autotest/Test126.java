package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test126 
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch site
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//Locate an element via visual relations with other elements in page
		WebElement e=driver.findElement(By.name("q"));
		RelativeBy rb=RelativeLocator.with(By.tagName("svg"));
		List<WebElement> targets=driver.findElements(rb.near(e,100));
		System.out.println(targets.size());
		for(WebElement target:targets)
		{
			driver.executeScript("arguments[0].style.border='2px solid red';", target);
			Thread.sleep(5000);
		}
		targets.get(1).click();
	}
}
