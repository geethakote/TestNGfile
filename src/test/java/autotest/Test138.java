package autotest;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test138
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch site
		WebDriverManager.firefoxdriver().setup();
		RemoteWebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
		Screen s=new Screen();
		if(s.exists("src\\test\\resources\\allow.png",5000)!=null)
		{
			s.click("src\\test\\resources\\allow.png");
		}
	}
}
