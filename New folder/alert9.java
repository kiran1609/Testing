package ibm1pack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert9 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
	 	driver.get("http:\\www.google.com");
	 	Thread.sleep(60000);
	 	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
//WebElement e2=driver.findElement(By.xpath("//input[@name='btnK']"));
	 	WebElement e2=driver.findElement(By.xpath("//a[text()='Sign in']"));
	 //	WebElement e2=driver.findElement(By.xpath("//input[@value='Google Search' and @name='btnK']"));

	//Thread.sleep(30000);
     //WebDriverWait w1=new WebDriverWait(driver,50);
	//WebElement e22=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Google Search']")));
	System.out.println(e2.getAttribute("name"));

System.out.println(e2.isDisplayed());


if(e2.isDisplayed())
{
	System.out.println("Button labelled Sign In is Displayed on the page-No Defect");
}
else
{
	System.out.println("Button labelled Sign In is not displayed on the page-A Defect");

}
	 	/**
List<WebElement> li=driver.findElements(By.xpath("//input[@type='submit']"));

int s=li.size();
//System.out.println(s);
boolean found = false;
WebElement e1 = null;
Thread.sleep(10000);
for(int i=0;i<s;i++)
{
	if(li.get(i).getAttribute("value").equalsIgnoreCase("Google Search"))
	{
		//System.out.println("welcome");
		//WebDriverWait w1=new WebDriverWait(driver,10);
		Thread.sleep(10000);
		//WebElement e22=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@value='Google Search']")));
		System.out.println(li.get(i));

		System.out.println(li.get(i).isDisplayed());
	   found=true;
		break;
	}
 }
if(found)
{
	//WebDriverWait w1=new WebDriverWait(driver,10);
	//WebElement e22=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@value='Google Search']")));
    e1=driver.findElement(By.xpath("//input[@type='submit'][@value='Google Search']"));
	if(e1.isDisplayed())
	{
		System.out.println("Button labelled Google Search is Displayed on the page-No Defect");
	}
	else
	{
		System.out.println("Button labelled Google Search is not displayed on the page-A Defect");

	}

	
	
	
 
}
System.out.println(found);

*/

	}
}
