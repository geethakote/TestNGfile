package autotest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CookiesUtility 
{
public int getCookiesCount(RemoteWebDriver driver)
{
	int x=driver.manage().getCookies().size();
	return(x);
}
public List<String> getCookiesName(RemoteWebDriver driver)
{
	Set<Cookie> s=driver.manage().getCookies();
	List<Cookie> l=new ArrayList<Cookie>(s);
	List<String> names=new ArrayList<String>();
	for(Cookie c:l)
	{
		names.add(c.getName());
	}
	return(names);
}
	public List<String> getCookieType(RemoteWebDriver driver, String samedomain,String superdomain)
	{
		Set<Cookie> s=driver.manage().getCookies();
		List<Cookie> l=new ArrayList<Cookie>(s);
		List<String> types=new ArrayList<String>();
		for(Cookie c:l)
		{
			if(c.isHttpOnly())
			{
				if(c.getName().equalsIgnoreCase("session-id")||c.getName().contains("SID"))
						{
					      types.add(c.getName()+" is Http-only-session cookie");
						}
				else if(c.getName().equalsIgnoreCase("session-id-time"))
				{
					types.add(c.getName()+" is Http-only persistent cookies and it expaier on"+c.getExpiry());
				}
				else
				{
					types.add(c.getName()+" is pure Http-only cookie");

			}
		}
			else if(c.isSecure())
			{
				if(c.getName().equalsIgnoreCase("session-id")||c.getName().contains("SID"))
				{
			      types.add(c.getName()+" is Https-only-session cookie");
				}
		        else if(c.getName().equalsIgnoreCase("session-id-time"))
		        {
			      types.add(c.getName()+" is Https-only persistent cookies and it expaier on"+c.getExpiry());
		        }
		        else
		        {
			       types.add(c.getName()+" is pure Http sequred-only cookie");
		        }
	
			}
			else if(c.getDomain().contains(samedomain))
			{
				types.add(c.getName()+" is same-site Cookie");
			}
			else if(c.getDomain().contains(superdomain))
			{
				types.add(c.getName()+" is  superdomain Cookie");
			}
			else
			{
				types.add(c.getName()+" is third-party and its came from"+c.getDomain());
			}
	}
		return(types);
}
}
