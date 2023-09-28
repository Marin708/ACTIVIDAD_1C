import java.io.PrintStream;
import java.util.Scanner;

public class EJER_08 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int Ancho = 0;
        int Alto = 0;
        int Pulgadas = 0;
        int Diagonal = 0;

        screen.println("Ingresar el ancho del televisor en cm");
        Ancho=keyboard.nextInt();
        screen.println("Ingresar el alto del televisor en cm");
        Alto=keyboard.nextInt();

        Diagonal= (int)Math.sqrt((Alto*Alto)+(Ancho*Ancho));

        Pulgadas=(int) (Diagonal/2.538709);
        screen.println("Las pulgadas son: " +Pulgadas);

    }
}