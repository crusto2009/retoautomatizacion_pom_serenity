package is.demo.serenity.steps;


import interfaces.LoginInterfaces;
import is.demo.serenity.pageObject.LoginPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import utils.DatosExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class LoginPageSteps implements LoginInterfaces {

    //Cargamos el excel
    private static ArrayList<Map<String,String>> LeerExcelInicioSesion = new ArrayList<>();

    @Page
    LoginPageObject loginpageobject;

    @Step
    public void abrirNavegador(){
        loginpageobject.openUrl("https://demo.serenity.is");
    }

    @Step("Ingresar crendenciales de inicio")
    public void ingresarCredenciales() throws IOException {

        LeerExcelInicioSesion = DatosExcel.leerExcel("src/main/resources/Data/DatosLogin.xlsx", "InicioSesion");

        String usuario = LeerExcelInicioSesion.get(0).get("Usuario");
        String password = LeerExcelInicioSesion.get(0).get("Password");
        loginpageobject.getDriver().findElement(loginpageobject.getTxtNombreUsuario()).clear();
        loginpageobject.getDriver().findElement(loginpageobject.getTxtNombreUsuario()).sendKeys(usuario);
        loginpageobject.getDriver().findElement(loginpageobject.getTxtPasswordUsuario()).clear();
        loginpageobject.getDriver().findElement(loginpageobject.getTxtPasswordUsuario()).sendKeys(password);

    }

    @Step
    public void clicBotonLogin(){
        loginpageobject.getDriver().findElement(loginpageobject.getBtnLogin()).click();
    }

    @Step
    public void validarPaginaTitulo(){

        WebDriver driver = loginpageobject.getDriver();

        driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(loginpageobject.getTxtTituloPagePedidos()).isDisplayed());
    }
}
