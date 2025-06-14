import control.UsuarioController;
import vista.VistaUsuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UsuarioController controller = new UsuarioController();
        VistaUsuario vista = new VistaUsuario();

        String nombre = vista.pedirNombre();
        String clave = vista.pedirContraseña();
    }
}

