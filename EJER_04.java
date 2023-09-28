import java.io.PrintStream;
import java.util.Scanner;

public class EJER_04 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main (String[] args) {
        int cantDinero = 0;
        int moneda1000 = 0;
        int moneda500 = 0;
        int moneda200 = 0;
        int moneda100 = 0;
        int moneda50 = 0;
        int moneda1 = 0;
        int res = 0;

        screen.println("ingresar la cantidad de dinero");
        cantDinero = keyboard.nextInt();

        moneda1000=cantDinero/1000;
        res=cantDinero%1000;
        moneda500=res/500;
        res=res%500;
        moneda200=res/200;
        res=res%200;
        moneda100=res/100;
        res=res%100;
        moneda50=res/50;
        res=res%50;
        moneda1=res/1;
        screen.println("la cantidad de dinero con monedas es: " +moneda1000+ " monedas de 1000 "
                +moneda500+ " monedas de 500 " +moneda200+ " monedas de 200 " +moneda100+ " monedas de 100 "
                +moneda50+ " monedas de 50 "+moneda1+ " monedas de 1");


    }

}
