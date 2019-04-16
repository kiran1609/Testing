package ibm1pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ibm11
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http:\\www.google.com");
        d.manage().window().maximize();
		Actions a=new Actions(d);
		WebElement w=d.findElement(By.linkText("Gmail"));
		a.moveToElement(w).clickAndHold().build().perform();
		Thread.sleep(5000);
		String st=w.getCssValue("font-size");
 System.out.println(w.getCssValue("font-size="+st));
 		if(w.getCssValue("text-decoration").contains("underline"))
		{
		  System.out.println("on moving the cursor over link gmail it got underlined-No Defect");
		}
		else
 		{
		  System.out.println("on moving the cursor over link gmail it did not got underlined-A Defect");
		}


	}

}
