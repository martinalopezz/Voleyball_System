package modelo;

import java.time.LocalDate;

public class Campeonato {

    private String nombre;
    private Categoria categoria;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Reglamento reglamento;



    public Campeonato(){

    }

    public Campeonato(String nombre, Categoria categoria, LocalDate fechaInicio, LocalDate fechaFin, Reglamento reglamento) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.reglamento = reglamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Reglamento getReglamento() {
        return reglamento;
    }

    public void setReglamento(Reglamento reglamento) {
        this.reglamento = reglamento;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", reglamento=" + reglamento +
                '}';
    }
}
