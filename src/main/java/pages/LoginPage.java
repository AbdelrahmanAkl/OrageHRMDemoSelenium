package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By userName = By.xpath("//input[@name=\"username\"]");
    By password = By.xpath("//input[@name=\"password\"]");
    By loginButton = By.xpath("//button[@type=\"submit\"]");
    By forgetPassword = By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]");
    By requiredErrorUserNameMessage = By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"])[1]");
    By requiredErrorPasswordMessage = By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"])[1]");
    By invalidCredentialsMessage = By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]");
    private String requiredTextExpectResult ="Required";
    private String invalidCredentialsExpectedResult ="Invalid credentials";

    public String getInvalidCredentialsExpectedResult() {
        return invalidCredentialsExpectedResult;
    }

    public String getRequiredTextExpectResult() {
        return requiredTextExpectResult;
    }
    public void fillUserName(String username){
        fillElement(userName,username);
    }
    public void fillPassword(String password){
        fillElement(this.password,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public void clickOnForgetPassword(){
        clickOnElement(forgetPassword);
    }
    public String requiredErrorMessageUserNameActualResult(){
        return getElementText(requiredErrorUserNameMessage);
    }
    public String requiredErrorMessagePaasswordActualResult(){
        return getElementText(requiredErrorPasswordMessage);
    }
    public String invalidCredentialsErrorMessage(){
        return getElementText(invalidCredentialsMessage);
    }

}
