package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebTableUtilityClass 
{
public int getRowsCount(WebElement wt)
{
	int value=wt.findElements(By.xpath("child::tbody/tr")).size();
	return(value);
}
public int getColumnsCountInRow(WebElement wt, int rowsnum)
{
	int value=wt.findElements(By.xpath("child::tbody/tr["+rowsnum+"]/td")).size();
	return(value);
}
public String getCellValue(RemoteWebDriver driver, WebElement wt, int rownum, int column)
{
	WebElement e=wt.findElement(By.xpath("child::tbody/tr["+rownum+"]/td["+column+"]"));
	String value=(String)driver.executeScript("return(arguments[0].textContent);",e);
	return(value);
}
public List<WebElement> getCellChilds(WebElement wt, int rownum, int column,String tagname)
{
	List<WebElement> eles=wt.findElements(By.xpath("child::tbody/tr)["+rownum+"]/td["+column+"]/"+tagname));
	return(eles);
}

}
