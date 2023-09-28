import java.io.PrintStream;
import java.util.Scanner;

public class EJER_06 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int Segundostot = 0;
        int Dias = 0;
        int Horas = 0;
        int Minutos = 0;
        int Segundos = 0;
        int residuo = 0;

        screen.println("ingrese el valor de segundos totales:");
        Segundostot= keyboard.nextInt();

        Dias=Segundostot/86400;
        residuo=Segundostot%86400;
        Horas=residuo/3600;
        residuo=residuo%3600;
        Minutos=residuo/60;
        Segundos=residuo%60;
        screen.println("El valor total de los segundos es: "+Dias+ " días "
                +Horas+ " Horas "
                +Minutos+ " minutos "
                +Segundos+ " segundos ");

    }
}
