package step;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public interface MethodBuilder {

    static void moveTab(Integer number){
        ArrayList<String> tabs = new
                ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(number));
    }

    static void sleep(Integer milisecond){
        try {
            Thread.sleep(milisecond);
        } catch (Exception e) { }
    }

    static void getURL(String url){
        ArrayList<String> tabs = new
                ArrayList<String>(getDriver().getWindowHandles());
        getDriver().get(url);
    }
}
