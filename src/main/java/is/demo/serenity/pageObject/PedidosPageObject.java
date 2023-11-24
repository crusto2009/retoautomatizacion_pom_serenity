package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PedidosPageObject extends PageObject {

    //(//div[contains(@class,'slick-row')])[1]//div[contains(@class,'slick-cell l4 r4')]//i
    private By ordenesList = By.xpath("(//div[contains(@class,'slick-row')])//a");

    //private By nombreEmpleadoEnPedido = By.xpath("(//div[contains(@class,'slick-row')])[1]//div[contains(@class,'slick-cell l4 r4')]");

    public By getOrdenesLista() {
        return ordenesList;
    }
}
