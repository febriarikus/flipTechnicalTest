package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LupaPasswordPage extends PageObject {
    @FindBy(name = "email")
    WebElement emailBox;

    @FindBy(css = "#app > div > div > div > div > div > div.card > div > button")
    WebElement resetPasswordButton;


    public void ISeeEmailBox(){
        emailBox.isDisplayed();
    }

    public void ISeeResetPasswordButton(){
        resetPasswordButton.isDisplayed();
    }
}
