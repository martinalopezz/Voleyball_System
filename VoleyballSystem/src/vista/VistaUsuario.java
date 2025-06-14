package vista;


import java.util.Scanner;

public class VistaUsuario {
    private Scanner scanner = new Scanner(System.in);

    public String pedirNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    public String pedirContraseña() {
        System.out.print("Ingrese su contraseña: ");
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}


