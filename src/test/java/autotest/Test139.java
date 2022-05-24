package autotest;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test139
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch site
		WebDriverManager.firefoxdriver().setup();
		RemoteWebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
