package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login;
import pageObjects.Login2;
import pageObjects.Template;


public class Steps {
	WebDriver driver;
	@Given("I hit the url {string}")
	public void i_hit_the_url(String url) {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get(url);
		   
	}

	@Given("Enter  all the details")
	public void enter_all_the_details() {
		Login2 log=new Login2(driver);
		log.registerUser();
		System.out.print("code2");  
	}

	@Then("I click on register button")
	public void i_click_on_register_button() {
		System.out.print("code3");
	}

	
	
}
