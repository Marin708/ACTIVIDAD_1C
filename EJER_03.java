import java.io.PrintStream;
import java.util.Scanner;

public class EJER_03 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int hora;
        float valhora;
        int retencion;
        float salbruto;
        float salneto;
        float retfte;

        screen.println("Ingresar el numero de horas trabajadas");
        hora = keyboard.nextInt();

        screen.println("Ingrese el valor por hora de trabajo");
        valhora = keyboard.nextFloat();

        screen.println("Ingrese el porcentaje de retencion");
        retencion = keyboard.nextInt();

        salbruto = hora * valhora;
        retfte = salbruto * (retencion / 100f);
        salneto = salbruto - retfte;
        screen.println("El salario bruto es:" + salbruto);
        screen.println("La retencion en la fuente es:" + retfte);
        screen.println("El salario neto del trabajador es:" + salneto);
    }
}
