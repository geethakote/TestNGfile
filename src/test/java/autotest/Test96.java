package autotest;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test96 {

	public static void main(String[] args) throws Exception
	
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("geethakote29");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("geetha1984#");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click(); 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("to")).sendKeys("geethakote29@yahoo.com");
		driver.findElement(By.name("subjectbox")).sendKeys("To yahoo");
	    driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Send msg to yahoo");
		driver.findElement(By.name("Filedata")).sendKeys("C:\\Photos\\Camera Dump\\102CANON\\IMG_0115.JPG");
	    driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> s=driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		driver.get("https://www.yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Sign In']")).click();
		driver.findElement(By.name("username")).sendKeys("geethakote29");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("dhanu1984#");
		driver.findElement(By.name("verifyPassword")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@title='Mail']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox']//following::img)[1]")).click();
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		driver.close();
		driver.switchTo().window(l.get(0));
		driver.findElement(By.xpath("(//a[@role='button']//following::img)[1]")).click();
		driver.findElement(By.xpath("//div[text()='Sign out']")).click();
		
	}

}
