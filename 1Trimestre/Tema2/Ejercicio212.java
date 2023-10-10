import java.util.Scanner;

public class Ejercicio212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes = 0, año;
        boolean fecha = false;

        System.out.println("Introduce el dia: ");
        dia = sc.nextInt();

        System.out.println("Introduce el mes: ");
        mes = sc.nextInt();

        System.out.println("Introduce el año: ");
        año = sc.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia >= 1 && dia <= 31 && año != 0) {
                    fecha = true;
                }
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                if (dia >= 1 && dia <= 30 && año != 0) {
                    fecha = true;
                }
                break;
            case 2: // Febrero
                if (dia >= 1 && dia <= 28 && año != 0) {
                    fecha = true;
                }
                break;
        }

        if (fecha) {
            System.out.println("La fecha ingresada es correcta. " + dia + "/" + mes + "/" + año);
        } else {
            System.out.println("La fecha ingresada es incorrecta.");
        }
    }
}