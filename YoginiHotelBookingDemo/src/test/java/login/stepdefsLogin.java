package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelLoginPageFactory;

public class stepdefsLogin {

	private WebDriver driver;
	private HotelLoginPageFactory objhlpg;
	
	@Given("^User is on 'login' Page$")
	public void user_is_on_login_Page() throws Throwable {
		driver = new FirefoxDriver();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objhlpg = new HotelLoginPageFactory(driver);

		driver.get("file:///D:/BDD/BDD%20certf/hotelBookingSolution/hotelBooking/login.html");
	}

	@When("^user enters invalid UserName$")
	public void user_enters_invalid_UserName() throws Throwable {
	   
	}

	@Then("^display 'Please Enter UserName'$")
	public void display_Please_Enter_UserName() throws Throwable {
	   
	}

	@When("^user enters invalid password$")
	public void user_enters_invalid_password() throws Throwable {
	   	}

	@Then("^display 'Please Enter Password'$")
	public void display_Please_Enter_Password() throws Throwable {
	   
	}

	@When("^user enters valid details$")
	public void user_enters_valid_details() throws Throwable {
	   
	}

	@Then("^display 'HotelBooking' Page$")
	public void display_HotelBooking_Page() throws Throwable {
	    
	}


}
