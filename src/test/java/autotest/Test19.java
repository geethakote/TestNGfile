package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test19 {

	public static void main(String[] args) throws Exception
	{
		// open browser
				WebDriverManager.firefoxdriver().setup();
				RemoteWebDriver driver=new FirefoxDriver();
				driver.get("https://semantic-ui.com/module/dropdown.html");
				Thread.sleep(5000);
				//WebElement e=driver.findElement(By.xpath
	}

}
