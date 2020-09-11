package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageObject {

    @FindBy(name = "nama")
    WebElement name;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "no_hp")
    WebElement phone;

    @FindBy(css = "#app > div > div > div > div > div > div.login > div > div > form > button")
    WebElement daftar;

    public void ISeeNameBox(){
        name.isDisplayed();
    }

    public void ISeeEmailBox(){
        email.isDisplayed();
    }

    public void ISeePasswordBox(){
        password.isDisplayed();
    }

    public void ISeePhoneNumberBox(){
        phone.isDisplayed();
    }

    public void ISeeDaftarButton(){
        daftar.isDisplayed();
    }
}
