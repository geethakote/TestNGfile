package autotest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.remote.RemoteWebDriver;

public class Testpublic {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup(); 
		RemoteWebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http:/www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("For work")).click();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Admin console")).click();
		Thread.sleep(5000);
		// TODO Auto-generated method stub

	}

}
