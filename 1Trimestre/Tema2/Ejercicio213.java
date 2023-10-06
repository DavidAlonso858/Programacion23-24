import java.util.Scanner;

public class Ejercicio213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAnimales;
        double comidaDiaria, kilosPorAnimal, cantidad;

        System.out.println("Introduce el numero de animales: ");
        numAnimales = sc.nextInt();

        System.out.println("Introduce el numero de kilos de comida diaria: ");
        comidaDiaria = sc.nextInt();

        System.out.println("Introduce el numero de kilos por animal: ");
        kilosPorAnimal = sc.nextInt();

        if (numAnimales == 0) {
            System.out.println("No hay animales que coman");
        } else if (comidaDiaria >= (kilosPorAnimal * numAnimales)) {
            System.out.println("Hay alimento suficiente para todos");
        } else {
            cantidad = comidaDiaria / numAnimales;
            System.out.println("Cada animal va a recibir: " + cantidad + " kg ");
        }
    }
}
