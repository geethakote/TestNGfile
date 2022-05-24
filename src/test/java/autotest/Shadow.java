package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shadow {

	public static void main(String[] args) throws Exception
	{
		   WebDriverManager.chromedriver().setup();
	       RemoteWebDriver driver=new ChromeDriver();
	      driver.get("chrome://downloads/");
	      WebElement p1home=driver.findElement(By.cssSelector("downloads-manager"));
	      SearchContext p1root=p1home.getShadowRoot();
	      WebElement p2home=p1root.findElement(By.cssSelector("#toolbar"));
	      SearchContext p2root=p2home.getShadowRoot();
	      WebElement p3home=p2root.findElement(By.cssSelector("#toolbar"));
	      SearchContext p3root=p3home.getShadowRoot();
	      WebElement p4home=p3root.findElement(By.cssSelector("#search"));
	      SearchContext p4root=p4home.getShadowRoot();
	      p4root.findElement(By.cssSelector("#searchInput")).sendKeys("hello");
	}

}
