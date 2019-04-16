package login;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// pageBean.HotelLoginPageFactory;
import pageBean.HotelLoginPageFactory;

public class LoginStepDefination {

	private WebDriver driver;
	private HotelLoginPageFactory loginPageFactory;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Backup\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();
	}
	
	@Given("^User is on 'login' Page$")
	public void user_is_on_login_Page() throws Throwable {
	
		driver.get("D:\\Backup\\hotelBooking\\login.html");
		
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loginPageFactory = new HotelLoginPageFactory(driver);

	}

	@When("^user enters invalid UserName$")
	public void user_enters_invalid_UserName() throws Throwable {
		loginPageFactory.setUserName("");
		loginPageFactory.setLoginButton();
		
		
	}

	@Then("^display 'Please Enter UserName'$")
	public void display_Please_Enter_UserName() throws Throwable {
		String expectedMessage="* Please enter userName.";
		String actualMessage=loginPageFactory.getUsernameError().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();	
	}

	@When("^user enters invalid password$")
	public void user_enters_invalid_password() throws Throwable {
		loginPageFactory.setUserName("yogini");
		loginPageFactory.setPassword("");
		loginPageFactory.setLoginButton();

	}

	@Then("^display 'Please Enter Password'$")
	public void display_Please_Enter_Password() throws Throwable {
		String expectedMessage="* Please enter password.";
		String actualMessage=loginPageFactory.getPasswordError().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();	

	}

	@When("^user enters valid details$")
	public void user_enters_valid_details() throws Throwable {
		loginPageFactory.setUserName("Capgemini");
		loginPageFactory.setPassword("capg1234");
		loginPageFactory.setLoginButton();
	
	}

	@Then("^display 'HotelBooking' Page$")
	public void display_HotelBooking_Page() throws Throwable {
		driver.close();
	}


}