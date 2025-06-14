import control.UsuarioController;
import modelo.Usuario;
import vista.VistaUsuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UsuarioController controller = new UsuarioController();
        VistaUsuario vista = new VistaUsuario();

        String nombre = vista.pedirNombre();
        String clave = vista.pedirContraseña();

        Usuario usuario = controller.login(nombre, clave);
        if (usuario != null) {
            vista.mostrarMensaje("Bienvenido " + usuario.getNombre());
        } else {
            vista.mostrarMensaje("Nombre o contraseña incorrecta");
        }
    }
}

