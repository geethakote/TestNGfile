package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement slider=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		driver.executeScript("arguments[0].ScrollIntoView();", slider);
		slider.click();
		WebElement e=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(e);
		WebElement f=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(f);
        driver.findElement(By.xpath("//div[@class='row']//preceding::div//input[@type='text']")).sendKeys("open");
	}

}
