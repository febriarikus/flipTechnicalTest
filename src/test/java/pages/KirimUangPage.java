package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KirimUangPage extends PageObject {
    @FindBy(css = "body > div.fade.modal-verification.popup--stick-bottom.modal.show > div > div > div > div > div.send-money-row.row > div:nth-child(1) > div")
    WebElement kirimUangTanpaVerifikasi;

    @FindBy(css = "body > div.fade.modal-verification.popup--stick-bottom.modal.show > div > div > div > div > div.send-money-row.row > div:nth-child(2) > div")
    WebElement verifikasiAkun;

    @FindBy(css = "#app > div > div > div > div > div > div.transaction__card.card > div > form > div:nth-child(1) > div > select")
    WebElement pilihSenderBank;

    @FindBy(css = "#app > div > div > div > div > div > div.transaction__card.card > div > form > div:nth-child(1) > div > select > option:nth-child(2)")
    WebElement senderMandiri;

    @FindBy(css = "#app > div > div > div > div > div > div.transaction__card.card > div > form > div:nth-child(1) > div > select > option:nth-child(3)")
    WebElement senderBRI;

    @FindBy(css = "#app > div > div > div > div > div > div.transaction__card.card > div > form > div:nth-child(1) > div > select > option:nth-child(4)")
    WebElement senderBNI;

    @FindBy(css = "#app > div > div > div > div > div > div.transaction__card.card > div > form > div:nth-child(1) > div > select > option:nth-child(5)")
    WebElement senderBCA;

    @FindBy(css = "#app > div > div > div > div > div > div.transaction__card.card > div > form > div:nth-child(1) > div > select > option:nth-child(6)")
    WebElement senderBankSyariahMandiri;

    @FindBy(css = "#app > div > div > div > div > div > div.transaction__card.card > div > form > div:nth-child(1) > div > select > option:nth-child(7)")
    WebElement senderCIMBNiaga;

    @FindBy(css = "#app > div > div > div > div > div > div.transaction__card.card > div > form > div:nth-child(1) > div > select > option:nth-child(8)")
    WebElement senderMuamalat;

    @FindBy(css = "#app > div > div > div > div > div > div.transaction__card.card > div > form > div:nth-child(1) > div > select > option:nth-child(9)")
    WebElement senderBTPN;

    @FindBy(css = "#app > div > div > div > div > div > div.transaction__card.card > div > form > div:nth-child(1) > div > select > option:nth-child(10)")
    WebElement senderPermata;

    @FindBy(css = "#beneficiary_bank")
    WebElement beneficiaryBank;

    @FindBy(css = "#beneficiary_bank > option:nth-child(2)")
    WebElement beneficiaryBRI;

    @FindBy(css = "#beneficiary_bank > option:nth-child(3)")
    WebElement beneficiaryBNI;

    @FindBy(css = "#beneficiary_bank > option:nth-child(4)")
    WebElement beneficiaryBCA;

    @FindBy(css = "#beneficiary_bank > option:nth-child(5)")
    WebElement beneficiaryBankSyariahMandiri;

    @FindBy(css = "#beneficiary_bank > option:nth-child(6)")
    WebElement beneficiaryCIMBNiaga;

    @FindBy(css = "#beneficiary_bank > option:nth-child(7)")
    WebElement beneficiaryMuamalat;

    @FindBy(css = "#beneficiary_bank > option:nth-child(8)")
    WebElement beneficiaryBTPN;

    @FindBy(css = "#beneficiary_bank > option:nth-child(9)")
    WebElement beneficiaryPermata;

    @FindBy(name = "account_number")
    WebElement accountNumberField;

    @FindBy(css = "#app > div > div > div > div > div > div.transaction__card.card > div > form > div:nth-child(2) > div.tab-content > div.fade.tab-pane.active.show > div.transaction__input-group.transaction__input-group--last.input-group > button")
    WebElement checkNameButton;

    @FindBy(css = "body > div.fade.popup.popup--large.modal.show > div > div > img")
    WebElement popUpCheckName;

    @FindBy(css = "body > div.fade.popup.popup--large.modal.show > div > div > div > button")
    WebElement OKbutton;

    @FindBy(name = "amount")
    WebElement nominalField;

    @FindBy(name = "remark")
    WebElement messageField;


}
