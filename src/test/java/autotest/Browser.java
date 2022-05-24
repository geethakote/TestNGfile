package autotest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browser 
{
	RemoteWebDriver driver;
	
	@Given("open {string} browser which version is {string}")
	public void method(String x, String y)
	{
		if(x.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().browserVersion(y).setup();
			
			driver=new ChromeDriver();
			
		}
		else if(x.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().browserVersion(y).setup();
			driver=new FirefoxDriver();
			
		}
		else
		{
			WebDriverManager.edgedriver().browserVersion(y).setup();
			driver=new EdgeDriver();
		}
			
		}
	@SuppressWarnings("unused")
	private WebDriverManager Setup()
	{
		return null;
	}
		
	}
