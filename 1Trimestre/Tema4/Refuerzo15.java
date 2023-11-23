import java.util.Scanner;

import Biblioteca.Biblioteca;

public class Refuerzo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i < 1000; i++) {
            if (Biblioteca.esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}
