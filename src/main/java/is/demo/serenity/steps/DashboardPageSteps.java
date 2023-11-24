package is.demo.serenity.steps;

import is.demo.serenity.pageObject.DashboardPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DashboardPageSteps {

    @Page
    DashboardPageObject dashboardpage;

    @Step
    public void clicOpenOrdenes(){
        WebDriver driver = dashboardpage.getDriver();

        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
        driver.findElement(dashboardpage.getLnkOpenOrders()).click();
    }

}
