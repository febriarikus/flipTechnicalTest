package pages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TutorialPage extends PageObject {
    @FindBy(css = "#section1 > h1")
    WebElement tutorialHeader;

    public void ISeeTutorialHeader(){
        Assert.assertEquals("Invalid Header : Should be 'Tutorial'","Tutorial",tutorialHeader.getText());
    }

}
