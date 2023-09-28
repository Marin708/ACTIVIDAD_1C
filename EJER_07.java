
import java.io.PrintStream;
import java.util.Scanner;

public class EJER_07 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        float dim1 = 0;
        float dim2 = 0;
        float dim3 = 0;
        double multi = 0;

        screen.println("Ingresar el valor de la altura(h) en cm");
        dim1 = keyboard.nextFloat();

        screen.println("ingrese el valor de la profundidad en cm");
        dim2 = keyboard.nextFloat();

        screen.println("ingrese el valor del ancho en cm");
        dim3 = keyboard.nextFloat();

        multi=dim2*dim1*dim3;
        multi=multi*0.001;
        multi=(multi*90)/100;
        screen.println("Los litros necesarios para que se alcance el 90% de capacidad son: " +multi );
    }
}