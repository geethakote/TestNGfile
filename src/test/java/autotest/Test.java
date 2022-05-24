 package autotest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
//import org.openqa.selenium.opera.OperaOptions;

//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.opera.OperaDriver;
//import org.openqa.selenium.opera.OperaOptions;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Test 
{
	@Given("I want to open chrome browser which version is {string}")
	public void method1(String v)
	{
		WebDriverManager.chromedriver().browserVersion(v).setup();	
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		}
	@Given("I want to open firefox browser which version is {string}")
	public void method2(String v)
	{
		WebDriverManager.firefoxdriver().browserVersion(v).setup();	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
	}
	@Given ("i want to open ie browser which vertion is (string)")
	public void method3(String v)
	{
		WebDriverManager.iedriver().browserVersion(v).setup();	
		InternetExplorerDriver driver=new InternetExplorerDriver();
		 driver.get("http://www.google.co.in");
		 
	}
	@Given ("i want to open opera browser which version is (string)")
	public void method4(String v)
	{
		WebDriverManager.operadriver().browserVersion(v).setup();	
		OperaDriver driver=new OperaDriver();
		driver.get("http://www.google.co.in");
	}
	/*@Given ("i want to open opera browser which version is (string)")
	public void method5(String v)
	{
		WebDriverManager.operadriver().browserVersion(v).setup();	
		OperaOptions oo=new OperaOptions();
		oo.setBinary(path);
		OperaDriver driver=new OperaDriver();
	}*/
	@Given("I want to open edge browser which version is {string}")
      public void method6(String v)
	{
		WebDriverManager.edgedriver().browserVersion(v).setup();	
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.google.co.in");
	}

}
