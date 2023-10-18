import java.util.Scanner;

public class Repaso24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cargo, diasViaje, estado, sueldoBase = 0, dieta; 
        double sueldoBruto;

        System.out.println("1 - Programador Junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");

        System.out.print("Introduzca el cargo del empleado (1-3): ");
        cargo = sc.nextInt();

        System.out.print("¿Cuantos dias ha estado de viaje visitando clientes? ");
        diasViaje = sc.nextInt();

        System.out.print("Introduzca su estado civil (1 -  Soltero, 2 - Casado): ");
        estado = sc.nextInt();

        dieta = diasViaje * 30;

        switch (cargo) {
            case 1:
                sueldoBase = 950;
                System.out.println("Sueldo base " + sueldoBase);
                break;
            case 2:
                sueldoBase = 1200;
                System.out.println("Sueldo base " + sueldoBase);
                break;
            case 3:
                sueldoBase = 1600;
                System.out.println("Sueldo base " + sueldoBase);
                break;
            default:
                System.out.println("Se ha equivocado usted al introducir el cargo");
                break;
        }
        sueldoBruto = dieta + sueldoBase;
        System.out.println("Dietas " + dieta);

        System.out.println("Sueldo bruto " + sueldoBruto);
        switch (estado) {
            case 1:
                System.out.println("Retencion IRPF (25%) " + sueldoBruto * 0.25);
                System.out.println("Sueldo neto " + (sueldoBruto - sueldoBruto * 0.25 ));
                break;
            case 2:
                System.out.println("Retencion IRPF (20%) " + sueldoBruto * 0.20);
                System.out.println("Sueldo neto " + (sueldoBruto - sueldoBruto * 0.20 ));

                break;
        }
    }
}
