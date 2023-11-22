package Biblioteca;

public class Biblioteca {

    public static boolean esPrimo(int numero) {
        boolean primo = true;

        for (int cont = 2; cont < numero && primo; cont++) {
            if (numero % cont == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static boolean esCapicua(int numero) {
        boolean capicua;
        int numReverso = 0;

        int aux = numero;
        while (aux > 0) {
            int cifra = aux % 10;
            numReverso = (numReverso * 10) + cifra;
            aux /= 10;
        }
        if (numReverso == numero) {
            capicua = true;
        } else {
            capicua = false;
        }
        return capicua;
    }

    public static String siguientePrimo(int numero) {
        int contador = 0;
        String mostrar = "";
        for (; contador < 1; numero++) {
            int aux = numero + 1;
            if (esPrimo(aux)) {
                mostrar = " " + aux;
                contador++;
            }
        }
        return mostrar;
    }

    public static int potencia(int base, int exponente) {

        int resultado;

        resultado = (int) Math.pow(base, exponente);

        return resultado;
    }

    public static int digitos(int numero) {
        int aux = numero, longitud = 0;
        while (aux > 0) {
            aux /= 10;
            longitud++;
        }
        return longitud;
    }

    public static void main(String[] args) {
        int numero = 17, base = 2, exponente = 3;

        System.out.println("Es primo: " + esPrimo(numero));
        System.out.println("Es capicua: " + esCapicua(numero));
        System.out.println("El siguiente primo es:" + siguientePrimo(numero));
        System.out.println(potencia(base, exponente));
        System.out.println("El numero de digitos es: " + digitos(numero));
    }
}
