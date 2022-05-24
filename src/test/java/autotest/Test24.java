package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test24 {

	public static void main(String[] args) throws Exception
	{
		 WebDriverManager.chromedriver().setup();
	       RemoteWebDriver driver=new ChromeDriver();
	       driver.get("chrome://setting");
	       Thread.sleep(50000);
	       WebElement p1home=driver.findElement(By.xpath("//body/settings-ui"));
	       SearchContext p1root=p1home.getShadowRoot();
	       WebElement p2home=p1root.findElement(By.cssSelector("settings-main[id='main']"));
	       SearchContext p2root=p2home.getShadowRoot();
	       WebElement p3home=p2root.findElement(By.cssSelector("settings-basic-page[role='main']"));
	       SearchContext p3root=p3home.getShadowRoot();
	       WebElement p4home=p3root.findElement(By.cssSelector("settings-people-page"));
	       SearchContext p4root=p4home.getShadowRoot();
	       WebElement p5home=p4root.findElement(By.cssSelector("cr-link-row[id='manage-google-account']"));
	       SearchContext p5root=p5home.getShadowRoot();
	       p5root.findElement(By.cssSelector("div[id='label']"));

	}

}
