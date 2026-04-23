package stepDefinitions;

import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.LoginPage;
import utilities.BaseClass;

public class LoginSteps {

    LoginPage loginPage;

    @Given("user is on the SauceDemo login page")
    public void user_is_on_login_page() {
        BaseClass.openBrowser();
        loginPage = new LoginPage();
    }

    @When("user enters valid username and password")
    public void user_enters_valid_credentials() {
        loginPage.login("standard_user", "secret_sauce");
    }

    @Then("user should be logged in successfully")
    public void user_should_be_logged_in() {
        String url = BaseClass.driver.getCurrentUrl();
        Assert.assertTrue(url.contains("inventory"));
        BaseClass.closeBrowser();
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_credentials() {
        loginPage.login("wrong_user", "wrong_pass");
    }

    @Then("user should see an error message")
    public void user_should_see_error() {
        String error = BaseClass.driver.findElement(
            org.openqa.selenium.By.cssSelector("[data-test='error']")
        ).getText();
        Assert.assertTrue(error.contains("Username and password do not match"));
        BaseClass.closeBrowser();
    }
}