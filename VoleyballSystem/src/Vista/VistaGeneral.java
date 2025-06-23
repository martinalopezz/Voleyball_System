package Vista;

import Modelo.Cancha;
import Modelo.Equipo;
import Modelo.Partido;

import java.util.Scanner;
import java.util.Set;

public class VistaGeneral {
    Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("----🏐 MENÚ 🏐----:" +
                "\n🟢 1- Caracteristicas del sistema para el tipo de campeonato que se adapta." +
                "\n🟢 2- Reglamento general del campeonato." +
                "\n🟢 3- Seleccionar categoria del campeonato." +
                "\n🟢 4- Registrar equipo." +
                "\n🟢 5- Mostrar equipos." +
                "\n🟢 6- Registrar partido." +
                "\n🟢 7- Consultar resultados de partidos." +
                "\n🟢 8- Consultar tabla de posiciones." +
                "\n🔴 0- Salir");
    }

    public int elegirOpcion(){
        this.mostrarMenu();
        System.out.println("Ingrese la opcion: ");
        return this.sc.nextInt();
    }

    public void caracteristicasSistema() {
        System.out.println("📝 El sistema se adapta a un campeonato regional que se desarrollará en dos etapas con un total de seis equipos. La primera será una fase de dos grupos, \n" +
                "tres equipos en cada uno, donde los equipos se enfrentarán entre sí en diferentes canchas. Los dos mejores equipos de cada zona avanzarán a la segunda etapa, una fase \n" +
                "eliminatoria directa con cuartos de final, semifinales y final. \n" +
                "Los partidos se disputarán en canchas donde se enfrentaran dos equipos con sus representantes. Se finalizarán al mejor de 5 sets, en caso de empate a dos sets (2-2), se \n" +
                "jugará un tie-break a 15 puntos para definir el ganador del encuentro. Cada partido será arbitrado por un solo árbitro.");

    }
    public void reglamentoCampeonato() {
        System.out.println("El campeonato se llevabará a cabo bajo las reglas oficiales de voleibol, con las siguientes especificaciones:" +
                "\n•Sets: Se gana un set al alcanzar 25 puntos, con una diferencia mínima de dos puntos. El tie-break se juega a 15 puntos.\n" +
                "\n•Tiempos muertos: Cada equipo dispone de tres tiempos muertos por set. En el tie-break, cada equipo solo tendrá un tiempo muerto.\n" +
                "\n•Faltas: Queda prohibido tocar la red, pisar la línea de saque, invadir el espacio del equipo contrario.\n" +
                "\n•Rotaciones: Se realizarán rotaciones obligatorias. En el tie-break, se podría considerar una rotación modificada o simplificada para agilizar el juego. (La modificación específica de la rotación debería definirse con claridad antes del inicio del torneo).\n" +
                "\n•Cambios: Se permiten cambios. Una jugadora puede ser sustituido por otra en cualquier momento durante un tiempo muerto o cuando el juego está parado. No hay límite de sustituciones. El jugador que entra debe ocupar la posición del jugador que sale.");
    }

    public int pedirEntero(String dato) {
        System.out.println("Ingrese " + dato);
        return sc.nextInt();
    }

    public String pedirString(String dato) {
        System.out.println("Ingrese " + dato);
        return sc.next();
    }

    public void mostrarLista(String dato, Set lista){
        System.out.println(dato);
        for (Object o: lista){
            System.out.println(o);
        }
    }

    public void mensajeError() {
        System.out.println("❌ Error! Intente nuevamente ❌");
    }

    public void mostrarEquipo(Equipo equipo) {
        System.out.println("\n✔ Equipo registrado:");
        System.out.println("Id del equipo: " + equipo.getId_equipo());
        System.out.println("Nombre del equipo: " + equipo.getNombre());
        System.out.println("Entrenador: " + equipo.getEntrenador());
        System.out.println("Capitana: " + equipo.getCapitana());
    }

    public void mostrarMensaje(String Dato) {
        System.out.println(Dato);
    }

    public void mostrarPartido(Partido partido) {
        System.out.println(partido.toString());
    }



}
