package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test21 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(50000);
		WebElement e=driver.findElement(By.xpath("//span[text()='Create account']/parent::button"));
		int w=e.getSize().getWidth();
		int h=e.getSize().getHeight();
		System.out.println(w+"  "+h);
		
		int x=e.getLocation().getX();
		int y=e.getLocation().getY();
		System.out.println(x+" "+y);
		
		int w1=e.getRect().getWidth();
		int x2=e.getRect().getHeight();
		int y3=e.getRect().getX();
		int z4=e.getRect().getY();
		System.out.println(w1+" "+x2+" "+y3+" "+z4);
		driver.close();
	}

}
