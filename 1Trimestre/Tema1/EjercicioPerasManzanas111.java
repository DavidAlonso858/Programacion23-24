/*Clacular las ganancias de las ventas de Peras 
y Manzanas en los dos semestres por kilos */

import java.util.Scanner;

public class EjercicioPerasManzanas111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioMan = 2.35, precioPera = 1.95, ventManz1, ventManz2, ventPera1, ventPera2, total;

        System.out.println("Introduce la cantidad en kilos de manzanas vendidas en el primer semestre: ");
        ventManz1 = sc.nextDouble();

        System.out.println("Introduce la cantidad en kilos de manzanas vendidas en el segundo semestre: ");
        ventManz2 = sc.nextDouble();

        System.out.println("Introduce la cantidad en kilos de peras vendidas en el primer semestre: ");
        ventPera1 = sc.nextDouble();

        System.out.println("Introduce la cantidad en kilos de peras vendidas en el  segundo semestre: ");
        ventPera2 = sc.nextDouble();

        total = (ventManz1 + ventManz2) * precioMan;
        total += (ventPera1 + ventPera2) * precioPera;

        System.out.println("El beneficio es de : " + total + " euros");

    }
}
