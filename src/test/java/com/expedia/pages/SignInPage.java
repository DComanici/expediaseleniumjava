package com.expedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expedia.web.WebDriverUtils;

public class SignInPage {
    
    @FindBy(xpath ="//div[contains(text(),'Sign in')]")
    public WebElement signInBtn;

    @FindBy(xpath = "//a[contains(text(), 'Sign in')]")
    public WebElement signInBtnNewWindow;


    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBtn;

    @FindBy(xpath = "(//input[@id='loginFormPasswordInput'])[1]")
    public WebElement passwordBtn;

    @FindBy(xpath = "(//button[normalize-space()='Sign in'])[1]")
    public WebElement signInFinalBtn;

    @FindBy(xpath = "(//*[contains(text(), 'Stays')])[3]")
    public WebElement staysBtn;

    @FindBy(xpath = "(//*[contains(text(), 'Sign in')])[1]")
    public WebElement emailAndPasswordDontMatch;

    public SignInPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
    
    
}
