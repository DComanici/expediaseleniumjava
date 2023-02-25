package com.expedia.appsCommon;
import com.expedia.pages.HotelsPage;
import com.expedia.pages.StaysPage;
import com.expedia.pages.FlightsPage;
import com.expedia.pages.SignInPage;
import com.expedia.pages.CruisesPage;
import com.expedia.web.WebDriverUtils;

public class PageInitializer extends WebDriverUtils{
    
    
    public static StaysPage staysPage;
    public static HotelsPage hotelsPage;
    public static CruisesPage cruisesPage;
    public static FlightsPage flightsPage;
    public static SignInPage signInPage;


    public void initializeAllPages() {

        staysPage = new StaysPage();
        hotelsPage = new HotelsPage();
        cruisesPage = new CruisesPage();
        flightsPage = new FlightsPage();
        signInPage = new SignInPage();
     
    }  

}



