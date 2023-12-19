package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computersText;
    @CacheLookup
    //@FindBy(css = "body > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(3) > li:nth-child(2)")
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
   // @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopLink;
    public String  verifyComputerText(){
        String message = getTextFromElement(computersText);
        return message;

    }
    public void clickOnDesktop(){
        clickOnElement(desktopLink);
    }
}
