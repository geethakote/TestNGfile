package autotest;

import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.not;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14  
{

	public static void main(String[] args) throws Exception
	 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withTimeout(Duration.ofSeconds(20));
		WebElement e1=wait.until(visibilityOfElementLocated(By.name("identifier")));
		e1.sendKeys("geethakote29");
		WebElement e2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Next']")));
		e2.click();
		WebElement e3=wait.until(visibilityOfElementLocated(By.name("password")));
		e3.sendKeys("geethakote1984@");
	    WebElement e4=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Next']")));
		e4.click();
	//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
	
		WebElement e5=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Compose']")));
		e5.click();
		WebElement e6=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("to")));
		e6.sendKeys("geethakote@gmail.com");
		WebElement e7=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("subjectbox")));
		e7.sendKeys("hi");
		WebElement e8=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Message Body']")));
		e8.sendKeys("hi dj\nhow r u");
		WebElement e9=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='Filedata']//parent::div//descendant::div[4])[1]")));
		e9.sendKeys("C:\\Photos\\Goa 2021\\IMG_3674.JPG");
		WebElement e10=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Send']")));
		e10.click();
       // WebElement e11=wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@role='alert']/descendant::span[2]")),"message sent");
       // System.out.println("out put message is:"+e11);
     
       WebElement e14=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Message sent']")));
       String x= e14.getText();
       System.out.println(x);
       WebElement e12=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[starts-with(@aria-label,'Google Account')]")));
       e12.click();
       ExpectedCondition<Boolean> e15=invisibilityOfElementLocated(By.xpath("//div[text()='Send']"));
		wait.until(not(e15));
       
      WebElement e13=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Sign out']")));
      e13.click();
      driver.close();
	}
}


