package modelo;

public class Reglamento {
    private int setsPorPartido = 5;      // normalmente 5
    private int puntosPorSet = 25;
    private int puntosTieBreak = 15;
    private int diferenciaMinima = 2;
    private boolean rotacionModificadaTieBreak = false;
    private String otrasReglas;         // texto libre o null

    public Reglamento() {
    }

    public Reglamento(int setsPorPartido, int puntosPorSet, int puntosTieBreak, int diferenciaMinima,
                      boolean rotacionModificadaTieBreak, String otrasReglas) {
        this.setsPorPartido = setsPorPartido;
        this.puntosPorSet = puntosPorSet;
        this.puntosTieBreak = puntosTieBreak;
        this.diferenciaMinima = diferenciaMinima;
        this.rotacionModificadaTieBreak = rotacionModificadaTieBreak;
        this.otrasReglas = otrasReglas;
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


    public boolean isRotacionModificadaTieBreak() {
        return rotacionModificadaTieBreak;
    }

    public void setRotacionModificadaTieBreak(boolean rotacionModificadaTieBreak) {
        this.rotacionModificadaTieBreak = rotacionModificadaTieBreak;
    }

    public String getOtrasReglas() {
        return otrasReglas;
    }

    public void setOtrasReglas(String otrasReglas) {
        this.otrasReglas = otrasReglas;
    }

    @Override
    public String toString() {
        return "Reglamento{" +
                "setsPorPartido=" + setsPorPartido +
                ", puntosPorSet=" + puntosPorSet +
                ", puntosTieBreak=" + puntosTieBreak +
                ", diferenciaMinima=" + diferenciaMinima +
                ", rotacionModificadaTieBreak=" + rotacionModificadaTieBreak +
                ", otrasReglas='" + otrasReglas + '\'' +
                '}';
    }

    public boolean validarResultadoSet(int puntosA, int puntosB, boolean esTieBreak) {
        int max = esTieBreak ? puntosTieBreak : puntosPorSet;
        int pa = puntosA, pb = puntosB;
        // Debe haber alcanzado al menos max puntos, y diferencia >= diferenciaMinima
        if (pa < 0 || pb < 0) return false;
        if (esTieBreak) {
            if ((pa >= max || pb >= max) && Math.abs(pa - pb) >= diferenciaMinima) {
                // p.ej. 15-13 válido; 15-14 inválido (diferencia 1)
                return true;
            }
        }else{
            if ((pa >= max || pb >= max) && Math.abs(pa - pb) >= diferenciaMinima) {
                return true;
            }
        }
        return false;
    }


}
