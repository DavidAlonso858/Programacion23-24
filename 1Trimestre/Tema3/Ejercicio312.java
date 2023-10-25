import java.util.Scanner;

public class Ejercicio312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota, suspensos=0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Intorduzca la nota: ");
            nota=sc.nextInt();
            if(nota<=4){
                suspensos+=nota;
            }
        }
        System.out.println("El numero de suspensos es: "+suspensos);
    }
}
