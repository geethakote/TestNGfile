package autotest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CacheUtilityClass 
{
public int getItemsCount(WebElement cache)
{
	int value=cache.findElements(By.xpath("child::li")).size();
	return(value);
}
public List<String> getAllItemsText(WebElement cache)
{
	List<String> l=new ArrayList<String>();
	List<WebElement> items=cache.findElements(By.xpath("child::li"));
	for(WebElement item:items)
	{
		l.add(item.getText());
	}
	return(l);
}
public boolean isValidCache(WebElement cache, String word)
{
     int flag=0;
     List<WebElement> items=cache.findElements(By.xpath("child::li"));
 	for(WebElement item:items)
     {
    	String temp1=item.getText().toLowerCase();
    	String temp2=word.toLowerCase();
    	if(!temp1.contains(temp2))
    	{
    		flag=1;
    		break;
    	}
     }
 	if(flag==0)
 	{
 		return(true);
 	}
 	else
 	{
 		return(false);
 	}
}
public List<String> getMismatchedSuggetions(WebElement cache, String word)
{
	List<String> l=new ArrayList<String>();

	 List<WebElement> mismatches=cache.findElements(By.xpath("child::li"));
	 	for(WebElement mismatche:mismatches)
	     {
	    	String temp1= mismatche.getText().toLowerCase();
	    	String temp2=word.toLowerCase();
	    	if(!temp1.contains(temp2))
	    	{
	    		l.add(mismatche.getText());
	    	}
	    
	     }
	   
		return(l);
}
}



