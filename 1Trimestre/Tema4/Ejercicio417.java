import java.util.Scanner;

public class Ejercicio417 {

    public static boolean numAmigos(int numero1, int numero2) {
        boolean amigo = false;
        int sumCont1 = 0, sumCont2 = 0;

        for (int contador = 1; contador < numero1; contador++) {
            if (numero1 % contador == 0) {
                sumCont1 += contador;
            }
        }
        System.out.println(sumCont1);

        for (int contador2 = 1; contador2 < numero2; contador2++) {
            if (numero2 % contador2 == 0) {
                sumCont2 += contador2;
            }
        }
        System.out.println(sumCont2);

        if (sumCont1 == numero2 && sumCont2 == numero1) {
            amigo = true;
        }

        return amigo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = 220, numero2 = 284;
        
        System.out.println("Son amigos esos numeros: " + numAmigos(numero1, numero2));
    }
}
