package Modelo;

import java.time.LocalDate;
import java.util.Set;

public class Campeonato {
    private String nombre;
    private Categoria categoria;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String reglamento;
    private Set<Equipo> listaEquipos;
    private Partido partido;
    private ResultadoPartidos resultadoPartidos;


    public Campeonato(){

    }


}
