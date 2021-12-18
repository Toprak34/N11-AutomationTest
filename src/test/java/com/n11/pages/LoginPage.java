package com.n11.pages;


import com.n11.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(css = "input#email")
    public WebElement usernameInput;

    @FindBy(css = "input#password")
    public WebElement passwordInput;

    @FindBy(xpath = "//div[.='Giriş Yap']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//div[@data-visualcompletion='ignore'])[1]")
    public WebElement confirmFaceBook;


    public void login(String usernameStr, String passwordStr) {
          usernameInput.sendKeys(usernameStr);
          passwordInput.sendKeys(passwordStr);
          loginBtn.click();


    }


    @FindBy(css = "div[class*='facebook_large']")
    public WebElement fbLogin;

    @FindBy(css = "input#pass")
    public WebElement fbPasswordInput;

    @FindBy(css = "label[id='loginbutton']")
    public WebElement fbLoginBtn;

    @FindBy(css = "button[name='__CONFIRM__']")
    public WebElement continueBtn;



}
