package ibm1pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ibm12
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		 	
	 	WebElement e1=d.findElement(By.linkText("Gmail"));
	 	if(e1.isDisplayed())
	 	{
	 		System.out.println("Link Gmail is present on the home page -No Defect");
	 	}
	 	else
	 	{
	 		System.out.println("Link Gmail is not present on the home page -A Defect");
	 	}
	 	 
	 	
	 //	WebElement e11=d.findElement(By.xpath("//a[text()='Gift Cards']"));
        Actions a=new Actions(d);
        a.moveToElement(e1).clickAndHold(e1).build().perform();
        String t=e1.getCssValue("text-decoration");
        //String t1=e11.getCssValue("color");
        //String t2=e11.getCssValue("background-repeat");

     	System.out.println(t);

     	//System.out.println(t2);
/**
        if(t.contains("rgba(255, 255, 255)"))
        {
         	System.out.println("On moving mouse over the Menu Gift catd the background colour changed to transparent-No Defect");
         	
        }
        else
        {
         	System.out.println("On moving mouse over the Menu Gift catd the background colour did not change to transparent-A Defect");
         	
        }
	*/
	 	
	
	 	
	 	
	 	 
	}
 
}
