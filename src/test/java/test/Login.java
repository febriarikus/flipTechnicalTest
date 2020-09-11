package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import step.LoginSteps;

public class Login {
    @Steps
    LoginSteps loginSteps;

//-------------------Scenario: 1. Open Login Page-----------------------------------------------------------------------

    @Given("I have flip login url")
    public void i_have_flip_login_url() {

    }

    @When("I access login url")
    public void i_access_login_url() {
        loginSteps.accessURL();
    }

    @Then("I directed to flip login page")
    public void i_directed_to_flip_login_page() {
        loginSteps.validateFlipIcon();
        loginSteps.validateLoginContainer();
    }

//-------------------Scenario: 2. Open Tutorial Page--------------------------------------------------------------------

    @Given("I already in login page")
    public void i_already_in_login_page() {
       loginSteps.accessURL();
    }

    @When("I click Tutorial")
    public void i_click_Tutorial() {
        loginSteps.clickTutorial();
    }

    @Then("I directed to flip Tutorial page")
    public void i_directed_to_flip_tutorial_page() {
        loginSteps.validateTutorialPage();
    }

//-------------------Scenario: 3. Open Cara Kerja Page------------------------------------------------------------------

    @When("I click Cara Kerja")
    public void i_click_Cara_Kerja() {
       loginSteps.clickCaraKerja();
    }

    @Then("I directed to flip Cara Kerja page")
    public void i_directed_to_flip_Cara_Kerja_page() {
       loginSteps.validateCaraKerjaPage();
    }

//-------------------Scenario: 4. Open FAQ Page-------------------------------------------------------------------------

    @When("I click FAQ")
    public void i_click_FAQ() {
       loginSteps.clickFAQ();
    }

    @Then("I directed to flip FAQ page")
    public void i_directed_to_flip_FAQ_page() {
        loginSteps.validateFAQPage();
    }

//-------------------Scenario: 5. Click Lupa Password-------------------------------------------------------------------

    @When("I click Lupa Password")
    public void i_click_Lupa_Password() {
       loginSteps.clickLupaPassword();
    }

    @Then("I directed to Lupa Password Page")
    public void i_directed_to_Lupa_Password_Page() {
        loginSteps.validateLupaPasswordPage();
    }

//-------------------Scenario: 6. Click di sini-------------------------------------------------------------------------

    @When("I click di sini")
    public void i_click_di_sini() {
        loginSteps.clickDisini();
    }

    @Then("I directed Registration Page")
    public void i_directed_Registration_Page() {
       loginSteps.validateRegistrationPage();
    }

//-------------------Scenario: 7. Click Daftar--------------------------------------------------------------------------

    @When("I click Daftar")
    public void i_click_Daftar() {
        loginSteps.clickDaftar();
    }

//-------------------Scenario: 8. Login Success-------------------------------------------------------------------------

    @When("I input valid email and valid password")
    public void i_input_valid_email_and_valid_password() {
        loginSteps.inputValidEmail();
        loginSteps.inputValidPasword();
    }

    @When("I click Masuk")
    public void i_click_Masuk() {
        loginSteps.clickMasuk();
    }

    @Then("I directed to Flip Homepage")
    public void i_directed_to_Flip_Homepage() {
       loginSteps.validateDirectedToHomepage();
    }

//-------------------Scenario: 9. Login Failed--------------------------------------------------------------------------

    @When("I input \"([^\"]*)\" and \"([^\"]*)\"")
    public void i_input_and(String email, String password) {
        loginSteps.inputEmail(email);
        loginSteps.inputPassword(password);

    }

    @Then("I failed login Flip Homepage")
    public void i_failed_login_Flip_Homepage() {
        loginSteps.validateErrorMessageLoginFailed();
    }

//-------------------Scenario: 9. Login Failed--------------------------------------------------------------------------

    @When("I access {string} without login")
    public void i_access_without_login(String string) {
        loginSteps.accessFeatureURL(string);
    }

}
