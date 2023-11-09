import java.util.Scanner;

public class Refuerzo35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFilas;

        System.out.print("Intruduzca la altura impar y mayor o igual que 3: ");
        numFilas=sc.nextInt();
        
        if (numFilas<3 || numFilas%2==0) {
            System.out.println("Error al introducir la altura");
        }else{
            for (int altura = 0; altura < numFilas; altura++) {
                for (int pintar = 0; pintar < numFilas; pintar++) {
                    if (pintar == altura || pintar == (numFilas - 1 - altura)) {//diagonales
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

    }
    }
}
