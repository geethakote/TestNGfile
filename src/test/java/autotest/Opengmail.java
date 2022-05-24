package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Opengmail
{
	public RemoteWebDriver driver;
		@Given("open a {string} browser")
		public void method1(String bn) 
		{
		    if(bn.equalsIgnoreCase("chrome"))
		    {
		    	WebDriverManager.chromedriver().setup();
		    	driver=new ChromeDriver();
		    }
		}

		
				@Given("launch site using {string}")
		public void method2(String url) throws Exception
		
		{
		    driver.get(url);
	   Thread.sleep(5000);
	}

	@When("do login using {string} and {string} credentials")
	public void method3(String uname, String pwd) throws Exception
	{
		driver.findElement(By.name("identifier")).sendKeys(uname);
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click(); 
		Thread.sleep(5000);
	//	driver.findElement(By.id("phoneNumberId")).sendKeys("7798564007");
		//driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		//driver.findElement(By)
	}

	@Then("compose is displayed")
	public void method4()
	{
	  if( driver.findElement(By.xpath("//div[text()='Compose']")).isDisplayed())
	  {
		  System.out.println("Compose is displayed");
	  }
	  else
	  {
		  System.out.println("compose is not displayed");
		  System.exit(0);
	  }
	}

	@When("click on compose")
	public void method5() throws Exception
	{
	 driver.findElement(By.xpath("//div[text()='Compose']")).click();
	 Thread.sleep(5000);
	}

	@Then("fields should be displayed")
	public void method6() 
	{
	   if(driver.findElement(By.name("to")).isDisplayed())
	   {
		   System.out.println("fields should be displayed");
		   
	   }
	   else
	   {
		   System.out.println("fields should not be displayed");  
		   System.exit(0);
	   }
	}

	@When("fills fildes with {string},{string},{string} and {string}")
	public void method7(String t, String s, String b, String a) throws Exception
	{
		driver.findElement(By.name("to")).sendKeys(t);
		driver.findElement(By.name("subjectbox")).sendKeys(s);
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys(b);
		driver.findElement(By.name("Filedata")).sendKeys(a);
		Thread.sleep(5000);  
	}

	@Then("send is enabled")
	public void method8() 
	{
	    if(driver.findElement(By.xpath("//div[text()='Send']")).isEnabled())
	    {
	    	System.out.println("send is enabled");
	    }
	    else
	    {
	    	System.out.println("send is disabled");
	    	System.exit(0);
	    }
	    
	}

	@When("click on send")
	public void method9() throws Exception 
	{
	   driver.findElement(By.xpath("//div[text()='Send']")).click();
	   Thread.sleep(5000);
	}

	@Then("{string} should be displayed")
	public void method10(String expected)  
	{
	   String actual=driver.findElement(By.xpath("//div[@role='alert']/descendant::span[2]")).getText();
	   if(expected.equalsIgnoreCase(actual))
	   {
		   System.out.println("corrct message");
	   }
	   else
	   {
		   System.out.println("wrong message");
		   System.exit(0);
	   }
	}

	@When("do logout")
	public void method11() throws Exception
	{
	    driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Sign out")).click();
 Thread.sleep(5000);
	}

	@Then("login page should be redisplayed")
	public void method12()
	{
	   if(driver.findElement(By.xpath("//span[text()='Choose an account']")).isDisplayed())
	   {
		   System.out.println("Successful logout");
		   
	   }
	   else
	   {
		   System.out.println("Unsuccessful logout"); 
		   System.exit(0);
	   }
	}

	
		@When ("close a site")
		public void method13()
		{
			driver.close();
		}
}
