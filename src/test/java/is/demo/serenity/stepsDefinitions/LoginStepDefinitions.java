package is.demo.serenity.stepsDefinitions;

import io.cucumber.java.es.*;
import is.demo.serenity.steps.LoginPageSteps;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;

public class LoginStepDefinitions {

    @Steps
    LoginPageSteps loginpagesteps;


    @Dado("que es usuario abre el navegador")
    public void queEsUsuarioAbreElNavegador() {
        loginpagesteps.abrirNavegador();
    }
    @Cuando("ingrese las credenciales")
    public void ingreseLasCredenciales() throws IOException {
        loginpagesteps.ingresarCredenciales();
    }
    @Cuando("de clic en el boton iniciar sesion")
    public void deClicEnElBotonIniciarSesion() {
        loginpagesteps.clicBotonLogin();
    }


    @Entonces("visualizo la pagina del home")
    public void visualizoLaPaginaDelHome() {
        loginpagesteps.validarPaginaTitulo();
    }

}
