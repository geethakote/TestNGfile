package autotest;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test91 {

	public static void main(String[] args) throws Exception
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a departure date");
    int dd=Integer.parseInt(sc.nextLine());
    System.out.println("Enter a departure month name");
    String dm=sc.nextLine();
    System.out.println("Enter a departure year");
    int dy=Integer.parseInt(sc.nextLine());
    System.out.println("Enter a arrival date");
    int ad=Integer.parseInt(sc.nextLine());
    System.out.println("Enter a arrival month name");
    String am=sc.nextLine();
    System.out.println("Enter a arrival year");
    int ay=Integer.parseInt(sc.nextLine());
    sc.close();
    //Launch site
    WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.spicejet.com/");
    Thread.sleep(5000);
    //Open calendar in Departure date
    driver.findElement(By.xpath("(//div[text()='Departure Date']/following::*[name()='svg'])[1]")).click();
    Thread.sleep(5000);
    WebElement calendar1=driver.findElement(By.xpath("(//div[contains(@data-testid,'undefined-month')])[1]/ancestor::div[2]"));
    DivCalendarUtility obj=new DivCalendarUtility();
    obj.selectDate(driver, calendar1, dy, dm, dd);
    Thread.sleep(5000);
    //open a calendar in Arrival date
    driver.findElement(By.xpath("(//div[text()='Return Date']/following)::*[name()='svg'])[1]")).click();
    Thread.sleep(5000);
    WebElement calendar2=driver.findElement(By.xpath("//div[contains(@data-testid,'undefined-month')])[1]/ancestor::div[2]"));
    obj.selectDate(driver, calendar2, ay, am, ad);
    Thread.sleep(5000);
	}

}
