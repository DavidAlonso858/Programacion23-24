import java.util.Scanner;

/*
 * Realiza una conversion de mb a kb
 */
public class Refuerzo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mb, kb;

        System.out.println("Introduzca los megabytes: ");
        mb = sc.nextInt();

        kb = mb * 1024;

        System.out.println(mb+" Mb son " +kb+ " Kb");
    }
}
