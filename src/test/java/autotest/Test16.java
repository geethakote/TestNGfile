package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test16
{
public static void main(String[] args) throws Exception
	{
		// open a browser
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("http://www.gmail.com");
	Thread.sleep(5000);
	WebElement e=driver.findElement(By.xpath("//button[text()='Forgot email?']"));
	String x=e.getAttribute("type");
	System.out.println(x);
	String y=e.getCssValue("color");
	System.out.println(y);
	

	}

}
