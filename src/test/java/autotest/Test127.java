package autotest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test127
{
	public static void main(String[] args) throws Exception
	{
		//Open browser and launch site
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("http://www.gmail.com");
		FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withTimeout(Duration.ofSeconds(20));
		//Fill user id via visual relations
		WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(
				                         By.xpath("//*[text()='to continue to Gmail']")));
		WebElement e2=wait.until(ExpectedConditions.visibilityOfElementLocated(
				                                  By.xpath("//*[text()='Forgot email?']")));
		WebElement target=wait.until(ExpectedConditions.visibilityOfElementLocated(
				             RelativeLocator.with(By.tagName("input")).below(e1).above(e2)));
		target.sendKeys("magnitiait");
	}
}
