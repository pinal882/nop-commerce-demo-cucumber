package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopText;

    public String verifyDesktopsText(){
        String message = getTextFromElement(desktopText);
        return message;
    }
}
