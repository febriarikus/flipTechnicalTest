package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RefundPage extends PageObject {
    @FindBy(css = ".content__title")
    WebElement headerRefund;

    public void ISeeBuatRefundTitle(){
        headerRefund.isDisplayed();
        Assert.assertEquals("Header should be: Buat Refund","Buat Refund",headerRefund.getText());
    }
}
