import java.util.Scanner;

public class Ejercicio312ABinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, digito=0, binario, exp=0;
        

        do {
            System.out.print("Introduce un numero binario: ");
            binario = sc.nextInt();
        } while (binario < 0);

        while (binario>0) {
            numero=binario%10;
            digito+= numero * Math.pow(2, exp);
            exp++;
            binario/=10;
        }
        System.out.println("El decimal es: " + digito);
    }
}
