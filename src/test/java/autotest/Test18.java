package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test18 {

	public static void main(String[] args) throws Exception 
	{
		// open browser
		WebDriverManager.firefoxdriver().setup();
		RemoteWebDriver driver=new FirefoxDriver();
		driver.get("https://www.worldometers.info/world-population/");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//span[@rel='current_population']/parent::div"));
		String x=driver.findElement(By.xpath("//span[@rel='current_population']/parent::div")).getText();
		System.out.println(x);
		String y=(String) driver.executeScript("return(arguments[0].childNodes[7].textContent);",e);
		System.out.println(y);
driver.close();

	}

}
