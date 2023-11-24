package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditarPedidoPageObject extends PageObject {

    private By empleadoSelect= By.xpath("//*[@id='s2id_Serenity_Demo_Northwind_OrderDialog15_EmployeeID']//a");

    private By elementoEmpleado= By.xpath("//*[@id='select2-drop']");

    private By btnActualizar = By.xpath("//*[@class = 'fa fa-clipboard-check text-purple']");

    private By contenedorEmpleados =By.xpath("//*[@id='select2-drop']");

    private By btnGuardar = By.xpath("/*[text()=' Guardar']");

    private By txtMensajeValidacion = By.id("toast-container");

    private By listaEmpleados = By.xpath("//*[contains(@id,'select2-results')]//li");

    public By getEmpleadoSelect() {
        return empleadoSelect;
    }

    public By getTxtMensajeValidacion() {
        return txtMensajeValidacion;
    }

    public By getBtnActualizar() {
        return btnActualizar;
    }

    public By getBtnGuardar() {
        return btnGuardar;
    }

    public By getElementoEmpleado() {
        return elementoEmpleado;
    }

    public By getListaEmpleados() {
        return listaEmpleados;
    }

    public By getContenedorEmpleados() {
        return contenedorEmpleados;
    }


}
