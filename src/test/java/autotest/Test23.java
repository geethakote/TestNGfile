package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test23
{

	public static void main(String[] args) throws Exception
	{
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       driver.get("https://shop.polymer-project.org/");
       Thread.sleep(50000);
       WebElement phome=driver.findElement(By.xpath("//shop-app[@page='home']"));
       SearchContext proot=phome.getShadowRoot();
       WebElement home=proot.findElement(By.cssSelector("shop-home[name='home']"));
      SearchContext root=home.getShadowRoot();	
      root.findElement(By.cssSelector("a[aria-label*='Men']")).click();
	}

}
