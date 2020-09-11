package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import step.HomepageSteps;

public class Homepage {
    @Steps
    HomepageSteps homepageSteps;

    @Given("I already log in to flip")
    public void i_already_log_in_to_flip() {
        homepageSteps.accessURL();
        homepageSteps.inputValidEmail();
        homepageSteps.inputValidPasword();
        homepageSteps.clickMasuk();
    }

//-------------------Scenario: 1. Click Kirim Uang via Navbar-----------------------------------------------------------

    @Given("I already in homepage")
    public void i_already_in_homepage() {
        homepageSteps.validateDirectedToHomepage();
    }

    @When("I click Kirim Uang via Navbar")
    public void i_click_Kirim_Uang_via_Navbar() {
        homepageSteps.clickKirimUangNavBar();
    }

    @Then("I directed to page Kirim Uang")
    public void i_directed_to_page_Kirim_Uang() {
        homepageSteps.validatePageKirimUang();
    }

//-------------------Scenario: 2. Click Catatan Transaksi via Navbar----------------------------------------------------

    @When("I click Catatan Transaksi via Navbar")
    public void i_click_Catatan_Transaksi_via_Navbar() {
        homepageSteps.clickCatatanTransaksi();
    }

    @Then("I directed to page Catatan Transaksi")
    public void i_directed_to_page_Catatan_Transaksi() {

        homepageSteps.validatePageCatatanTransaksi();
    }

//-------------------Scenario: 3. Click Account Name via Navbar---------------------------------------------------------

    @When("I click Account Name via Navbar")
    public void i_click_Account_Name_via_Navbar() {
        homepageSteps.clickAccount();
    }

    @Then("Dropdown menu is displayed")
    public void dropdown_menu_is_displayed() {
        homepageSteps.dropdownMenuIsDisplayed();
    }

//-------------------Scenario: 4. Click Buat Refund via Navbar----------------------------------------------------------

    @When("I click Buat Refund via Navbar")
    public void i_click_Buat_Refund_via_Navbar() {
        homepageSteps.clickBuatRefundviaNavbar();
    }

    @Then("I directed to Refund Page")
    public void i_directed_to_Refund_Page() {
        homepageSteps.validatePageBuatRefund();
    }

//-------------------Scenario: 5. Click Button Kirim Uang---------------------------------------------------------------

    @When("I click button Kirim Uang")
    public void i_click_button_Kirim_Uang() {
        homepageSteps.clickKirimUang();
    }

//-------------------Scenario: 6. Click Button Kirim Uang Ke Luar Negeri------------------------------------------------

    @When("I click button Kirim Uang Ke Luar Negeri")
    public void i_click_button_Kirim_Uang_Ke_Luar_Negeri() {
        homepageSteps.clickKirimUangKeLuarNegeri();
    }

    @Then("I directed to page Kirim Uang Ke Luar Negeri")
    public void i_directed_to_page_Kirim_Uang_Ke_Luar_Negeri() {
        homepageSteps.validatePageKirimUangKeLuarNegeri();
    }

//-------------------Scenario: 7. Click Button Terima Uang when Unverified----------------------------------------------

    @When("I click button Terima Uang")
    public void i_click_button_Terima_Uang() {
        homepageSteps.clickTerimaUang();
    }

    @Then("I directed to verification pop up")
    public void i_directed_to_verification_pop_up() {
        homepageSteps.validateVerificatinPopUp();
    }

//-------------------Scenario: 8. Click Button Buat Refund--------------------------------------------------------------

    @When("I click button Buat Refund")
    public void i_click_button_Buat_Refund() {
        homepageSteps.clickBuatRefund();
    }

//-------------------Scenario: 9. Click Button Lihat Panduan------------------------------------------------------------
    @When("I click button Lihat Panduan")
    public void i_click_button_Lihat_Panduan() {
        homepageSteps.clickLihaBantuan();
    }

    @Then("I directed to Pusat Bantuan Page")
    public void i_directed_to_Pusat_Bantuan_Page() {
        homepageSteps.validatePusatBantuanPage();
    }

//-------------------Scenario: 9. Click Button Lihat Panduan------------------------------------------------------------

    @When("I click Logout")
    public void i_click_Logout() {
        homepageSteps.clickLogout();
    }




}
