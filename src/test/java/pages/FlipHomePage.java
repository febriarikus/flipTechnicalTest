package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipHomePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div/div/div[1]")
    WebElement greeting;

    @FindBy(css = "div.button")
    WebElement kirimUangNavBar;

    @FindBy(css = "div.mx-3:nth-child(2) > a:nth-child(1)")
    WebElement catatanTransaksi;

    @FindBy(css = ".dropdown-toggle")
    WebElement account;

    @FindBy(css = ".dropdown-menu")
    WebElement dropdownMenu;

    @FindBy(css = "a.dropdown-item:nth-child(1)")
    WebElement buatRefundDropDown;

    @FindBy(css = "a.dropdown-item:nth-child(3)")
    WebElement logout;

    @FindBy(css = "#app > div > div > div > div > div > div.mt-3.py-3.card > div > div > div:nth-child(1)")
    WebElement kirimUangButton;

    @FindBy(linkText = "Kirim Uang ke Luar Negeri")
    WebElement kirimUangKeLuarNegeriButton;

    @FindBy(css = "div.button-send:nth-child(3) > div:nth-child(1) > div:nth-child(1)")
    WebElement terimaUangButton;

    @FindBy(linkText = "Buat Refund")
    WebElement buatRefundButton;

    @FindBy(css = "#app > div > div > div > div > div > div.home__transaction.mt-3.card > div > div > div > div > a")
    WebElement lihatPanduanButton;

    @FindBy(css = "body > div.fade.modal-verification.popup--stick-bottom.modal.show > div > div > div > div")
    WebElement sendMoneyContainer;

    @FindBy(css = ".personal-data > h4:nth-child(2)")
    WebElement popUpVerifikasiAkun;


    public void ISeeGreeting(){
        greeting.isDisplayed();
    }

    public void clickKirimUangNavBar(){
        kirimUangNavBar.click();
    }

    public void ISeeSendMoneyContainer(){
        sendMoneyContainer.isDisplayed();
    }

    public void clickCatatanTransaksi(){
        catatanTransaksi.click();
    }

    public void clickAccount(){
        account.click();
    }

    public void ISeeDropDownMenu(){
        dropdownMenu.isDisplayed();
    }

    public void clickBuatRefundDropDown(){
        buatRefundDropDown.click();
    }

    public void clickLogout(){
        logout.click();
    }

    public void clickKirimUang(){
        kirimUangButton.click();
    }

    public void clickKirimUangKeLuarNegeri(){
        kirimUangKeLuarNegeriButton.click();
    }

    public void clickTerimaUang(){
        terimaUangButton.click();
    }

    public void ISeeVerificationPopUp(){
        Assert.assertEquals("Pop up should be: Verifikasi Akun","Verifikasi Akun",popUpVerifikasiAkun.getText());
    }

    public void clickBuatRefund(){
        buatRefundButton.click();
    }

    public void clickLihatBantuan(){
        lihatPanduanButton.click();
    }
}
