package modelo;

public class Resultado {
    private int puntosLocal;
    private int puntosVisitante;

    public Resultado(){

    }

    public Resultado(int puntosLocal, int puntosVisitante) {
        this.puntosLocal = puntosLocal;
        this.puntosVisitante = puntosVisitante;
    }

    public int getPuntosLocal() {
        return puntosLocal;
    }

    public void setPuntosLocal(int puntosLocal) {
        this.puntosLocal = puntosLocal;
    }

    public int getPuntosVisitante() {
        return puntosVisitante;
    }

    public void setPuntosVisitante(int puntosVisitante) {
        this.puntosVisitante = puntosVisitante;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "puntosLocal=" + puntosLocal +
                ", puntosVisitante=" + puntosVisitante +
                '}';
    }
}

