import java.util.Scanner;

/*
 * Realiza una conversion de kb a mb
 * */
public class Refuerzo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mb, kb;

        System.out.println("Introduzca los megabytes: ");
        kb = sc.nextInt();

        mb = kb / 1024;

        System.out.println(kb +" Kb son " +mb+ " Mb");
    }
}
