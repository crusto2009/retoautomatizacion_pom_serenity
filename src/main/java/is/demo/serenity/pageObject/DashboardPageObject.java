package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPageObject extends PageObject {

    /* (//*[contains(@class,'s-dashboard-card-sm')])[1]//a */

    /* (//*[text()='More info '])[1] */

    private By lnkOpenOrders = By.xpath("(//*[contains(@class,'s-dashboard-card-sm')])[1]//a");

    public By getLnkOpenOrders() {
        return lnkOpenOrders;
    }
}
