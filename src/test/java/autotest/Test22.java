package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test22 {

	public static void main(String[] args) throws Exception
	{
		// open browser
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver= new ChromeDriver();
        driver.get("https://www.gmail.com");
        Thread.sleep(5000);
        
        driver.findElement(By.name("identifier")).sendKeys("geethakarekallu");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("geetha1984@");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click(); 
		Thread.sleep(10000);
		while(true)
		{
			
		}
	}
	

}
