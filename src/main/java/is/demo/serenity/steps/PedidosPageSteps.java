package is.demo.serenity.steps;

import is.demo.serenity.pageObject.PedidosPageObject;
import models.Empleado;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.SeleccionAleatoria;

import java.util.List;

public class PedidosPageSteps {

    @Page
    PedidosPageObject pagepedidos;

    @Step
    public void listarPedidos(){
        List<WebElement> pedidos = pagepedidos.getDriver().findElements(pagepedidos.getOrdenesLista());

        WebElement producto = SeleccionAleatoria.seleccionProducto(pedidos);
        Empleado.setNombreEmpleado(producto.findElement(By.xpath("//div[contains(@class,'slick-cell l4 r4')]")).getText());
        producto.click();

    }

}
