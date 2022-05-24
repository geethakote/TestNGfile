package autotest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test147 
{
	public static void main(String[] args) 
	{
		//Open chrome browser 
		WebDriverManager.chromedriver().setup(); 
		ChromeOptions co=new ChromeOptions();
		String[] s=new String[]{"enable-automation"};
		co.setExperimentalOption("excludeSwitches",s);
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	}
}
