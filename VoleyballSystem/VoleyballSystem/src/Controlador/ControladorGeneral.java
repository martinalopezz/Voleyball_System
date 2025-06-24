package Controlador;

import Modelo.*;
import Modelo.Equipo;
import Modelo.Cancha;
import Modelo.Categoria;
import Modelo.Partido;
import Vista.VistaGeneral;
import Archivo.ArchivoEquipo;
import Archivo.ArchivoPartido;

import Vista.VistaGeneral;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ControladorGeneral {
    private VistaGeneral vista;
    private Set<Equipo> listaEquipos;
    private Set<Cancha> listaCancha;
    private Set<Categoria> listaCategoria;
    private Set<Partido> listaPartidos;


    public void instanciaObjetos() {
        Cancha cancha1 = new Cancha("1");
        listaCancha.add(cancha1);
        Cancha cancha2 = new Cancha("2");
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
                case 5:
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
                    break;
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

        ArchivoEquipo archivoEquipo = new ArchivoEquipo();
        archivoEquipo.guardarEquipo(nuevoEquipo);

    }

    private void mostrarequipos() {
        if (listaEquipos.isEmpty()) {
            vista.mostrarMensaje("No hay equipos registrados.");
        } else {
            vista.mostrarMensaje("🏐 Lista de equipos:");
            for (Equipo equipo : listaEquipos) {
                vista.mostrarEquipo(equipo);
            }
        }
    }

    private void registrarPartido() {
        vista.mostrarMensaje("📋 Registrar Partido");


        vista.mostrarLista("Equipos disponibles:", listaEquipos);
        int idEquipo1 = vista.pedirEntero("ID del primer equipo:");
        String nombreEquipo1 = vista.pedirString("el nombre del equipo 1:");
        int idEquipo2 = vista.pedirEntero("ID del segundo equipo:");
        String nombreEquipo2 = vista.pedirString("el nombre del equipo 2:");

        String nombreArbitro = vista.pedirString("el nombre del árbitro:");
        String apellidoArbitro = vista.pedirString("el apellido del árbitro:");

        Arbitro arbitro = new Arbitro(nombreArbitro, apellidoArbitro);


        if (idEquipo1 == idEquipo2) {
            vista.mostrarMensaje(" Error, NO SE PUEDE REGISTRAR PARTIDO DEL MISMO EQUIPO , VOLVE A REGISTRARLO");
            return;
        }

        Equipo equipo1 = buscarEquipoPorId(idEquipo1);
        Equipo equipo2 = buscarEquipoPorId(idEquipo2);

        if (equipo1 == null || equipo2 == null) {
            vista.mostrarMensaje("Uno o ambos equipos no existen");
        }

        vista.mostrarLista("Canchas Disponibles: ", listaCancha);
        String numeroCancha = vista.pedirString("Numero de la Cancha: ");
        Cancha cancha = buscarCanchaPorNumero(numeroCancha);

        if (cancha == null) {
            vista.mostrarMensaje("No se puedo encontrar la cancha");
            return;
        }

        String fecha = vista.pedirString("la fecha del partido (AAAA-MM-DD)(ej: 2025-06-21):");

        Partido partido = new Partido(equipo1, equipo2, cancha, fecha, arbitro);

        int setsEquipo1 = vista.pedirEntero("Ingrese los sets ganados por " + equipo1.getNombre() + ": ");
        int setsEquipo2 = vista.pedirEntero("Ingrese los sets ganados por " + equipo2.getNombre() + ": ");

        PuntosSet resultado = new PuntosSet(setsEquipo1, setsEquipo2);
        partido.setPuntosSet(resultado);

        listaPartidos.add(partido);

        vista.mostrarMensaje("✅ Partido registrado correctamente con resultado:");
        vista.mostrarPartido(partido);

        ArchivoPartido archivoPartido = new ArchivoPartido();
        archivoPartido.guardarPartido(partido);


    }

    private Equipo buscarEquipoPorId(int id) {
        for (Equipo equipo : listaEquipos) {
            if (equipo.getId_equipo() == id) {
                return equipo;
            }
        }
        return null;
    }

    private Cancha buscarCanchaPorNumero(String numero) {
        for (Cancha c : listaCancha) {
            if (c.getNumeroCancha().equalsIgnoreCase(numero)) {
                return c;
            }
        }
        return null;
    }

    private void resultadosPartidos() {
        vista.mostrarMensaje("📋 Ingresar resultados de partidos");

        if (listaPartidos.isEmpty()) {
            vista.mostrarMensaje("No hay partidos registrados.");
            return;
        }

        vista.mostrarLista("Lista de partidos:", listaPartidos);
        String fecha = vista.pedirString("la fecha del partido que desea cargar resultado (AAAA-MM-DD):");

        Partido partidoEncontrado = null;

        for (Partido partido : listaPartidos) {
            if (partido.getFecha().equals(fecha)) {
                partidoEncontrado = partido;
                break;
            }
        }

        if (partidoEncontrado == null) {
            vista.mostrarMensaje("No se encontró un partido con esa fecha.");
            return;
        }

        int sets1 = vista.pedirEntero("la cantidad de sets ganados por " + partidoEncontrado.getEquipo1().getNombre());
        int sets2 = vista.pedirEntero("la cantidad de sets ganados por " + partidoEncontrado.getEquipo2().getNombre());

        PuntosSet resultado = new PuntosSet(sets1, sets2);
        partidoEncontrado.setPuntosSet(resultado);

        vista.mostrarMensaje("✅ Resultado cargado correctamente.");
        vista.mostrarPartido(partidoEncontrado);
    }

    public ControladorGeneral() {
        vista = new VistaGeneral();
        listaCancha = new HashSet<>();
        listaCategoria = new HashSet<>();

        ArchivoEquipo archivoEquipo = new ArchivoEquipo();
        listaEquipos = new HashSet<>(archivoEquipo.obtenerEquipos());

        ArchivoPartido archivoPartido = new ArchivoPartido();
        listaPartidos = new HashSet<>(archivoPartido.obtenerPartidos());
    }

    private void mostrarTablaPosiciones() {

        vista.mostrarMensaje("📊 Tabla de posiciones");

        if (listaEquipos.isEmpty()) {
            vista.mostrarMensaje("No hay equipos registrados.");
            return;
        }

        for (Equipo equipo : listaEquipos) {
            int jugados = 0;
            int ganados = 0;
            int perdidos = 0;
            int puntos = 0;

            for (Partido partido : listaPartidos) {
                if (partido.getPuntosSet() == null) {
                    continue;
                }

                if (partido.getEquipo1().equals(equipo)) {
                    jugados++;
                    if (partido.getPuntosSet().getSetsEquipo1() > partido.getPuntosSet().getSetsEquipo2()) {
                        ganados++;
                        puntos += 2;
                    } else {
                        perdidos++;
                    }
                } else if (partido.getEquipo2().equals(equipo)) {
                    jugados++;
                    if (partido.getPuntosSet().getSetsEquipo2() > partido.getPuntosSet().getSetsEquipo1()) {
                        ganados++;
                        puntos += 2;
                    } else {
                        perdidos++;
                    }
                }
            }

            System.out.println("Equipo: " + equipo.getNombre());
            System.out.println("Partidos Jugados: " + jugados + " | Partidos Ganados: " + ganados + " " +
                    "| Partidos Perdidos: " + perdidos + " | Puntos: " + puntos);
            System.out.println("--------------------------------------------------");
        }
    }
}
