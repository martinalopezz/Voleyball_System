package Modelo;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private Cancha cancha;
    private String fecha;
    private Arbitro arbitro;


    public Partido(Equipo equipo1, Equipo equipo2, Cancha cancha, String fecha, Arbitro arbitro) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.cancha = cancha;
        this.fecha = fecha;
        this.arbitro = arbitro;
    }

    // Getters para mostrar si querés imprimir el partido
    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() { return equipo2; }

    public Cancha getCancha() { return cancha; }

    public String getFecha() { return fecha; }

    public Arbitro getArbitro() { return arbitro; }

    @Override
    public String toString() {
        return "📅 Partido: " + equipo1.getNombre() + " vs " + equipo2.getNombre() +
                "\n🏟️ Cancha: " + cancha.getNumeroCancha() +
                "\n📆 Fecha: " + fecha +
                "\n🧑 Árbitro: " + arbitro.getNombre() + " " + arbitro.getApellido();
    }
}

