package com.automationpractice.pages;


import com.automationpractice.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignINPage extends Utility {
    public SignINPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement clickOnEmail;
    @FindBy(id = "passwd")
    WebElement clickOnPassword;
    @FindBy(xpath = "//a[@class='login']")
    WebElement clickOnSignInButton;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement clickOnCreateAnAccount;
    //span[normalize-space()='Create an account']
    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement verifyAuthentication;
    @FindBy(xpath = "button[id='SubmitCreate']")
    WebElement verifyCreateAnAccount;
    @FindBy(id = "email_create")
    WebElement createNewEmail;
    @FindBy(xpath = "(//div[@class='alert alert-danger'])[1]")
    WebElement verifyAuthenticationFailedMessage;
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement verifyLogOutLink;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createAnAccount;

    public void signInWithUserNameAndPassword(String userName, String password) {
        sendTextToElement(clickOnEmail, userName);
        sendTextToElement(clickOnPassword, password);
        // clickOnElement(clickOnSignInButton);
    }
    public void enterUesrname(String username){
        sendTextToElement(clickOnEmail, username);
    }
    public  void enterPassword(String password){
        sendTextToElement(clickOnPassword, password);
    }

    public void clickonSignInButton() {
        clickOnElement(clickOnSignInButton);
    }

    public void enteremail(String email) {
        sendTextToElement(createNewEmail, email);
    }

    public void clickOnCreateAnAccount() {
        clickOnElement(clickOnCreateAnAccount);
    }
    public String verifyAuthenticationText() {
        return getTextFromElement( verifyAuthentication);
    }

    public String verifyCreateAnAccountText() {
        return getTextFromElement( verifyCreateAnAccount);
    }

    public String getVerifyAuthenticationFailedMessage() {
        return getTextFromElement(verifyAuthenticationFailedMessage);
    }

    public String verifyLogOutLink() {
        return getTextFromElement((By) verifyLogOutLink);
    }

    public void clickOnSignOut() {
        clickOnElement(verifyLogOutLink);
    }

public String getVerifyCreateAnAccount(){
        return getTextFromElement(createAnAccount);
}
}

