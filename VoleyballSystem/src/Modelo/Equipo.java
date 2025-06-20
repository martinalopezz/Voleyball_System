package Modelo;

public class Equipo {
    private int id_equipo;
    private String nombre;
    private Entrenador entrenador;
    private Capitana capitana;

    public Equipo() {
    }

    public Equipo(int id_equipo, String nombre, Entrenador entrenador, Capitana capitana) {
        this.id_equipo = id_equipo;
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.capitana = capitana;
    }

    public int getId_equipo() { return id_equipo; }

    public void setId_equipo(int id_equipo) { this.id_equipo = id_equipo; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Entrenador getEntrenador() { return entrenador; }

    public void setEntrenador(Entrenador entrenador) { this.entrenador = entrenador; }

    public Capitana getCapitana() { return capitana; }

    public void setCapitana(Capitana capitana) { this.capitana = capitana; }

    @Override
    public String toString() {
        return id_equipo + " - " + nombre +
                " (Entrenador: " + entrenador +
                ", Capitana: " + capitana + ")";
    }



}
