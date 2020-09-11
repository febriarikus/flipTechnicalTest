package step;

import pages.*;

public class HomepageSteps {
    FlipHomePage flipHomePage;
    LoginPage loginPage;
    CatatanTransaksiPage catatanTransaksiPage;
    RefundPage refundPage;
    KirimUangKeLuarNegeriPage kirimUangKeLuarNegeriPage;
    PusatBantuanWebPage pusatBantuanWebPage;

    public void accessURL(){
        loginPage.open();
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

    public void clickKirimUangNavBar(){
        flipHomePage.clickKirimUangNavBar();
    }

    public void validatePageKirimUang(){
        flipHomePage.ISeeSendMoneyContainer();
    }

    public void clickCatatanTransaksi(){
        flipHomePage.clickCatatanTransaksi();
    }

    public void validatePageCatatanTransaksi(){
        catatanTransaksiPage.ISeeCatatanTransaksiHeader();
    }

    public void clickAccount(){
        flipHomePage.clickAccount();
    }

    public void dropdownMenuIsDisplayed(){
        flipHomePage.ISeeDropDownMenu();
    }

    public void clickBuatRefundviaNavbar(){
        flipHomePage.clickBuatRefundDropDown();
    }

    public void validatePageBuatRefund(){
        refundPage.ISeeBuatRefundTitle();
    }

    public void clickKirimUang(){
        flipHomePage.clickKirimUang();
    }

    public void clickKirimUangKeLuarNegeri(){
        flipHomePage.clickKirimUangKeLuarNegeri();
    }

    public void validatePageKirimUangKeLuarNegeri(){
        kirimUangKeLuarNegeriPage.clickNanti();
        kirimUangKeLuarNegeriPage.ISeeKirimUangKeLuarNegeriHeader();
    }

    public void clickTerimaUang(){
        flipHomePage.clickTerimaUang();
    }

    public void validateVerificatinPopUp(){
        flipHomePage.ISeeVerificationPopUp();
    }

    public void clickBuatRefund(){
        flipHomePage.clickBuatRefund();
    }

    public void clickLihaBantuan(){
        flipHomePage.clickLihatBantuan();
    }

    public void validatePusatBantuanPage(){
        MethodBuilder.moveTab(1);
        pusatBantuanWebPage.ISeePusatBantuanWebHeader();

    }

    public void clickLogout(){
        flipHomePage.clickLogout();
    }
}
