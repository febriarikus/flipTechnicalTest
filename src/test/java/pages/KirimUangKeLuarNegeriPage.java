package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KirimUangKeLuarNegeriPage extends PageObject {

    @FindBy(css = ".sc-jdfcpN")
    WebElement nantiSajaButton;

    @FindBy(css = ".c-page-title")
    WebElement headerKirimUangKeLuarNegeri;

    public void clickNanti(){
        nantiSajaButton.click();
    }

    public void ISeeKirimUangKeLuarNegeriHeader(){
        Assert.assertEquals("Header should be: Kirim Uang ke Luar Negeri","Kirim Uang ke Luar Negeri",headerKirimUangKeLuarNegeri.getText());
    }
}
