package com.stepDef;

import com.pages.*;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class Donate_StepDef {

    // driver
    WebDriver driver= DriverHelper.getDriver();

    //pages
    Home home =new Home(driver);
    Services services=new Services(driver);

    AboutUs aboutus=new AboutUs(driver);

    MultiMedia multiMedia=new MultiMedia(driver);

    SummerCamp2023 summerCamp=new SummerCamp2023(driver);

    Donate donate=new Donate(driver);




    @When("user clicks donate")
    public void user_clicks_donate() {
       donate.clickDonate(driver);
    }



    @And("user validates each type {string} of donations is clickable and validates we are  the right page, {string}")
    public void userValidatesEachTypeDonationTypeOfDonationsIsClickableAndValidatesWeAreTheRightPageURL(String inOption, String expectedUrl) throws InterruptedException {
      Assert.assertEquals(expectedUrl,donate.validatingDonationOptions(driver,inOption));
    }
}
