package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPageObject extends PageObject {

    private By txtNombreUsuario = By.xpath("//*[@id='LoginPanel0_Username']");

    private By txtPasswordUsuario = By.xpath("//*[@id='LoginPanel0_Password']");

    private By btnLogin = By.xpath("//*[@id='LoginPanel0_LoginButton']");

    private By txtTituloPagePedidos= By.xpath("//*[@class='s-sidebar-group-title']");

    public By getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public By getTxtPasswordUsuario() {
        return txtPasswordUsuario;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getTxtTituloPagePedidos() {
        return txtTituloPagePedidos;
    }
}
