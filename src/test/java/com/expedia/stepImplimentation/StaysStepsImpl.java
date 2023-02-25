package com.expedia.stepImplimentation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.expedia.appsCommon.PageInitializer;
import com.expedia.pages.StaysPage;

public class StaysStepsImpl extends PageInitializer{


    public static void goingTo(String goingToDestination) throws InterruptedException{
        staysPage.staysOption.click();
        staysPage.goingToBox.click();
        Thread.sleep(2000);
        staysPage.whereAreYouGoingTextBox.sendKeys(goingToDestination);
        Thread.sleep(2000);
        staysPage.destinationBox.sendKeys(Keys.ENTER);
    }


    public static void checkInCheckOut(String checkInDate, String checkOutDate) throws InterruptedException{
        staysPage.dateOneButton.click();
        Thread.sleep(2000);
        StaysPage.xpathForCheckInDate(checkInDate).click();
        StaysPage.xpathForCheckOutDate(checkOutDate).click();
        staysPage.doneButton.click();

    }

    public static boolean isDesiredTextDisplayed(WebElement element){
        return element.isDisplayed();
    }

}
