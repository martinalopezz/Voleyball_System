package Utill;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//esta clase es creada para que tenga la seguridad de que no se pueda meter cualquiera

public class Seguridad {

    public static String hashear(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Algoritmo de hash no encontrado", e);
        }
    }
}
