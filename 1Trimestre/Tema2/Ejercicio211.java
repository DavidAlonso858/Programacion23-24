import java.util.Scanner;

public class Ejercicio211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerin;

        System.out.println("Introduzca un numero del 1 al 7: ");
        numerin=sc.nextInt();

        switch (numerin) {
            case 1->System.out.println("Vaya es Lunes");
            case 2->System.out.println("Vaya es martes");
            case 3->System.out.println("Vaya es Miercoles");
            case 4->System.out.println("Vaya es Jueves");
            case 5->System.out.println("Al fin Viernes");
            case 6->System.out.println("Sabado");
            case 7->System.out.println("Domingo");
            default->System.out.println("Te has equivocado al introducir el dia");
        }


    }
}
