package exament4;

import java.util.Scanner;

public class ExamenT4 {

    private static Scanner teclado;

    static {
        teclado = new Scanner(System.in);
    }

    public static void main(String[] args) {

        long numero, anteriorPerfecto;
        int opcion = 0;

        System.out.print("Introduzca el numero con el que quieres trabajar: ");
        numero = teclado.nextLong();

        do {
            System.out.println("\nNumero: " + numero);
            opcion = menu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("La suma de las posiciones impares es "
                            + sumaPosiciones(numero, 1));
                }

                case 2 -> {
                    System.out.println("La suma de las posiciones pares es "
                            + sumaPosiciones(numero, 2));
                }

                case 3 -> {
                    System.out.println("El crapulo del numero es " + crapulo(numero));
                }

                case 4 -> {
                    anteriorPerfecto = encontrarNumeroAnteriorPerfecto(numero);
                    if (anteriorPerfecto == -1) {
                        System.out.println("El numero no tiene ningún número anterior perfecto en los positivos");
                    } else {
                        System.out.println("El número anterior perfecto es: " + anteriorPerfecto);
                    }
                }
                case 5 -> {
                    System.out.print("Introduzca el nuevo numero con el que quieres trabajar: ");
                    numero = teclado.nextLong();
                }
            }
        } while (opcion != 0);
    }

    public static int menu() {
        int opcion;

        do {
            System.out.println("-- MENU --");
            System.out.println("1. Suma de las posiciones impares");
            System.out.println("2. Suma de las posiciones pares");
            System.out.println("3. Calcula el crapulo de ese numero");
            System.out.println("4. Calcula el anterior numero perfecto (Tarda mucho si es más de 6 cifras)");
            System.out.println("5. Cambiar el numero");
            System.out.println("0. Salir");
            System.out.print("Introduzca una opcion: ");
            opcion = teclado.nextInt();
        } while (opcion < 0 || opcion > 5);

        return opcion;
    }

    public static long longitud(long numero) {
        long longitud = 1;
        long aux = numero;

        while (aux > 9) {
            aux /= 10;
            longitud++;
        }
        return longitud;
    }

    public static long sumaPosiciones(long numero, int posicionInicial) {
        long longitud = longitud(numero);
        long cifra, resultado = 0;
        int posicionTrabajada = posicionInicial;

        while (posicionTrabajada < longitud) {
            posicionTrabajada += 2;
        }
        for (; longitud >= posicionInicial; longitud--) {
            cifra = numero % 10;
            if (longitud == posicionInicial || longitud == posicionTrabajada) {
                resultado += cifra;
            }
            numero /= 10;
            posicionTrabajada -= 2;
        }
        return resultado;
    }

    public static long crapulo(long numero) {
        long cifra, cifraSuma = 0;

        while (numero > 0) {
            cifra = numero % 10;
            cifraSuma += cifra;
            numero /= 10;
            if (numero == 0 && cifraSuma >= 10) {
                numero = cifraSuma;
                cifraSuma = 0;
            }
        }

        return cifraSuma;
    }

    public static long encontrarNumeroAnteriorPerfecto(long numero) {
        long sumaDiv = 0, aux;
        long numero2 = numero - 1;
        boolean encontrado = false;

        for (aux = numero2; aux >= 6 && !encontrado; aux--) {
            sumaDiv = 0;
            for (int contador = 1; contador < aux; contador++) {
                if (aux % contador == 0) {
                    sumaDiv += contador;
                }
            }
            if (sumaDiv == aux) {
                encontrado = true;
                return aux;
            }
        }
        return -1;
    }
}
