import java.io.PrintStream;
import java.util.Scanner;

public class EJER_02 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        long celular = 0;
        long temporal = 0;

        screen.println("Ingresar el número de telefono");
        celular = keyboard.nextLong();

        temporal = (celular) / 10000000;

        screen.println("El prefijo del numero telefonico es " + temporal);
    }
}