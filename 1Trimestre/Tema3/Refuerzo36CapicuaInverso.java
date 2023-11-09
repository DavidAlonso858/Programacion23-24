import java.util.Scanner;

public class Refuerzo36CapicuaInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long aux, numero, reverso = 0, digito;
        boolean esCapicua = false;
        do {
            System.out.print("Por favor introduzca un numero entero positivo: ");
            numero = sc.nextLong();
        } while (numero < 0);

        aux = numero;

        while (aux > 0) {
            digito = aux % 10;
            reverso=reverso*10+digito;
            aux /= 10;
        }
        if (numero==reverso) {
            esCapicua=true;
        }
        System.out.println("El numero " + numero + " es capicua " + esCapicua);
    }
}
