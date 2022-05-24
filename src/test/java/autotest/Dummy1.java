package autotest;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy1 {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a num1");
		int num1=sc.nextInt();
		System.out.println("Enetr a num2");
		int num2=sc.nextInt();
		sc.close();
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
     driver.get("https://gatekeeper.codeshake.dev/test");    
     driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();

     driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(""+num1);
     driver.findElement(By.xpath("//input[@id='mat-input-1']")).clear();
     driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(""+num2);
     WebElement e=driver.findElement(By.xpath("//input[@id='mat-input-2']"));
     String z=(String) e.getAttribute("value");
     if(Integer.parseInt(z)==num1+num2)
{
    	 System.out.println(z);
	System.out.println("passed");
}
else
{
	System.out.println("falied");	
}

     Thread.sleep(5000);
     driver.findElement(By.xpath("//input[@id='mat-input-3']")).click();
     String x="Bobi";
     driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("bobi",Keys.ENTER);
     WebElement f=driver.findElement(By.xpath("//div[@class='ng-star-inserted']"));
     String y=(String) f.getText();
     System.out.println(y);
     if(y.contains(x))  
     {
    	 System.out.println("passed"); 
     }
     else
     {
    	 System.out.println("failed");
     }
     
     
     driver.manage().window().maximize();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//span[text()='Let the battle begin']")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//div[@class='arena']//div//i [contains(@style, 'orange')]")).click();
     
	}
	

}
