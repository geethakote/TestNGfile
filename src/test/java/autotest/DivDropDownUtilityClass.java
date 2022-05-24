package autotest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DivDropDownUtilityClass
{
public boolean isMultiSelect(WebElement dd)
{
if(dd.getAttribute("class").contains("multiple"))	
{
	return(true);
}
else {
	return(false);
}
}
public int getItemsCount(WebElement dd)
{
	int value=dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div")).size();
	return(value);
}

public List<String> getIteamsName(RemoteWebDriver driver, WebElement dd)
{
	List<String> value=new ArrayList<String>();
	List<WebElement> items=dd.findElements(By.xpath("child:://div[contains(@class,'multiple')]/select[@name='skills']"));
	for(WebElement item:items)
	{
		value.add((String)driver.executeScript("return(arguments[0].textContent, args);",item));
	}
	return(value);
}
public void selectIteamByIndex(WebElement dd, int x) throws Exception
{
	dd.click();//open drop down
	Thread.sleep(5000);
	List<WebElement> items=dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
	if(items.size()<x)
	{
		System.out.println("wrong index");
		System.exit(0);
	}
	else 
	{
	items.get(x-1).click();	
	}
}
public void selectItemByName(WebElement dd, String x) throws Exception 
{
dd.click();
Thread.sleep(5000);
List<WebElement> items=dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
int flage=0;
for(WebElement item:items)
{
	if(item.getText().equalsIgnoreCase(x))
	{
		item.click();
		flage=1;
		break;
	}
}
if(flage==0)
{
	System.out.println("item not found in dropdown");
	System.exit(0);
}
}
public void selectItemsByIndexes(WebElement dd, int[] x) throws Exception
{
dd.click();
Thread.sleep(5000);
List<WebElement> items=dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
for(int i=0;i<x.length; i++)
{
	if(items.size()<x[i])
	{
		System.out.println("Wrong data");
		System.exit(0);
	}
else
{
	items.get(x[i]-1).click();
	Thread.sleep(5000);
}
}
}
public void selectItemsByNames(WebElement dd, String[] x) throws Exception
{
dd.click();
Thread.sleep(5000);
List<WebElement> items=dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
for(int i=0; i<x.length; i++)
{
	int flag=0;
	for(WebElement item:items)
	{
		if(item.getText().equalsIgnoreCase(x[i]))
		{
			item.click();//select that item
			Thread.sleep(5000);
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		System.out.println("Item not found in dropdown");
		System.exit(0);
	}
}
}
public void selectAllItems(WebElement dd) throws Exception
{
	dd.click();
	Thread.sleep(5000);
	List<WebElement> items=dd.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
	for(WebElement item:items)
	{
		item.click();
	}
}
public void deselectItemsByIndexes(WebElement dd, int[] x) throws Exception
{ 
	
List<WebElement> items=dd.findElements(By.xpath("child::a"));
	for(int i=0;i<x.length; i++)
	{
		if(items.size()<x[i])
		{
			System.out.println("Wrong data");
			System.exit(0);
		}
	else
	{
		items.get(x[i]-1).findElement(By.xpath("child::i[@class='delete icon']")).click();
		Thread.sleep(2000);
	}
}
}
public void deselectItemsByNames(WebElement dd, String[] x) throws Exception
{
	List<WebElement> items=dd.findElements(By.xpath("child::a"));
	for(int i=0;i<x.length; i++)
	{
		int flag=0;
		for(WebElement item:items)
		{
			if(item.getText().equalsIgnoreCase(x[i]))
			{
				item.findElement(By.xpath("child::i[@class='delete icon']")).click();
			
				Thread.sleep(5000);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Item not found in dropdown");
			System.exit(0);	
		}
	}
}
public void deselectAllItems(WebElement dd) throws Exception
{
	List<WebElement> items=dd.findElements(By.xpath("child::a"));
	for(WebElement item:items)
	{
		item.findElement(By.xpath("child::i[@class='delete icon']")).click();
		items=dd.findElements(By.xpath("child::a"));
	}
}
public String getSelectedItemsInSingaleSelector(WebElement dd)
{
	WebElement sitem=dd.findElement(By.xpath("child::a[@class='ui label transition visible']"));
			return(sitem.getText());
}
public String getFirstSelectedItems(WebElement dd)
{
	List<WebElement> sitems=dd.findElements(By.xpath("child::a"));
			return(sitems.get(0).getText());
}
public String getLastSelectedItems(WebElement dd)
{
	List<WebElement> sitems=dd.findElements(By.xpath("child::a"));
			return(sitems.get(sitems.size()-1).getText());
}
public List<String> getAllSelectedItems(WebElement dd)
{
	List<String> l=new ArrayList<String>();
	List<WebElement> sitems=dd.findElements(By.xpath("child::a"));
	for(WebElement sitem:sitems)
	{
		l.add(sitem.getText());
	}
	return(l);
}
}

