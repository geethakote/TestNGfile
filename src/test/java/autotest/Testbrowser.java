package autotest; 

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver; 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

 
public class Testbrowser 
{
RemoteWebDriver driver;
@Given ("open {string} browser")
public void open_browser(String x)
{
	if(x.equalsIgnoreCase("chrome")) 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	else if(x.equalsIgnoreCase("firefox")) 
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	} 
	else  
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
} 
 @When ("launch {string} site") 
 public void launch_site(String x) throws Exception
 {
	 driver.get(x); 
	 Thread.sleep(5000);
	 
 }
 @Then ("title should be contains {string}")
 public void title(String expected)
 {
	 String actual=driver.getTitle();
	 if(actual.contains(expected))
	 {
		 System.out.println("Title test is passed");
	 }
	 else
	 {
		 System.out.println("title test failed");
	 
	 }
 }
 @Then("that site should be secured")
 public void sec_site()
 {
	 String actual=driver.getCurrentUrl();
	 if(actual.startsWith("https"))
	 {
		 System.out.println("Secured site");
		
	 }
	 else
	 {
		 System.out.println("unsecured site");
	 }
 }
 @When("close site")
 public void close()
 {
	 driver.close();
 }
	 
 }



