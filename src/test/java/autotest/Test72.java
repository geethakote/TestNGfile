package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test72 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		Thread.sleep(5000);
		//search flight  between given station
		driver.findElement(By.xpath("//div[text()='From']/following::input[1]")).clear();
		driver.findElement(By.xpath("//div[text()='From']/following::input[1]")).sendKeys("Bengalure(BLR)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='To']/following::input[1]")).clear();
		driver.findElement(By.xpath("//div[text()='To']/following::input[1]")).sendKeys("Delhi(DEL)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[text()='23'])[1]")).click(); 
				Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		Thread.sleep(5000);
		WebElement dt=driver.findElement(By.xpath("//div[text()='SpiceMAX']/following::div[2]"));
		DivTableUtilityClass  obj=new DivTableUtilityClass();
		int nof=obj.getChildDIVCount(dt);
		System.out.println("count of flight is "+nof);
		List<WebElement> flights=obj.getChildDIVs(dt);
		int lfare=0;
		for(WebElement flight:flights)
		{
			By b=By.xpath("child::div/div[2]/div[1]//span/parent::div");
			String value=obj.getDIVValues(driver, flight, b);
			String num=value.replaceAll("[^0-9]", "");//replace other then digit with blank
			if(lfare==0)
			{
				lfare=Integer.parseInt(num);
			}
			else if(lfare>Integer.parseInt(num))
			{
				lfare=Integer.parseInt(num);
				flight.findElement(By.xpath("child::div/div[2]/div[1]//*[name()='svg']")).click();
			}

	}
		System.out.println(lfare);

}}
