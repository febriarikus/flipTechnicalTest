package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaraKerjaPage extends PageObject {
    @FindBy(css = "#section4 > div > p")
    WebElement caraKerjaFlip;

    public void ISeeCaraKerjaContent(){
        Assert.assertEquals("Cara Kerja Should be 'Flip bekerja sebagai jembatan transaksi antar bank. Kamu cukup melakukan transfer terlebih dahulu ke rekening Flip yang sama dengan bank yang kamu miliki. Kemudian kami akan meneruskan uangmu ke rekening tujuan.'",
                "Flip bekerja sebagai jembatan transaksi antar bank. Kamu cukup melakukan transfer terlebih dahulu ke rekening Flip yang sama dengan bank yang kamu miliki. Kemudian kami akan meneruskan uangmu ke rekening tujuan.",
                caraKerjaFlip.getText());
    }
}
