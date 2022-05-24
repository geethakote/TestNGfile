package autotest;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class Test20
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https:/gmail.com");
		Thread.sleep(50000);
		WebElement e=driver.findElement(By.xpath("//div[@title='Google']/parent::div"));
	    File dest1=new File("elementpic.png");
		File src1=e.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, dest1);
		
		String src2=e.getScreenshotAs(OutputType.BASE64);
		System.out.println(src2);
		//byte src3[]=e.getScreenshotAs(OutputType.BYTES);
		driver.close();
		
		

	}

}
