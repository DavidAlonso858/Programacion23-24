package pruebadaw;

import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static Integer menu() {
        Integer opcion;
        do {
            System.out.println("\n----MENU----");
            System.out.println("1. Introducir policia en la comisaria");
            System.out.println("2. Eliminar policia de la comisaria");
            System.out.println("3. Introducir una multa de un policia de la comisaria");
            System.out.println("4. Indicar el total de multas");
            System.out.println("5. Mostrar informacion (sin multas) de todos los policias de la comisaria ordenados por nombre");
            System.out.println("6. Mostrar Informacion (con multas) de todos los policias de la comisaria ordenados por codigo");
            System.out.println("7. Actualizar el sueldo de un policia de transito");
            System.out.println("0. Salir");

            System.out.print("Introduzca la opcion deseada: ");
            opcion = sc.nextInt();
            sc.nextLine();

        } while (opcion < 0 | opcion > 7);
        return opcion;
    }

    public static void introducir(ComisariaPolicia comisariaPoli) {
        String nombre;
        Integer opcion;

        do {
            System.out.println("\n----Equipo Policial----");
            System.out.println("1. Introducir JefePolicia");
            System.out.println("2. Introducir PoliciaTransito");
            System.out.println("0. No introducir nada");

            System.out.print("Introduzca la opcion del policia a insertar: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduzca el nombre: ");
                    nombre = sc.nextLine();

                    JefePolicia jP = new JefePolicia(nombre);
                    System.out.println(comisariaPoli.insertarPolicia(jP));
                }
                case 2 -> {
                    System.out.print("Introduzca el nombre: ");
                    nombre = sc.nextLine();

                    PoliciaTransito pT = new PoliciaTransito(nombre);
                    System.out.println(comisariaPoli.insertarPolicia(pT));
                }
                case 0 -> {
                    System.out.println("Tenga un buen dia!");
                }

            }
        } while (opcion != 0);

    }

    public static void main(String[] args) {
        Integer opcion;
        ComisariaPolicia comisariaPoli = new ComisariaPolicia();

        do {
            opcion = menu();

            switch (opcion) {
                case 1 -> {
                    introducir(comisariaPoli);
                }
                case 2 -> {
                    String codigo;
                    System.out.print("Introduzca codigo del policia: ");
                    codigo = sc.nextLine();

                    for (Policia p : comisariaPoli.listaPolicia) {
                        if (p.getCodigo().equals(codigo)) {
                            boolean eliminado = comisariaPoli.eliminarPolicia(p);
                            System.out.println(eliminado);
                            if (eliminado && p instanceof PoliciaTransito) {
                                Multa.eliminarTodaMultas(codigo);
                            }
                        }
                    }
                }
                case 3 -> {
                    String codigo;
                    Double importe;
                    System.out.print("Introduzca codigo del policia: ");
                    codigo = sc.nextLine();

                    System.out.print("Importe de la multa (positivo): ");
                    importe = sc.nextDouble();

                    System.out.println(comisariaPoli.insertarMultaPolicia(codigo, new Multa(importe)));
                }
                case 4 -> {
                    System.out.println("El total de multas: " + Multa.numeroMultasTotal());
                }
                case 5 -> {
                    System.out.println(comisariaPoli.toStringPoliciasOrdenadoPorNombre());
                }
                case 6 -> {
                    System.out.println(comisariaPoli.toStringPoliciasYMultasOrdenadoPorCodigo());    
                }
                case 7 -> {
                    String codigo;
                    System.out.print("Introduzca codigo del policia: ");
                    codigo = sc.nextLine();

                    Policia p = comisariaPoli.encontrarPorCodigo(codigo);

                    if (p instanceof PoliciaTransito) {
                        ((PoliciaTransito) p).actualizarSueldo();
                    } else {
                        System.out.println("No es de un policia de transito");
                    }

                }
                case 0 -> {
                    System.out.println("Tenga un buen dia!");
                }

            }
        } while (true);
    }
}
