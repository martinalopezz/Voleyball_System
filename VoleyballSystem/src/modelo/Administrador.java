package modelo;



public class Administrador extends Usuario {

    public Administrador(String nombre, String contraseña) {
        super(nombre, contraseña); // llama al constructor de Usuario
    }

    public void eliminarCampeonato() {
        System.out.println("Campeonato eliminado por el Administrador");
    }

    @Override
    public String getNombre() {
        return "ADMIN - " + super.getNombre();
    }

}



