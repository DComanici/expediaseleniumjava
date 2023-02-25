package com.expedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expedia.web.WebDriverUtils;

public class CruisesPage {

@FindBy(xpath = "(//span[normalize-space()='Cruises'])[1]")
public WebElement cruisesText;

@FindBy(xpath = "(//select[@id='cruise-destination'])[1]")
public WebElement clickOnSelectDestinationBox;

@FindBy(xpath = "(//option[@value='mexico'])[1]")
public WebElement selectsMexico;

@FindBy(xpath = "//*[@data-name='d1']")
public WebElement earliestDeparture;

@FindBy(xpath = "//*[@id='d2-btn']")
public WebElement latestDeparture;

@FindBy(xpath = "//button[normalize-space()='Done']")
public WebElement clickOnDone;

@FindBy(xpath = "(//*[normalize-space()='Search'])[1]")
public WebElement clickOnSearch;

@FindBy(xpath = "(//img[@alt='expedia logo'])[1]")
public WebElement cruisesOptionsDisplay;

@FindBy(xpath = "(//select[@id='cruise-destination'])[1]")
public WebElement clicksOnSelectDestinationBox;

@FindBy(xpath = "(//option[@value='bahamas'])[1]")
public WebElement selectsBahamas;

@FindBy(xpath = "(//img[@alt='expedia logo'])[1]")
public WebElement noMatchesDisplays;







    
    public CruisesPage() {

        PageFactory.initElements(WebDriverUtils.driver, this);
}


}