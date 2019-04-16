package gridpack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class node1 
{
   public static int flag1;

 @Test
 // @Parameters("browser")
  public void f() throws MalformedURLException, InterruptedException
  {
  	   RemoteWebDriver driver=null;
   	 String nodeUrl = "http:\\192.168.43.84:4444\\wd\\hub";
   	  // String nodeUrl = "http:\\172.24.88.43:21447\\wd\\hub";
       DesiredCapabilities capability=new DesiredCapabilities();
       capability.setBrowserName("chrome");
       capability.setPlatform(Platform.WINDOWS);
       ChromeOptions o=new ChromeOptions();
	   o.merge(capability);
       driver = new RemoteWebDriver(new URL(nodeUrl),o);
       driver.manage().window().maximize();
       driver.navigate().to("https:\\www.google.com");
      	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
  if(driver.getPageSource().contains("Google offered in"))
       {
          // System.out.println("the text This website uses cookies and similar technologies is present and compatible in chrome browser-No Defect ");
 	      flag1=1;
       }
 else
 {
	 flag1=0;
    // System.out.println("the text This website uses cookies and similar technologies is not present and not compatible in chrome browser-A Defect ");
 }
	 
       //System.out.println(flag2);
       
       
       
   
	  
	  
   } 
}


 