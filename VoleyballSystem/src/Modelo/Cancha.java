package Modelo;
import java.io.Serializable;

public class Cancha implements Serializable {
    private String numeroCancha;

    public Cancha() {
    }

    public Cancha(String numeroCancha) {
        this.numeroCancha = numeroCancha;
    }

    public String getNumeroCancha() {
        return numeroCancha;
    }

    public void setNumeroCancha(String numeroCancha) {
        this.numeroCancha = numeroCancha;
    }

    @Override
    public String toString() {
        return numeroCancha;
    }
}

