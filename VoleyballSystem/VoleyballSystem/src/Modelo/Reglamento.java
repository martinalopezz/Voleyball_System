package Modelo;

public class Reglamento {
    private int setsPorPartido = 5;      // normalmente 5
    private int puntosPorSet = 25;
    private int puntosTieBreak = 15;
    private int diferenciaMinima = 2;

    public Reglamento() {
    }

    public Reglamento(int setsPorPartido, int puntosPorSet, int puntosTieBreak, int diferenciaMinima) {
        this.setsPorPartido = setsPorPartido;
        this.puntosPorSet = puntosPorSet;
        this.puntosTieBreak = puntosTieBreak;
        this.diferenciaMinima = diferenciaMinima;
    }

    public int getSetsPorPartido() {
        return setsPorPartido;
    }

    public void setSetsPorPartido(int setsPorPartido) {
        this.setsPorPartido = setsPorPartido;
    }

    public int getPuntosPorSet() {
        return puntosPorSet;
    }

    public void setPuntosPorSet(int puntosPorSet) {
        this.puntosPorSet = puntosPorSet;
    }

    public int getPuntosTieBreak() {
        return puntosTieBreak;
    }

    public void setPuntosTieBreak(int puntosTieBreak) {
        this.puntosTieBreak = puntosTieBreak;
    }

    public int getDiferenciaMinima() {
        return diferenciaMinima;
    }

    public void setDiferenciaMinima(int diferenciaMinima) {
        this.diferenciaMinima = diferenciaMinima;
    }

    @Override
    public String toString() {
        return "Reglamento{" +
                "setsPorPartido=" + setsPorPartido +
                ", puntosPorSet=" + puntosPorSet +
                ", puntosTieBreak=" + puntosTieBreak +
                ", diferenciaMinima=" + diferenciaMinima +
                '}';
    }
}