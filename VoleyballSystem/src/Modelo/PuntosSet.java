package Modelo;
import java.io.Serializable;

public class PuntosSet implements Serializable{
    private int setsPorPartido = 4;
    private int SetTieBreak = 1;
    private int puntosPorSet = 25;
    private int puntosTieBreak = 15;
    private int diferenciaMinima = 2;
    private int setsEquipo1;
    private int setsEquipo2;

    public PuntosSet(int sets1, int sets2) {
    }

    public PuntosSet(int setsPorPartido, int setTieBreak, int puntosPorSet, int puntosTieBreak, int diferenciaMinima) {
        this.setsPorPartido = setsPorPartido;
        SetTieBreak = setTieBreak;
        this.puntosPorSet = puntosPorSet;
        this.puntosTieBreak = puntosTieBreak;
        this.diferenciaMinima = diferenciaMinima;
    }

    public PuntosSet(int setsPorPartido, int setsEquipo1, int setsEquipo2) {
        this.setsPorPartido = setsPorPartido;
        this.setsEquipo1 = setsEquipo1;
        this.setsEquipo2 = setsEquipo2;
    }

    public int getSetsPorPartido() {
        return setsPorPartido;
    }

    public void setSetsPorPartido(int setsPorPartido) {
        this.setsPorPartido = setsPorPartido;
    }

    public int getSetTieBreak() {
        return SetTieBreak;
    }

    public void setSetTieBreak(int setTieBreak) {
        SetTieBreak = setTieBreak;
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

    public int getSetsEquipo1() {
        return setsEquipo1;
    }

    public void setSetsEquipo1(int setsEquipo1) {
        this.setsEquipo1 = setsEquipo1;
    }

    public int getSetsEquipo2() {
        return setsEquipo2;
    }

    public void setSetsEquipo2(int setsEquipo2) {
        this.setsEquipo2 = setsEquipo2;
    }

    @Override
    public String toString() {
        return "📊 Resultado del Partido:\n" +
                "   - Sets ganados por Equipo 1: " + setsEquipo1 + "\n" +
                "   - Sets ganados por Equipo 2: " + setsEquipo2 + "\n" +
                "   - Configuración: " +
                "setsPorPartido=" + setsPorPartido +
                ", tieBreak=" + SetTieBreak +
                ", puntosPorSet=" + puntosPorSet +
                ", puntosTieBreak=" + puntosTieBreak +
                ", diferenciaMinima=" + diferenciaMinima;
    }

}
