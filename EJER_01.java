import java.io.PrintStream;
import java.util.Scanner;

public class EJER_01 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        int num1 = 0;
        int div = 0;
        int res = 0;

        screen.println("Ingresar un número entero");
        num1 = keyboard.nextInt();

        screen.println("Dividido entre 2");

        div = num1 / 2;

        screen.println("El cociente de la división es:" + div);

        res = num1 % 2;
        screen.println("El residuo de la división es:" + res);
    }
}