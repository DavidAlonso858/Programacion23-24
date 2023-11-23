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
        return numero / (int) Math.pow(10, detrasDigitos);
    }

    public static int quitaPorDelante(int numero, int delanteDigitos) {
        int digitos = digitos(numero);
        return numero % (int) Math.pow(10, digitos - delanteDigitos);
    }

    public static int pegaPorDetras(int numero, int añadeDetrasDigito) {

        return numero = (numero * 10) + añadeDetrasDigito;
    }

    public static int pegaPorDelante(int numero, int añadeDelanteDigito) {

        int longitudNum = digitos(numero);
        return numero += (añadeDelanteDigito * potencia(10, longitudNum));
    }

    public static int trozoDeNumero(int numero) {
        int posicionFinal = digitos(numero);
        int posicionInicial = 1;
        int posiconAplicada = posicionFinal - 2;

        int numeroSinDelante = quitaPorDelante(numero, posicionInicial);
        return quitaPorDetras(numeroSinDelante, posiconAplicada);
    }

    public static int juntaNumeros(int numero, int numero2) {

        return (numero * (int) (potencia(10, digitos(numero2)))) + numero2;
    }

    public static void main(String[] args) {
        int numero = 179, base = 2, exponente = 3, posicion = 0, digito = 5,
                detrasDigitos = 1, delanteDigitos = 1, añadeDetrasDigito = 8,
                añadeDelanteDigito = 8, numero2 = 77;

        System.out.println("Es primo: " + esPrimo(numero));
        System.out.println("Es capicua: " + esCapicua(numero));
        System.out.println("El siguiente primo es:" + siguientePrimo(numero));
        System.out.println(potencia(base, exponente));
        System.out.println("El numero de digitos es: " + digitos(numero));
        System.out.println("Volteado es: " + voltea(numero));
        System.out.println(digitoN(numero, posicion));
        System.out.println(posicionDigito(numero, digito));
        System.out.println("Al quitarle por detras se queda: " + quitaPorDetras(numero, detrasDigitos));
        System.out.println("Al quitarle por delante se queda: " + quitaPorDelante(numero, delanteDigitos));
        System.out.println("Se añade digito por detras: " + pegaPorDetras(numero, añadeDetrasDigito));
        System.out.println("Se añade digito por delante: " + pegaPorDelante(numero, añadeDelanteDigito));
        System.out.println("Al juntar los dos numeros sale: " + juntaNumeros(numero, numero2));
        System.out.println("El trozo del numero es: " + trozoDeNumero(numero));
    }
}
