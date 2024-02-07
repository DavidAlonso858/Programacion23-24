import java.util.Scanner;

public class Ejercicio612Ahorcado {

    public static char[] Jugador1(String contraseña, int longitud, char letrAhorcado, char[] muestra) {
        contraseña = contraseña.toLowerCase();

        System.out.print("La contraseña es: ");
        for (int conteoLetras = 0; conteoLetras < longitud; conteoLetras++) {
            char letraRecorrido = contraseña.charAt(conteoLetras);

            if (letraRecorrido == letrAhorcado) {
                muestra[conteoLetras] = letrAhorcado;
            }
        }
        System.out.println(muestra);
        return muestra;
    }

    public static boolean acertado(char[] muestra) {
        boolean acertado = true;
        for (int i = 0; i < muestra.length; i++) {
            if (muestra[i] == '_') {
                acertado = false;
            }
        }
        return acertado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña = "Malaga";
        char letrAhorcado = '_';
        int intentos = 7, longitud = contraseña.length();
        char[] muestra = new char[longitud];

        for (int i = 0; i < muestra.length; i++) {
            muestra[i] = '_';
        }

        Jugador1(contraseña, longitud, letrAhorcado, muestra);
        while (intentos > 0 && !acertado(muestra)) {
            System.out.print("\nIntroduzca la letra para adivinar: ");
            letrAhorcado = sc.nextLine().charAt(0);

            muestra = Jugador1(contraseña, longitud, letrAhorcado, muestra);
            intentos--;
            System.out.println("Te quedan " + intentos + " intentos");
        }

        if (intentos > 0 && acertado(muestra)) {
            System.out.println("\n¡Enhorabuena. Has acertado.!");
        } else {
            System.out.println("\n¡Perdiste. Suerte la proxima.!");
        }
    }
}
