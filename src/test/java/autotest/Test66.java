package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test66 
{

	public static void main(String[] args)  throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/search?q=live+cricket+match&rlz=1C1CHBD_enIN987IN987&oq=live&aqs=chrome.0.69i59j69i57j0i20i131i263i433i512j0i131i433j0i20i131i263i433i512j0i433i512j46i433i512j0i433i512j0i131i433i512j0i512.3682j1j15&sourceid=chrome&ie=UTF-8#sie=m;/g/11pcpr96vz;5;/m/021q23;dt;fp;1;;");
		Thread.sleep(5000); 
		WebElement wt=driver.findElement(By.xpath("(//th[text()='Batting']/following:: table[@class='imspo_tps__tb'])[4]"));
		//Create object utility class
		WebTableUtilityClass  obj=new WebTableUtilityClass();
		int nor=obj.getRowsCount(wt);
		System.out.println(nor);
		System.out.println(obj.getColumnsCountInRow(wt,5));
		for(int i=1;i<nor;i=i++)
		{
			List<WebElement> batter=obj.getCellChilds(wt, i, 1, By.xpath("child::tr"));
			String name=(String)driver.executeScript("return(arguments[0].textContent);",batter.get(0));
			String desc;
			
		}

	}

}
