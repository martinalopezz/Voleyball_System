package Controlador;

import Modelo.*;
import Vista.VistaGeneral;

import java.util.HashSet;
import java.util.Set;

public class ControladorGeneral {
    private VistaGeneral vista;
    private Set<Equipo> listaEquipos;
    private Set<Cancha> listaCancha;
    private Set<Categoria> listaCategoria;


    public void instanciaObjetos() {
        Cancha cancha1 = new Cancha ("Cancha 1");
        listaCancha.add(cancha1);
        Cancha cancha2 = new Cancha ("Cancha 2");
        listaCancha.add(cancha2);
        Categoria categoria1 = new Categoria(1, "Sub14");
        listaCategoria.add(categoria1);
        Categoria categoria2 = new Categoria(2, "Sub15");
        listaCategoria.add(categoria2);
        Categoria categoria3 = new Categoria(3, "Sub16");
        listaCategoria.add(categoria3);
        Categoria categoria4 = new Categoria(4, "Sub17");
        listaCategoria.add(categoria4);
        Categoria categoria5 = new Categoria(5, "Primera");
        listaCategoria.add(categoria5);

    }

    public void iniciar() {
        int opc = vista.elegirOpcion();
        while (opc != 0) {
            switch (opc) {
                case 1:
                    vista.caracteristicasSistema();
                    break;
                case 2:
                    vista.reglamentoCampeonato();
                    break;
                case 3:
                    seleccionarCategoria();
                    break;
                case 4:
                    registrarEquipo();
                    break;
                /*case 5:
                    mostrarequipos();
                    break;
                case 6:
                    registrarPartido();
                    break;
                case 7:
                    resultadosPartidos();
                    break;
                case 8:
                    mostrarTablaPosiciones();
                    break;*/
                case 0:
                    vista.mensajeError();
                    break;
            }
            opc = vista.elegirOpcion();
        }
    }

    private void seleccionarCategoria() {
        vista.mostrarLista("🏐 Lista categorias: ", listaCategoria);
        int codCategoria = vista.pedirEntero("el id categoria: ");
        String categoriaSeleccionada = null;

        for (Categoria l : listaCategoria) {
            if (l.getIdCategoria() == codCategoria) {
                categoriaSeleccionada = l.getNombreCategoria();
                break;
            }
        }

        if (categoriaSeleccionada != null) {
            System.out.println("Categoria seleccionada: " + categoriaSeleccionada);
        } else {
            System.out.println("Categoria no encontrada.");
        }
    }

    private void registrarEquipo() {
        int idEquipo = vista.pedirEntero("id del equipo: ");
        String nombreEquipo = vista.pedirString("el nombre del equipo: ");

        String nombreEntrenador = vista.pedirString("el nombre del entrenador: ");
        String apellidoEntrenador = vista.pedirString("el apellido del entrenador: ");
        Entrenador entrenador = new Entrenador(nombreEntrenador, apellidoEntrenador);

        String nombreCapitana = vista.pedirString("el nombre de la capitana: ");
        String apellidoCapitana = vista.pedirString("el apellido de la capitana: ");
        Capitana capitana = new Capitana(nombreCapitana, apellidoCapitana);

        Equipo nuevoEquipo = new Equipo(idEquipo, nombreEquipo, entrenador, capitana);

        listaEquipos.add(nuevoEquipo);

        vista.mostrarEquipo(nuevoEquipo);
    }


    public ControladorGeneral() {
        vista = new VistaGeneral();
        listaCancha = new HashSet<>();
        listaCategoria = new HashSet<>();
        listaEquipos = new HashSet<>();
    }

}
