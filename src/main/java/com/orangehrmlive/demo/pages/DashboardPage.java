package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 3.DashboardPage - Dashboard text Locator
 * and create appropriate methods for it.
 */

public class DashboardPage extends Utility {
    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    WebElement clickONDashboardLink;
    @CacheLookup
    @FindBy(xpath = "(//h6[normalize-space()='Dashboard'])[1]")
    WebElement verifyDashboardText;


    public String verifyDashboardText() {
        log.info("verify Dashboard Text : " + verifyDashboardText.toString());
        return getTextFromElement(verifyDashboardText);
    }

    public void clickONDashboardLink(){
        clickOnElement(clickONDashboardLink);
        log.info("click ON Dashboard Link : " + clickONDashboardLink.toString());
    }
}