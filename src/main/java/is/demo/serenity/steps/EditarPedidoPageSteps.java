package is.demo.serenity.steps;

import is.demo.serenity.pageObject.DashboardPageObject;
import is.demo.serenity.pageObject.EditarPedidoPageObject;
import models.Empleado;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EditarPedidoPageSteps {

    @Page
    EditarPedidoPageObject editarpedidopage;

    @Step("seleccionar un empleado")
    public void seleccionarEmpleado(){
        WebDriver driver = editarpedidopage.getDriver();
        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
        driver.findElement(editarpedidopage.getEmpleadoSelect()).click();
        if(driver.findElement(editarpedidopage.getContenedorEmpleados()).isDisplayed()){

            List<WebElement> empleado =driver.findElements(editarpedidopage.getListaEmpleados());
            empleado.get(1).click();
            //Capturamos el nombre del empleado
            System.out.println(empleado);
            //Empleado.setNombreEmpleado(empleado.get(0).getText());
        }
    }

    @Step("clic en boton actualizar")
    public void clickBtnActualizar(){
        WebDriver driver = editarpedidopage.getDriver();
        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
        driver.findElement(editarpedidopage.getBtnActualizar()).click();
    }

    @Step()
    public void validarMensaje(){
        WebDriver driver = editarpedidopage.getDriver();
        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
        Assert.assertTrue(editarpedidopage.getDriver().findElement(editarpedidopage.getTxtMensajeValidacion()).isDisplayed());
    }



}
