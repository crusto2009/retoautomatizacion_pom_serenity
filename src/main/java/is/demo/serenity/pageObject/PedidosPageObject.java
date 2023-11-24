package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PedidosPageObject extends PageObject {

    private By ordenesList = By.xpath("//div[contains(@class,'slick-cell l0 r0')]//a");

    public By getOrdenesList() {
        return ordenesList;
    }
}
