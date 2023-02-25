package com.expedia.stepDefinitions;

import com.expedia.appsCommon.PageInitializer;
import com.expedia.utils.CucumberLogUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends PageInitializer{
    
    @Before
    public void start(Scenario scenario){
        CucumberLogUtils.scenario = scenario;
        
        setUp();
        initializeAllPages();    
    }

     @After
    public void end(){
        tearDown();
    }  

}



