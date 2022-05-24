package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test15 {

	public static void main(String[] args)  throws Exception
	{
		// open browser
 WebDriverManager.firefoxdriver().setup();
 RemoteWebDriver driver=new FirefoxDriver();
 driver.get("http://gmail.com");
 Thread.sleep(5000);
 driver.findElement(By.name("identifier")).sendKeys("geethakote",Keys.CONTROL,"a");
 Thread.sleep(5000);
 driver.findElement(By.name("identifier")).sendKeys(Keys.chord(Keys.CONTROL,"c"),Keys.ENTER);
 Thread.sleep(5000);
 driver.findElement(By.name("password")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
 Thread.sleep(5000);
 
 driver.findElement(By.name("password")).sendKeys(Keys.TAB,Keys.SPACE);
	 }

}
