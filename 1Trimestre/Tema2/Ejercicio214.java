import java.util.Scanner;

public class Ejercicio214 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero del 1-99: ");
        int numeroIntroducido = sc.nextInt();

        int unidad = numeroIntroducido % 10;
        int decena = numeroIntroducido / 10;
        String unidadString = null, decenaString = null, numerosUnicos = null;

        if (numeroIntroducido > 99 || numeroIntroducido < 1) {
            System.out.println("Formato invalido");
        } else {
            switch (numeroIntroducido) {
                case 10 -> numerosUnicos = "diez";
                case 11 -> numerosUnicos = "once";
                case 12 -> numerosUnicos = "doce";
                case 13 -> numerosUnicos = "trece";
                case 14 -> numerosUnicos = "catorce";
                case 15 -> numerosUnicos = "quince";
                case 16 -> numerosUnicos = "dieciseis";
                case 17 -> numerosUnicos = "diecisiete";
                case 18 -> numerosUnicos = "dieciocho";
                case 19 -> numerosUnicos = "diecinueve";
                case 20 -> numerosUnicos = "veinte";
            }
            switch (decena) {
                case 2 -> decenaString = "veinti";
                case 3 -> decenaString = "treinta";
                case 4 -> decenaString = "cuarenta";
                case 5 -> decenaString = "cincuenta";
                case 6 -> decenaString = "secenta";
                case 7 -> decenaString = "setenta";
                case 8 -> decenaString = "ochenta";
                case 9 -> decenaString = "noventa";
            }
            switch (unidad) {
                case 1 -> unidadString = "uno";
                case 2 -> unidadString = "dos";
                case 3 -> unidadString = "tres";
                case 4 -> unidadString = "cuatro";
                case 5 -> unidadString = "cinco";
                case 6 -> unidadString = "seis";
                case 7 -> unidadString = "siete";
                case 8 -> unidadString = "ocho";
                case 9 -> unidadString = "nueve";
            }

            if (numeroIntroducido >= 11 && numeroIntroducido <= 19
                    || numeroIntroducido == 20 || numeroIntroducido == 10) {
                System.out.println(numerosUnicos);

            } else if (numeroIntroducido >= 21 && numeroIntroducido <= 29) {
                System.out.println(decenaString + unidadString);
            } else if (unidadString == null) {
                System.out.println(decenaString);
            } else if (decenaString == null) {
                System.out.println(unidadString);
            } else {
                System.out.println(decenaString + " y " + unidadString);
            }
        }
    }
}