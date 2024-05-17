package ejercicio122parametrizado;

import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        for (int i = 0; i < 5; i++) {
            c.insertarAlFinal(i);
        }

        for (int i = 5; i < 10; i++) {
            c.insertarAlPrincipio(i);
        }
        System.out.println("Sin ordenar: " + c);

        c.ordenar();
        System.out.println("Ordenado: " + c);

        Integer n = c.extraerDelFinal();
        Integer n2 = c.extraerDelPrincipio();

        System.out.println(n);
        System.out.println(n2);

        System.out.println("Despuede de la extracion: " + c);

        System.out.println("Introduzca numeros positivos (-1 para salir)");
        Integer cola = sc.nextInt();

        while (cola >= 0) {
            c.encolar(cola);
        }

        do {
            System.out.println(c.desencolar());
        } while (c.desencolar() != null);
    }
}
