package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatatanTransaksiPage extends PageObject {
    @FindBy(css = ".content__title")
    WebElement headerCatatanTransaksi;

    public void ISeeCatatanTransaksiHeader(){
        Assert.assertEquals("Header should be: Catatan Transaksi","Catatan Transaksi",headerCatatanTransaksi.getText());
    }
}
