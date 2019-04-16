package gridpack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class node3
{
  public static int flag3;
  @Test
  public void f() throws MalformedURLException
  {
	  RemoteWebDriver driver=null;
	   //System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
   	  String nodeUrl = "http:\\192.168.43.84:4444\\wd\\hub";
  	   //String nodeUrl = "http:\\172.24.88.43:21447\\wd\\hub";

     DesiredCapabilities capability = new DesiredCapabilities();
     capability.setBrowserName("internet explorer");
     capability.setPlatform(Platform.WINDOWS);
	 InternetExplorerOptions o = new InternetExplorerOptions();
	 o.merge(capability);
     driver = new RemoteWebDriver(new URL(nodeUrl),o);
     driver.manage().window().maximize();
     //driver.get("https://www.google.com");
     driver.navigate().to("https://www.google.com/");

   	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

    // driver.get("https://www.watchokart.com");
	//if(driver.getPageSource().contains("Shopping Cart"))
 	
     if(driver.getPageSource().contains("Google offered in"))
     {
         //System.out.println("the text This website uses cookies and similar technologies is present and compatible in internet explorer browser-No Defect ");
	      flag3=1;
     }
else
{
	flag3=0;
   System.out.println("the text This website uses cookies and similar technologies is not present and not compatible in internet explorer browser-A Defect ");
}
	 
     //System.out.println(flag3);
     
 	
  }
}
