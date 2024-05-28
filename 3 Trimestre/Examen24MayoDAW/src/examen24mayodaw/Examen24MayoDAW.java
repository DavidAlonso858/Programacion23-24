package examen24mayodaw;

import java.util.Iterator;
import java.util.Set;

public class Examen24MayoDAW {

    public static int menu() {

        int opcion = 0;

        do {
            System.out.println("\n-- MENU --");
            System.out.println("1. Introducir alumnado");
            System.out.println("2. Eliminar alumnado");
            System.out.println("3. Introducir nota de alumno/a");
            System.out.println("4. Mostrar información (sin notas) de todos los alumnos del grupo");
            System.out.println("5. Mostrar todas las notas de un alumno");
            System.out.println("6. Mostrar el nombre de todos los alumnos NEAE");
            System.out.println("0. Salir");
            opcion = EntradaTeclado.pedirEntero("Introduzca una opcion: ");
        } while ((opcion < 0) || (opcion > 6));

        return opcion;
    }

    public static void introducir(GrupoAlumnado g1) {
        Integer opcion;
        do {
            System.out.println("\n---- PERIODO INTRODUCCION ----");
            System.out.println("1. Introducir Alumno");
            System.out.println("2. Introducir Alumno NEAE");
            System.out.println("0. SALIR");
            opcion = EntradaTeclado.pedirEntero("Introduzca una opcion: ");

            switch (opcion) {
                case 1 -> {
                    String nombre;
                    nombre = EntradaTeclado.pedirCadena("Introduzca el nombre: ");

                    Alumnado a1 = new Alumnado(nombre);
                    System.out.println(g1.inscribirAlumnado(a1));
                }
                case 2 -> {
                    String nombre;
                    double coeficienteCorrecion;
                    nombre = EntradaTeclado.pedirCadena("Introduzca el nombre: ");

                    coeficienteCorrecion = EntradaTeclado.pedirDouble("Introduzca el coeficiente de correcion [1.5-3.0]: ");

                    AlumnadoNEAE aN1 = new AlumnadoNEAE(nombre, coeficienteCorrecion);
                    System.out.println(g1.inscribirAlumnado(aN1));
                }
                case 0 -> {
                    System.out.println("Tenga un buen dia!\n");
                }
            }
        } while (opcion != 0);
    }

    public static boolean eliminar(GrupoAlumnado g1, Integer nie) {
        boolean eliminado = false;
        Alumnado a1 = g1.encontrarPorNie(nie);

        if (a1 != null) {
            eliminado = g1.eliminarAlumnado(a1);
            if (eliminado && a1 instanceof AlumnadoNEAE) {
                NotaAlumnado.eliminarTodasNotasAlumnado(nie);
            }
        } else {
            System.out.println("Ese alumno no esta en el grupo");
        }

        return eliminado;
    }

    public static void introNota(GrupoAlumnado g1, Integer nie, double valor, String fecha) {
        Alumnado a1 = g1.encontrarPorNie(nie);

        if (a1 != null) {
            boolean nota;
            NotaAlumnado n1 = new NotaAlumnado(fecha, valor);
            nota = g1.insertarNotaAlumnado(nie, n1);
            System.out.println(nota);
            if (a1 instanceof AlumnadoNEAE && nota) {
                AlumnadoNEAE aN1 = (AlumnadoNEAE) a1;
                n1.setValorGuardar(aN1.calculoNota(valor));
            }
        } else {
            System.out.println("No existe alumno con ese NIE en el grupo");
        }
    }

    public static void mostrarAlumnosNEAEConNota(GrupoAlumnado g1) {
        Set<Integer> alumnosConNota = NotaAlumnado.codigosAlumnado();

        for (Integer nie : alumnosConNota) {
            if (g1.encontrarPorNie(nie) != null) {
                Alumnado a1 = g1.encontrarPorNie(nie);
                if (a1 instanceof AlumnadoNEAE) {
                    System.out.println(a1.getNombre());
                }
            }
        }
    }

    public static void main(String[] args) {

        int opcion = 0;
        GrupoAlumnado g1 = new GrupoAlumnado();

        do {
            opcion = menu();

            switch (opcion) {
                case 1 -> {
                    introducir(g1);
                }
                case 2 -> {
                    Integer nie;
                    nie = EntradaTeclado.pedirEntero("Introduzca el nie: ");
                    System.out.println(eliminar(g1, nie));
                }
                case 3 -> {
                    Integer nie;
                    double valor;
                    String fecha;
                    nie = EntradaTeclado.pedirEntero("Introduzca el nie: ");
                    valor = EntradaTeclado.pedirDouble("Introduzca la nota: ");
                    fecha = EntradaTeclado.pedirCadena("Introduzca la fecha: ");

                    Alumnado a1 = g1.encontrarPorNie(nie);

                    introNota(g1, nie, valor, fecha);
                }
                case 4 -> {
                    System.out.println(g1);
                }
                case 5 -> {
                    Integer nie;
                    nie = EntradaTeclado.pedirEntero("Introduzca el nie: ");

                    Alumnado a1 = g1.encontrarPorNie(nie);
                    if (a1 != null) {
                        Iterator<NotaAlumnado> it = NotaAlumnado.notasAlumnado(nie);
                        if (it != null) {
                            while (it.hasNext()) {
                                NotaAlumnado n = it.next();
                                System.out.println(n);
                            }
                        } else {
                            System.out.println("No tiene notas");
                        }
                    } else {
                        System.out.println("No esta en el grupo");
                    }
                }
                case 6 -> {
                    mostrarAlumnosNEAEConNota(g1);
                }
                case 0 -> {
                    System.out.println("Espero que haya ido todo bien!");
                }
            }

        } while (opcion != 0);

    }

}
