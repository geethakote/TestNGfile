package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test84 {

	public static void main(String[] args) throws Exception
	{
      WebDriverManager.chromedriver().setup();
      RemoteWebDriver driver=new ChromeDriver();
      driver.get("https://www.snapdeal.com/");
      //locate carousel slider element
      WebElement slider=driver.findElement(By.id("top-banner"));
      Thread.sleep(5000);
      CarouselSliderUtilityClass obj=new CarouselSliderUtilityClass();
      System.out.println(obj.getCountOfSlides(slider));
      System.out.println(obj.getTypeOfSlider(slider));
      System.out.println(slider.getCssValue("transform"));
      if(obj.areSlidesMovingAutomaticallyInSlider(slider))
      {
    	  System.out.println("moving automatically");
    	  System.out.println(slider.getCssValue("transition"));
    	  System.out.println(obj.getSlideMoveDuration(slider));
    	  System.out.println(obj.getslideMovingStyle(slider));
    	  System.out.println(obj.getDelayBetweenSlidesMove(slider));
    	  System.out.println(obj.getMovingDirectionOfSlidesInSlider(slider));
      }
      else
      {
    	  System.out.println("not moving automatically");
      }
      driver.close();
}
	
}
