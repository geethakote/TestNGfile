package autotest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCookie {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Cookies after launchingnsite");
		CookiesUtility obj=new CookiesUtility();
		System.out.println(obj.getCookiesCount(driver));
		System.out.println(obj.getCookiesName(driver));
		System.out.println(obj.getCookieType(driver, "facebook.com","facebook.com"));
	
	driver.close();
	}
}
