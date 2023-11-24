package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPageObject extends PageObject {

    private By lnkOpenOrders = By.xpath("(//*[contains(@class,'s-dashboard-card-sm')])[1]//a");

    public By getLnkOpenOrders() {
        return lnkOpenOrders;
    }
}
