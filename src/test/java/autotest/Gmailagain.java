package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Gmailagain  
{
	public RemoteWebDriver driver;
	@Given("open{string} browser")
	public void method1(String bn) 
	{
		 if(bn.equalsIgnoreCase("chrome"))
		    {
		    	WebDriverManager.chromedriver().setup();
		    	driver=new ChromeDriver();
		    }
		}
	

	@Given("launch site {string}")
	public void method2(String url) throws Exception
	{
		driver.get(url);
		Thread.sleep(5000);
	}
	

	@When("do login using {string} and {string}")
	public void method3(String un, String pwd)  throws Exception
	{

		driver.findElement(By.name("identifier")).sendKeys("un");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("pwd");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click(); 
		Thread.sleep(5000);
	} 
	}

