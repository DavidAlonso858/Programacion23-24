import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio519 {

    public static int[] insercion(int[] tabla, int dorsal) {
        int[] nuevo = Arrays.copyOf(tabla, tabla.length + 1);
        nuevo[nuevo.length - 1] = dorsal;
        return nuevo;
    }

    public static void menores(int[] tabla, Scanner sc) {
        String menorEdad;
        int temporal;
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Es el corredor " + tabla[i] + " menor de edad ? ");
            menorEdad = sc.next();
            if (menorEdad.equals("si") && i != 0) {
                temporal = tabla[i];
                tabla[i] = tabla[i - 1];
                tabla[i - 1] = temporal;
            }
        }
    }

    public static void positivoDopaje(int[] tabla, Scanner sc) {
        String positivo;
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("El corredor " + tabla[i] + " ha dado positivo ? ");
            positivo = sc.next();
            if (positivo.equals("si")) {
                tabla[i] = -1;
            }
        }
    }

    public static void noPago(int[] tabla, Scanner sc) {
        String pago;
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("¿El corredor con dorsal " + tabla[i] + " ha pagado? ");
            pago = sc.next();
            if (pago.equals("no")) {
                tabla[i] = tabla[tabla.length - 1]; // Se coloca al final de la tabla
            }
        }
    }

    public static void medallas(int[] tabla) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println(tabla[i] + " Ganador de la medalla de oro");
            } else if (i == 1) {
                System.out.println(tabla[i] + " Ganador de la medalla de plata");
            } else if (i == 2) {
                System.out.println(tabla[i] + " Ganador de la medalla de bronce");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[0];
        int dorsal;
        System.out.println("Muestra de los corredores que han llegado a la meta. Introduce -1 cuando esten todos.\n");

        do {
            System.out.print("Introduzca el dorsal del corredor: ");
            dorsal = sc.nextInt();
            if (dorsal != -1) {
                tabla = insercion(tabla, dorsal);
            }
        } while (dorsal != -1);

        System.out.println("Tabla original de los corredores: " + Arrays.toString(tabla) + "\n");
        menores(tabla, sc);
        positivoDopaje(tabla, sc);
        noPago(tabla, sc);
        medallas(tabla);
        System.out.println("Tabla con la info extra de los corredores: " + Arrays.toString(tabla));
    }
}
