package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test125
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
		WebElement e1=driver.findElement(
				    By.xpath("(//form[@role='search']//*[name()='svg'])[1]")); //search
		WebElement e2=driver.findElement(
				    By.xpath("//div[@aria-label='Search by voice']//*[name()='svg']")); //mic
		RelativeBy rb=RelativeLocator.with(By.xpath("//input[@type='text']"));
		List<WebElement> targets=driver.findElements(rb.toRightOf(e1).toLeftOf(e2));
		System.out.println(targets.size());
		for(WebElement target:targets)
		{
			driver.executeScript("arguments[0].style.border='5px dotted blue';", target);
			Thread.sleep(5000);
		}
	}
}
