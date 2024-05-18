package pruebadam;

import java.util.Iterator;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static Integer menu() {
        Integer opcion;

        do {
            System.out.println("\n----MENU----");
            System.out.println("1. Introducir alumnado");
            System.out.println("2. Eliminar alumnado");
            System.out.println("3. Introducir nota de un alumnado");
            System.out.println("4. Mostrar informacion (sin notas de todos los alumnos del grupo");
            System.out.println("5. Mostrar todas las notas de un alumno");
            System.out.println("6. Mostrar el nombre de todos los alumnos NEAE con alguna nota");
            System.out.println("0. Salir");

            System.out.print("Introduzca la opcion deseada: ");
            opcion = sc.nextInt();

            sc.nextLine();
        } while (opcion < 0 || opcion > 6);

        return opcion;
    }

    public static void introducirAlumno(GrupoAlumnado g1) {
        Integer opcion;
        String nombre;
        Double coeficiente;

        do {
            System.out.println("----Tipo de Alumno----");
            System.out.println("1. Introducir Alumno");
            System.out.println("2. Introducir Alumno NEAE");
            System.out.println("3. No introducir mas");

            System.out.print("Introduzca el tipo: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduzca el nombre del alumno: ");
                    nombre = sc.nextLine();

                    Alumnado a1 = new Alumnado(nombre);

                    System.out.println(g1.inscribirAlumno(a1));
                }
                case 2 -> {
                    System.out.print("Introduzca el nombre del alumno: ");
                    nombre = sc.nextLine();

                    System.out.print("Introduzca el coeficiente de calificacion (1.0-2.0): ");
                    coeficiente = sc.nextDouble();

                    AlumnadoNEAE a1N = new AlumnadoNEAE(nombre, coeficiente);

                    System.out.println(g1.inscribirAlumno(a1N));
                }
                case 3 -> {
                    System.out.println("Tenga buen dia!");
                }
            }

        } while (opcion != 3);
    }

    public static boolean eliminar(GrupoAlumnado g1, NotaAlumnado n1, Integer nie) {

        Alumnado a1 = g1.encontrarPorNie(nie);
        if (a1 == null) {
            System.out.println("No existe ese nie en el grupo");
            return false;
        } else {
            n1.eliminarTodasNotasAlumnado(nie);
            return g1.eliminarAlumnado(a1);
        }

    }

    public static void main(String[] args) {
        Integer opcion;
        GrupoAlumnado g1 = new GrupoAlumnado();
        NotaAlumnado n1 = null;
        do {
            opcion = menu();
            switch (opcion) {
                case 1 -> {
                    introducirAlumno(g1);
                }
                case 2 -> {
                    int nie;
                    System.out.print("Introduzca el NIE del alumno a eliminar: ");
                    nie = sc.nextInt();
                    System.out.println(eliminar(g1, new NotaAlumnado(), nie));
                }
                case 3 -> {
                    int nie;
                    String fecha;
                    double valor;

                    System.out.print("Introduzca el NIE del alumno: ");
                    nie = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Introduzca la fecha (dd/MM/yyyy): ");
                    fecha = sc.nextLine();

                    System.out.print("Introduzca el valor de la nota: ");
                    valor = sc.nextDouble();

                    Alumnado a1 = g1.encontrarPorNie(nie);
                    if (a1 != null) {
                        n1 = new NotaAlumnado(fecha, valor);

                        if (a1 instanceof AlumnadoNEAE) {
                            AlumnadoNEAE a1N = (AlumnadoNEAE) a1;

                            n1.setValorGuardar(a1N.calculoNota(n1.getValorGuardar()));
                        }
                    }

                    n1.introducirNota(nie, n1);
                }
                case 4 -> {
                    System.out.println(g1);
                }
                case 5 -> {
                    int nie;
                    System.out.print("Introduzca el NIE del alumno: ");
                    nie = sc.nextInt();

                    Alumnado a1 = g1.encontrarPorNie(nie);

                    if (a1 != null) {

                        Iterator<NotaAlumnado> it = n1.notasAlumnado(nie);
                        while (it.hasNext()) {
                            NotaAlumnado nota = it.next();
                            System.out.println(nota.getValorGuardar());
                        }
                    } else {
                        System.out.println("No esta ese alumno en el grupo");
                    }
                }
                case 6 -> {
                    for (Alumnado al : g1.listaAlumnado) {
                        if (al instanceof AlumnadoNEAE && n1.getMapaNotas().get(al.getNIE()) != null) {
                            System.out.println(al.getNombre());
                        }
                    }
                }
            }

        } while (opcion != 0);

    }
}
