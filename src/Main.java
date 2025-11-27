import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ejer1

        boolean esPremium = true;

        int edad = 18;

        boolean accesoExclisivo = (edad >= 18) && esPremium;

        System.out.println("\nEl usuarios es Premium: "+ accesoExclisivo);

        // Ejer2

        boolean perfilcompleto = true;
        int cuenta = 1100;
        int edad2 = 25;

        boolean saldoCuenta = (cuenta > 1000) || (edad2 < 25);

        System.out.println("\nLa Promoción es: "+ saldoCuenta);

        // Ejer3

        int saldoCuenta3 = 0;
        String nombreUsuario = "invitado";

        boolean perfilIncompleto = (saldoCuenta3 == 0) || !nombreUsuario.equals("invitado");

        System.out.println("\nPerfil incompleto?: " + perfilIncompleto);

        // Ejer4


        boolean perfilActivoTotal = (!perfilIncompleto && accesoExclisivo || saldoCuenta);


        System.out.println("\nPerfil Activo es: "+ perfilActivoTotal);







    }
}
