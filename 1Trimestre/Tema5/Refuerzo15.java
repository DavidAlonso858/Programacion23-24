import java.util.Arrays;
import java.util.Scanner;

public class Refuerzo15 {

    public static int aleatorio() {
        int numero;
        numero = (int) (Math.random() * (4 - 0 + 1));
        return numero;
    }

    public static void mostrarIndiceMesa(int[] mesa) {
        for (int i = 0; i < mesa.length; i++) {
            System.out.print(i + 1 + " ");
        }
    }

    public static int[] rellenarMesa(int[] mesa) {
        for (int i = 0; i < mesa.length; i++) {
            mesa[i] = aleatorio();
        }
        return mesa;
    }

    public static boolean mesaSinCompartir(int[] mesa, int numero) {
        boolean encontrado = false;
        for (int i = 0; i < mesa.length && !encontrado; i++) {
            if (mesa[i] == 0) {
                mesa[i] = numero;
                encontrado = true;
                System.out.println("Por favor, sientense en la mesa numero " + (i + 1));
            }
        }
        return encontrado;
    }

    public static void mesaCompartida(int[] mesa, int numero) {
        boolean encontrado = false;
        for (int i = 0; i < mesa.length && !encontrado; i++) {
            if (mesa[i] + numero <= 4) {
                mesa[i] += numero;
                encontrado = true;
                System.out.println(
                        "Tendrán que compartir mesa. Por favor, sientese en la mesa numero " + (i + 1));
            } else if (mesa[i] + numero > 4 && i == mesa.length - 1) {
                System.out.println("Los siento, en estos momentos no queda sitio.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mesa = new int[10];
        boolean encontrado;
        int numero;
        System.out.print("Bienvenido a Restaurante Array\n");

        rellenarMesa(mesa); // solo una vez y luego se modifica con lo introducido
        do {
            System.out.println();
            System.out.print("Mesa nª ");
            mostrarIndiceMesa(mesa);

            System.out.print("\nOcupacion: " + Arrays.toString(mesa));

            System.out.print("\n\n¿Cuantos son? (Introduzca -1 para salir del programa): ");
            numero = sc.nextInt();
            if (numero > 4 || numero == 0) {
                System.out.println("Los siento no admitimos grupos de " + numero
                        + ", haga grupos de 4 personas como maximo e intente de nuevo.");
            } else if (numero != -1) {
                encontrado = mesaSinCompartir(mesa, numero); // pongo el bucle como funcion que devuelva el mensaje y
                                                             // booleano (boolean)

                if (!encontrado) {
                    mesaCompartida(mesa, numero); // devuelve solo el mensaje (void)
                }
            }

        } while (numero != -1);
        System.out.println("Gracias. Hasta pronto.");
    }
}
