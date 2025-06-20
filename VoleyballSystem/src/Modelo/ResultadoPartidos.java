package Modelo;

public class ResultadoPartidos {
    private PuntosSet puntosSet;

    public ResultadoPartidos() {
    }

    public ResultadoPartidos(PuntosSet puntosSet) {
        this.puntosSet = puntosSet;
    }

    public PuntosSet getPuntosSet() {
        return puntosSet;
    }

    public void setPuntosSet(PuntosSet puntosSet) {
        this.puntosSet = puntosSet;
    }

    @Override
    public String toString() {
        return "ResultadoPartidos{" +
                "puntosSet=" + puntosSet +
                '}';
    }
}
