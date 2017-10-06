package Demo.Insomnia1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    
    @org.testng.annotations.Test (priority = 1)
    public void Testsuite()
    {
      System.setProperty("webdriver.chrome.driver", "Jars\\chromedriver.exe");
      ChromeDriver driver= new ChromeDriver();
      driver.get("http://www.Gmail.com");
      String title = driver.getTitle();
      Assert.assertEquals(title, "Gmail");
      
      System.out.println("TestSuite Passed :)");
    }

    @org.testng.annotations.Test (priority = 2)
    public void testApp()
    {
    	 System.setProperty("webdriver.chrome.driver", "Jars\\chromedriver.exe");
         ChromeDriver driver= new ChromeDriver();
         driver.get("http://www.Gmail.com");
         String title = driver.getTitle();
         Assert.assertEquals(title, "Gmail");
         
         System.out.println("TestApp Passed :)");
    }
}
