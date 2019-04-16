package gridpack;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class node4 
{
 @Test(priority=4)
 // @Parameters("browser")
  public void f() throws MalformedURLException, InterruptedException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException
  {
	 /**
	 RemoteWebDriver driver=null;
	   //System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	   	  String nodeUrl = "http://192.168.43.84:4444/wd/hub";



   DesiredCapabilities capability=new DesiredCapabilities();
   capability.setBrowserName("chrome");
   capability.setPlatform(Platform.WINDOWS);
   ChromeOptions o=new ChromeOptions();
	   o.merge(capability);
   driver = new RemoteWebDriver(new URL(nodeUrl),o);
   driver.manage().window().maximize();
   //driver.navigate().to("http:\\www.jetairways.com");
   driver.navigate().to("about:blank");
	 */
 //--------------first starts
	 node1 ob1= new  node1();
	 Class c1=ob1.getClass();
     Field fn = c1.getField("flag1");
    fn.setAccessible(true);
    Object value1 = fn.get(ob1);
   // System.out.println("value1="+value1);
//--------------first ends
    
//--------------second starts
  	  node2 ob2= new  node2();
  	 Class c2=ob2.getClass();
    Field fn2 = c2.getField("flag2");
   fn.setAccessible(true);
   Object value2 = fn2.get(ob2);
 //  System.out.println("value2="+value2);
//--------------second ends
    
    
    //--------------third starts
	  node3 ob3= new  node3();
	 Class c3=ob3.getClass();

    Field fn1 = c3.getField("flag3");
   fn.setAccessible(true);
   Object value3 = fn1.get(ob3);
   //System.out.println("akbar2");

  // System.out.println("value3="+value3);
	 //--------------third ends
   
   
 
 if(value1.equals(1))
 {
     System.out.println("the text Google offered in: is present and compatible in chrome browser-No Defect ");
  }
else
{
System.out.println("the text Google offered in: is not present and not compatible in chrome browser-A Defect ");
}

 if(value2.equals(1))
 {
     System.out.println("the text Google offered in: is present and compatible in firefox browser-No Defect ");
  }
else
{
System.out.println("the text Google offered in: is not present and not compatible in firefox browser-A Defect ");
}

 
 if(value3.equals(1))
 {
     System.out.println("the text Google offered in: is present and compatible in internet explorer browser-No Defect ");
  }
else
{
System.out.println("the text Google offered in: is not present and not compatible in internet explorer browser-A Defect ");
}

	 
	  
   } 
}
