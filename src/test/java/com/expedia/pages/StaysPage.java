package com.expedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expedia.web.WebDriverUtils;

public class StaysPage {
    @FindBy(xpath = "//span[normalize-space()='Stays']")
    public WebElement staysOption;

    @FindBy(xpath = "//button[@aria-label='Going to']")
    public WebElement goingToBox;

    @FindBy(xpath = "//input[@placeholder='Where are you going?']")
    public WebElement whereAreYouGoingTextBox;

    @FindBy(id = "location-field-destination")
    public WebElement destinationBox;


    @FindBy(xpath = "//button[@id='d1-btn']")
    public WebElement dateOneButton;

    @FindBy(xpath = "(//button[contains(text(), 'Done')])[2]")
    public WebElement doneButton;

    @FindBy(xpath = "//button[contains(text(), 'Search')]")
    public WebElement searchButton;


    @FindBy(xpath = "(//*[contains(text(), 'Search by property name')])[1]")
    public WebElement searchProperties;

    @FindBy(xpath = "//*[contains(text(), 'Dates must be no more than 28 days apart')]")
    public WebElement d2Error;

    public static WebElement xpathForCheckInDate(String checkInDate) {
        return WebDriverUtils.driver.findElement(By.xpath("//button[@aria-label='" + checkInDate + "']"));
    }

    public static WebElement xpathForCheckOutDate(String checkOutDate) {
        return WebDriverUtils.driver.findElement(By.xpath("//button[@aria-label='" + checkOutDate + "']"));
    }



    public StaysPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
