package Archivo;

import Modelo.Equipo;
import java.io.*;
import java.util.ArrayList;

public class ArchivoEquipo {
    private static final String NOMBRE_ARCHIVO = "equipos.dat";

    public void guardarEquipo(Equipo equipo) {
        ArrayList<Equipo> equipos = obtenerEquipos();
        equipos.add(equipo);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            oos.writeObject(equipos);
        } catch (IOException e) {
            System.out.println("Error al guardar equipo: " + e.getMessage());
        }
    }

    public ArrayList<Equipo> obtenerEquipos() {
        File archivo = new File(NOMBRE_ARCHIVO);
        if (!archivo.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            return (ArrayList<Equipo>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer archivo de equipos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
