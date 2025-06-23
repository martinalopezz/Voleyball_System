package Recursos;

import Modelo.Partido;
import java.io.*;
import java.util.ArrayList;

public class ArchivoPartido {
    private static final String NOMBRE_ARCHIVO = "partidos.dat";

    public void guardarPartido(Partido partido) {
        ArrayList<Partido> partidos = obtenerPartidos();
        partidos.add(partido);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            oos.writeObject(partidos);
        } catch (IOException e) {
            System.out.println("Error al guardar partido: " + e.getMessage());
        }
    }

    public ArrayList<Partido> obtenerPartidos() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            return (ArrayList<Partido>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer archivo de partidos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
