package com.expedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expedia.web.WebDriverUtils;

public class HotelsPage {
     @FindBy(xpath = "//span[contains(text(), 'Amenities')]")
     public WebElement amenities;

    public static WebElement viewHotel(String chosenHotel){
        return WebDriverUtils.driver.findElement(By.xpath("(//*[contains(text(), 'More information about "+ chosenHotel +", opens in a new tab')])[1]"));
    }

    public HotelsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
