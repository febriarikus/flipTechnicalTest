package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PusatBantuanWebPage extends PageObject {

    @FindBy(css = ".article-title")
    WebElement pusatBantuanWebHeader;

    public void ISeePusatBantuanWebHeader(){
        Assert.assertEquals("Header should be: 'Cara Melakukan Transfer via Website Flip.'","Cara Melakukan Transfer via Website Flip.",pusatBantuanWebHeader.getText());
    }

}
