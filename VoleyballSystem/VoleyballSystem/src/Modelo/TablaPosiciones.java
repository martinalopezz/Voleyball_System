package Modelo;

public class TablaPosiciones {
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int puntos;

    public TablaPosiciones() {
    }

    public TablaPosiciones(int partidosJugados, int partidosGanados, int partidosPerdidos, int puntos) {
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.puntos = puntos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "TablaPosiciones{" +
                "partidosJugados=" + partidosJugados +
                ", partidosGanados=" + partidosGanados +
                ", partidosPerdidos=" + partidosPerdidos +
                ", puntos=" + puntos +
                '}';
    }
}
