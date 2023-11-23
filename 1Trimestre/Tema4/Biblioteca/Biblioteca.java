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

        if (voltea(numero) == numero) {
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

    public static int voltea(int numero) {
        int cifra, numVolteado = 0;
        int aux = numero;
        while (aux > 0) {
            cifra = aux % 10;
            numVolteado = numVolteado * 10 + cifra;
            aux /= 10;
        }
        return numVolteado;
    }

    public static int digitoN(int numero, int posicion) {
        int digito, aux = voltea(numero), digitoBueno = 0;
        boolean encontrado = false;

        for (int contPosicion = 0; contPosicion < digitos(numero) && !encontrado; contPosicion++) {
            digito = aux % 10;
            if (contPosicion == posicion) {
                digitoBueno = digito;
                encontrado = true;
            }
            aux /= 10;
        }
        return digitoBueno;
    }

    public static int posicionDigito(int numero, int digito) {
        int cifra, aux = voltea(numero), posicionBuena = 0;
        boolean encontrado = false;

        for (int contPosicion = 0; contPosicion < digitos(numero) && !encontrado; contPosicion++) {
            cifra = aux % 10;
            if (cifra == digito) {
                posicionBuena = contPosicion;
                encontrado = true;
            } else {
                posicionBuena = -1;
            }
            aux /= 10;
        }
        return posicionBuena;
    }

    public static int quitaPorDetras(int numero, int detrasDigitos) {
        int aux = numero, nuevoNumero = 0;
        boolean encontrado = false;

        for (int contPosicion = 0; contPosicion < digitos(numero) && !encontrado; contPosicion++) {
            if (contPosicion == detrasDigitos) {
                nuevoNumero = aux;
                encontrado = true;
            }

            aux /= 10;
        }
        return nuevoNumero;
    }

    public static int quitaPorDelante(int numero, int delanteDigitos) {
        int aux = voltea(numero), nuevoNumero = 0;
        boolean encontrado = false;

        for (int contPosicion = 0; contPosicion < digitos(numero) && !encontrado; contPosicion++) {
            if (contPosicion == delanteDigitos) {
                nuevoNumero = aux;
                encontrado = true;
            }

            aux /= 10;
        }
        return nuevoNumero;
    }

    public static void main(String[] args) {
        int numero = 17, base = 2, exponente = 3, posicion = 0, digito = 1,
                detrasDigitos = 1, delanteDigitos=1;

        System.out.println("Es primo: " + esPrimo(numero));
        System.out.println("Es capicua: " + esCapicua(numero));
        System.out.println("El siguiente primo es:" + siguientePrimo(numero));
        System.out.println(potencia(base, exponente));
        System.out.println("El numero de digitos es: " + digitos(numero));
        System.out.println("Volteado es: " + voltea(numero));
        System.out.println(digitoN(numero, posicion));
        System.out.println(posicionDigito(numero, digito));
        System.out.println("Al quitarle por detras se queda: "+quitaPorDetras(numero, detrasDigitos));
        System.out.println("Al quitarle por delante se queda: "+quitaPorDelante(numero, delanteDigitos));
    }
}
