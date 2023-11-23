import java.util.Scanner;

import Biblioteca.Biblioteca;

public class Refuerzo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 9999; i++) {
            if (Biblioteca.esCapicua(i)) {
                System.out.println(i);
            }
        }

    }
}
