package interfaces;

import java.io.IOException;


/**
 * @author CristianAlbertoHerná
 * Se implementa la interfaz para reutilizar metodos frecuentes en una ventana de login.
 */
public interface LoginInterfaces {

    public void abrirNavegador();
    public void ingresarCredenciales() throws IOException;
    public void clicBotonLogin();
}
