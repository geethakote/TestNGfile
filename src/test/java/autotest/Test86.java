package autotest;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test86 {

	public static void main(String[] args) throws Exception
	{
		//get Expected data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day");
		int ed=Integer.parseInt(sc.nextLine());
		System.out.println("Enter a month");
		String em=sc.nextLine();
		System.out.println("Enter year");
		int ey=sc.nextInt();
		sc.close();
		//launch site
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker");
		Thread.sleep(5000);
		//operate date-picker
		driver.switchTo().frame(0);//first frame
		WebElement tb=driver.findElement(By.id("datepicker"));
		//driver.executeScript("arguments[0].scrollIntiView();",tb);
		tb.click();
		WebElement calendar=driver.findElement(By.id("ui-datepicker-div"));
		//select date
		DatePickerUtility obj=new DatePickerUtility();
		obj.selectYear(calendar, ey);
		obj.selectMonth(calendar, em);
		obj.selectDay(calendar, ed);
		
		
	}

}
