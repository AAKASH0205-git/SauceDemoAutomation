package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;
public class LoginPage {

    // Find username field on webpage
    @FindBy(id = "user-name")
    WebElement usernameField;

    // Find password field on webpage
    @FindBy(id = "password")
    WebElement passwordField;

    // Find login button on webpage
    @FindBy(id = "login-button")
    WebElement loginButton;

    // Constructor - initializes all elements above
    public LoginPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    // Method to perform login
    public void login(String username, String password) {
        usernameField.clear();
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
        loginButton.click();
    }
}