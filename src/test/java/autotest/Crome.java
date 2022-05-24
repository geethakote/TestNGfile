package autotest;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crome 
{
	@Given ("I want to open a chrome browser which version is{string}")
	public void method1(String v)
	{
		WebDriverManager.chromedriver().browserVersion(v).setup();	
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		}
}


