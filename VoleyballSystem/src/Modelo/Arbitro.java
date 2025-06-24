package Modelo;
import java.io.Serializable;

public class Arbitro implements Serializable {
    private int id_arbitro;
    private String nombre;
    private String apellido;

    public Arbitro() {
    }

    public Arbitro(String nombre, String apellido) {
        this.id_arbitro = id_arbitro;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId_arbitro() { return id_arbitro; }

    public void setId_arbitro(int id_arbitro) { this.id_arbitro = id_arbitro; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre;}

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    @Override
    public String toString() {
        return "Arbitro{" +
                "id_arbitro=" + id_arbitro +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
