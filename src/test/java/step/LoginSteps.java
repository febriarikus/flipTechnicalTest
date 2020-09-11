package step;
import org.openqa.selenium.WebDriver;
import pages.*;

public class LoginSteps {

    LoginPage loginPage;
    TutorialPage tutorialPage;
    CaraKerjaPage caraKerjaPage;
    FAQPage faqPage;
    LupaPasswordPage lupaPasswordPage;
    RegistrationPage registrationPage;
    FlipHomePage flipHomePage;

    public void accessURL(){
        loginPage.open();
    }

    public void validateFlipIcon(){
        loginPage.ISeeFlipIcon();
    }

    public void validateLoginContainer(){
        loginPage.ISeeLoginContainer();
    }

    public void clickTutorial(){
        loginPage.clickTutorialButton();
    }

    public void validateTutorialPage(){
        tutorialPage.ISeeTutorialHeader();
    }

    public void clickCaraKerja(){
        loginPage.clickCaraKerjaButton();
    }

    public void validateCaraKerjaPage(){
        caraKerjaPage.ISeeCaraKerjaContent();

    }

    public void clickFAQ(){
        loginPage.clickFAQButton();
        MethodBuilder.moveTab(1);
    }

    public void validateFAQPage(){
        faqPage.ISeeButtonWeb();
        faqPage.ISeeButtonBigFlip();
        faqPage.ISeeButtonAPIBigFlip();
        faqPage.ISeeButtonLayananKirimUang();
        faqPage.ISeeButtonInformasiUmum();
        faqPage.ISeeButtonVerifikasidanPengaturanAkun();
        faqPage.ISeeButtonKirimUang();
        faqPage.ISeeButtonPulsanPaketData();
    }

    public void clickLupaPassword(){
        loginPage.clickLupaPassword();
    }

    public void validateLupaPasswordPage(){
        lupaPasswordPage.ISeeEmailBox();
        lupaPasswordPage.ISeeResetPasswordButton();
    }

    public void clickDisini(){
        loginPage.clickDisini();
    }

    public void validateRegistrationPage(){
        registrationPage.ISeeNameBox();
        registrationPage.ISeeEmailBox();
        registrationPage.ISeePasswordBox();
        registrationPage.ISeePhoneNumberBox();
        registrationPage.ISeeDaftarButton();
    }

    public void clickDaftar(){
        loginPage.clickDaftar();
    }

    public void inputValidEmail(){
        loginPage.inputEmail(Input.validEmail);
    }

    public void inputValidPasword(){
        loginPage.inputPassword(Input.validPassword);
    }

    public void clickMasuk(){
        loginPage.clickMasuk();
    }

    public void validateDirectedToHomepage(){
        MethodBuilder.sleep(3000);
        flipHomePage.ISeeGreeting();
    }

    public void inputEmail(String email){
        loginPage.inputEmail(email);
    }

    public void inputPassword(String password){
        loginPage.inputPassword(password);
    }

    public void validateErrorMessageLoginFailed(){
        MethodBuilder.sleep(3000);
        loginPage.errorMessageLoginFailed();
    }

    public void accessFeatureURL(String url){
        MethodBuilder.getURL(url);
    }




}
