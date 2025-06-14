package modelo;

import Utill.Seguridad;

public class Usuario {
    private String nombre;
    private String contraseña;

    public Usuario(){
    }

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean validarContraseña(String clavePlana) {
        return this.contraseña.equals(Seguridad.hashear(clavePlana));
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public boolean validarContraseña(String clavePlana) {
        return this.contraseña.equals(utill.Seguridad.hashear(clavePlana));
    }
}


}
