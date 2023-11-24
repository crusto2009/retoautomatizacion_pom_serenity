package is.demo.serenity.stepsDefinitions;

import io.cucumber.java.es.*;
import is.demo.serenity.steps.DashboardPageSteps;
import is.demo.serenity.steps.EditarPedidoPageSteps;
import is.demo.serenity.steps.PedidosPageSteps;
import net.thucydides.core.annotations.Steps;

public class CambioEmpleadoStepDefinitions {

    @Steps
    DashboardPageSteps dashboardsteps;

    @Steps
    PedidosPageSteps pedidossteps;

    @Steps
    EditarPedidoPageSteps editarpediosteps;


    @Cuando("de clic en open orders")
    public void deClicEnOpenOrders() {
        dashboardsteps.clicOpenOrdenes();
    }
    @Cuando("seleccione cualquiera de las ordenes")
    public void seleccioneCualquieraDeLasOrdenes() {
        pedidossteps.listarPedidos();
    }
    @Cuando("seleccione un nuevo empleado")
    public void seleccioneUnNuevoEmpleado() {
        editarpediosteps.seleccionarEmpleado();
    }
    @Cuando("de clic en guardo los cambios")
    public void deClicEnGuardoLosCambios() {
        editarpediosteps.clickBtnActualizar();
    }

    @Entonces("visualizo mensaje de actualizacion")
    public void visualizoMensajeDeActualizacion() {
        editarpediosteps.validarMensaje();
    }
}
