package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public WebDriver driver;
	
	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	}

	@When("user enters the invlaid username and valid password")
	public void user_enters_the_invlaid_username_and_valid_password() {
	    driver.findElement(By.id("email")).sendKeys("Java");
	    driver.findElement(By.id("pass")).sendKeys("Java@123");
	}

	@Then("user should enter the passowrd")
	public void user_should_enter_the_passowrd() {
		driver.findElement(By.name("login")).click();
	}


}
