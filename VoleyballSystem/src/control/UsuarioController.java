package control;

import util.Seguridad;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    public void registrarUsuarios(String nombre, String claveplana) {
        String contraHasheada = Seguridad.hashear(claveplana);
        Usuario nuevo = new Usuario(nombre, contraHasheada);
        usuarios.add(nuevo);
        // Podés guardar en archivo si querés persistencia
    }
    public void manejarPostLogin(Usuario usuario) {
        if (usuario instanceof Administrador) {
            // podrías castear para acceder a métodos específicos
            Administrador admin = (Administrador) usuario;
            admin.eliminarCampeonato(); // por ejemplo
        } else if (usuario instanceof UsuarioComun) {
            UsuarioComun comun = (UsuarioComun) usuario;
            comun.consultarResultados(); // método propio
        }
    }


    public Usuario login(String nombre, String claveplana) {
        String contraHasheada = Seguridad.hashear(claveplana);
        for (Usuario u : usuarios) {
            if (u.getNombre().equals(nombre) && u.validarContraseña(claveplana)) {
                return u;
            }
        }

        return null;
    }
}

