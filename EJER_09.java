
import java.io.PrintStream;
import java.util.Scanner;

public class EJER_09 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        int distanciaKm = 0;
        int velocidadKmxh = 0;
        int tiempoH = 0;

        screen.println("ingresar la distancia en km:");
        distanciaKm = keyboard.nextInt();

        screen.println("ingrese el tiempo en horas");
        tiempoH = keyboard.nextInt();

        velocidadKmxh = distanciaKm / tiempoH;
        screen.println("la velocidad para recorrer " + distanciaKm + "Km en " + tiempoH + "horas, es " + velocidadKmxh + "Km/h");
    }

}