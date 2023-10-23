package examentercero;

import java.util.Scanner;

public class ExamenTercero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaF, notaP, trabajo;
        int nota;
        String calificacion;

        System.out.print("Introduce la nota del examen final: ");
        notaF = sc.nextDouble();

        System.out.print("Introduce la nota media de los parciales: ");
        notaP = sc.nextDouble();

        System.out.print("Introduce la nota media del trabajo diario: ");
        trabajo = sc.nextDouble();

        nota = (int) (notaF * 0.60 + notaP * 0.30 + trabajo * 0.10);

        switch (nota) {
            case 0, 1, 2, 3, 4:
                calificacion = "Insuficiente";
                System.out.println("La calificacion del alumno es: " + calificacion);
                break;
            case 5:
                calificacion = "Suficiente";
                System.out.println("La calificacion del alumno es: " + calificacion);
                break;
            case 6:
                calificacion = "Bien";
                System.out.println("La calificacion del alumno es: " + calificacion);
                break;
            case 7, 8:
                calificacion = "Notable";
                System.out.println("La calificacion del alumno es: " + calificacion);
                break;
            case 9, 10:
                calificacion = "Sobresaliente";
                System.out.println("La calificacion del alumno es: " + calificacion);
                break;
            default:
                System.out.println("La nota no entra en el rango permitido para evaluarte");
        }

    }

}
