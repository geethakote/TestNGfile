package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test17 
{
	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https:/www.google.co.in");
		Thread.sleep(5000);
		String x=driver.findElement(By.xpath("(//a[@target='_top']/parent::div)[1]")).getText();
		System.out.println(x);
		String y=driver.findElement(By.xpath("(//input[@name='q']/parent::div)")).getText();
		System.out.println(y);


	}
	

}
