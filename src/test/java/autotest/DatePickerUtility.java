package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DatePickerUtility
{
 public void selectYear(WebElement calendar, int year) throws Exception
 {
	while(true) 
	{
		String temp=calendar.findElement(By.className("ui-datepicker-year")).getText();
		int cy=Integer.parseInt(temp);
		if(year>cy)
		{
			calendar.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(5000);
		}
		else if(year<cy)
		{
			calendar.findElement(By.xpath("//span[text()='Prev']")).click(); 			
			Thread.sleep(5000);
		}
		else
		{
			break;
		}
	}
 }
 public void selectMonth(WebElement calendar,String month) throws Exception
 {
	 //step1:come to January
	 while(true)
	 {
		 String cm=calendar.findElement(By.className("ui-datepicker-month")).getText();
		 if(!cm.equalsIgnoreCase("january"))
		 {
			 calendar.findElement(By.xpath("//span[text()='Prev']")).click();
			 Thread.sleep(5000);
		 }
		 else
		 {
			 break;
		 }
	 }
	 while(true)
	 {
		 String cm=calendar.findElement(By.className("ui-datepicker-month")).getText();
		 if(!cm.equalsIgnoreCase(month))
		 {
			 calendar.findElement(By.xpath("//span[text()='Next']")).click();
			 Thread.sleep(5000);
		 }
		 else
		 {
			 break;
		 }
	 }
 }
 public void selectDay(WebElement calendar, int day)
 {
	 try
	 {
		 calendar.findElement(By.xpath("child::table[@class='ui-datepicker-calendar']/tbody//a[text()="+day+"]")).click();
	 }
	 catch (Exception ex)
	 {
		System.out.println("No given day in that month");
	 }
 }
 public void selectSpecialDay(WebElement calendar, String weekday, int index)
 {
	 int col;
	 if(weekday.equalsIgnoreCase("Sunday"))
	 {
		 col=1;
	 }
	 else if(weekday.equalsIgnoreCase("Monday"))
	 {
		 col=2;
	 }
	 else if(weekday.equalsIgnoreCase("Tuesday"))
	 {
		 col=3;
	 }
	 else if(weekday.equalsIgnoreCase("Wednesday"))
	 {
		 col=4;
	 }
	 else if(weekday.equalsIgnoreCase("Thursday"))
	 {
		 col=5;
	 }
	 else if(weekday.equalsIgnoreCase("Friday"))
	 {
		 col=6;
	 }
	 else
	 {
		 col=7;
	 }
	 try
	 {
		 calendar.findElement(By.xpath("(child::table[@class='ui-datepicker-calendar']/tbody/tr/td["+col+"]//a)["+index+"]")).click();
	 }
	 catch(Exception ex)
	 {
		 System.out.println("No "+index+"th "+weekday+" in that month");
	 }
 }
 
}
