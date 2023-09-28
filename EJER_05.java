import java.io.PrintStream;
import java.util.Scanner;

public class EJER_05 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double cantDinero = 0;
        double Euro = 0;
        double Dolar = 0;

        screen.println("Ingresar la cantidad de dinero");
        cantDinero=keyboard.nextDouble();
        screen.println("Ingresar el valor actual del euro");
        Euro=keyboard.nextDouble();
        screen.println("Ingresar el valor actual del dolar");
        Dolar=keyboard.nextDouble();

        Euro=cantDinero/Euro;
        Dolar=cantDinero/Dolar;
        screen.println("el valor del dinero en euros es:" + Euro);
        screen.println("El valor del dinero en dolares es:" + Dolar);




    }


}