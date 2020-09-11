package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy (css = "body")
    WebElement body;

    @FindBy(css = "#app > div > div > div > div > div > div.login.container")
    WebElement loginContainer;

    @FindBy(css = "#app > div > nav > div > span > a > div > img")
    WebElement flipIcon;

    @FindBy(css = "#app > div > footer > a:nth-child(1)")
    WebElement tutorialButton;

    @FindBy(css = "#app > div > footer > a:nth-child(2)")
    WebElement caraKerjaButton;

    @FindBy(css = "#app > div > footer > a:nth-child(3)")
    WebElement faqButton;

    @FindBy(css = "#app > div > div > div > div > div > div.login.container > div > div > p > a:nth-child(1)")
    WebElement lupaPassword;

    @FindBy(css = "#app > div > div > div > div > div > div.login.container > div > div > p > a:nth-child(3)")
    WebElement disini;

    @FindBy(partialLinkText = "Daftar")
    WebElement daftar;

    @FindBy(name = "email")
    WebElement emailBox;

    @FindBy(name = "password")
    WebElement passwordBox;

    @FindBy(css = "#app > div > div > div > div > div > div.login.container > div > div > form > button")
    WebElement masukButton;

    @FindBy(css = "#app > div > div > div > div > div > div.login.container > div > div > div > ul")
    WebElement errorMessage;


    public void ISeeLoginContainer(){
        loginContainer.isDisplayed();
    }

    public void ISeeFlipIcon(){
        flipIcon.isDisplayed();
    }

    public void clickTutorialButton(){
        tutorialButton.click();
    }

    public void clickCaraKerjaButton(){
        caraKerjaButton.click();
    }

    public void clickFAQButton(){
        faqButton.click();
        body.sendKeys(Keys.CONTROL,Keys.TAB);
    }

    public void clickLupaPassword(){
        lupaPassword.click();
    }

    public void clickDisini(){
        disini.click();
    }

    public void clickDaftar(){
        daftar.click();
    }

    public void inputEmail(String email){
        emailBox.sendKeys(email);
    }

    public void inputPassword(String password){
        passwordBox.sendKeys(password);
    }

    public void clickMasuk(){
        masukButton.click();
    }

    public void errorMessageLoginFailed(){
        errorMessage.isDisplayed();
        Assert.assertEquals("Error message should be: 'Email atau Password salah.'","Email atau Password salah.",errorMessage.getText());
    }
}
