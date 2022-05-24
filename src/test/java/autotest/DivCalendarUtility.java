package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DivCalendarUtility 
{
public void selectDate(RemoteWebDriver driver, WebElement calendar, int year, String month, int day) throws Exception
{
List<WebElement> monthsblocks=calendar.findElements(By.xpath("child::div/div"));
//Matching the year and month
int flag=0;
for(WebElement monthblock:monthsblocks)
{
String temp=monthblock.getAttribute("data-testid");
temp=temp.toLowerCase();
month=month.toLowerCase();
if(temp.contains(month)&&temp.contains(""+year))//concatenate "int" value with empty string to convert that int value to string value
{
flag=1;
//get that matched month to visible
while(true)
{
	if(monthblock.isDisplayed())
	{
		try
		{
			//dynamic xpath for  given day selection
			monthblock.findElement(By.xpath("decendant::div[@data-testid='undefined-calendar-day-"+day+"']")).click();
			Thread.sleep(2000);
		}
		catch(Exception ex)
		{
			System.out.println("Wrong day in current month and year");
		}
		break;
	}
	else
	{
		//Click on Next to get month block visible
		driver.findElement(By.xpath("(//div[@data-testid='undefined-calender-picker']//*[name()='svg'])[1]")).click();
		Thread.sleep(2000);
	}
}
break;
}
}
if(flag==0)
{
	System.out.println("Given month and year not found in this calendar");
}
}
}
