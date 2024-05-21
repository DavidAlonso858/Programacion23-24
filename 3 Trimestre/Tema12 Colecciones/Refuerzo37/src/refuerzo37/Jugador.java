package refuerzo37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Jugador {

    static Scanner sc = new Scanner(System.in);

    private String DNI;
    private String nombre;
    private EnumPosicion posicionCampo;
    private double estatura;
    private Integer dorsal;
    private static Integer contador = 1;
    private Map<Integer, Jugador> mapaJugadores = new TreeMap<>();

    public Jugador(String DNI, String nombre, String posicionCampo, Double estatura) {
        this.dorsal = contador;
        this.DNI = DNI;
        this.nombre = nombre;
        this.posicionCampo = EnumPosicion.valueOf(posicionCampo.toUpperCase()); // pasa a ese tipo
        this.estatura = estatura;
        contador++;
    }

    public static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        String nombre, DNI, posicionCampo;
        Double estatura;

        System.out.print("Introduzca el nombre del jugador: ");
        nombre = sc.nextLine();

        System.out.print("Introduzca el DNI del jugador: ");
        DNI = sc.nextLine();

        System.out.print("Introduzca la posicion (portero, defensa, centrocampista, delantero) : ");
        posicionCampo = sc.nextLine();

        System.out.print("Introduzca la estatura del jugador : ");
        estatura = sc.nextDouble();

        Jugador j1 = new Jugador(DNI, nombre, posicionCampo, estatura);
        plantilla.put(dorsal, j1);
    }

    public static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        Jugador j1;

        j1 = plantilla.remove(dorsal);

        return j1;

    }

    public static void mostrar(Map<Integer, Jugador> plantilla) {
        Collection<Jugador> c = plantilla.values();

        List<Jugador> listaJugadores = new ArrayList<>(c);

        Iterator<Jugador> it = listaJugadores.iterator();

        while (it.hasNext()) {
            Jugador j = it.next();
            System.out.println("Dorsasl-> " + j.dorsal + " y Nombre->" + j.nombre);
        }
    }

    public static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {
        Collection<Jugador> c = plantilla.values();

        List<Jugador> listaJugadores = new ArrayList<>(c);

        Iterator<Jugador> it = listaJugadores.iterator();

        while (it.hasNext()) {
            Jugador j = it.next();
            if (j.posicionCampo.equals(posicion)) {
                System.out.println(j);
            }
        }
    }

    public static Integer menuModificar() {
        Integer opcion;
        do {
            System.out.println("----MODIFICACION JUGADOR");
            System.out.println("1. Cambiar el nombre");
            System.out.println("2. Cambiar la posicion en el campo (PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO");
            System.out.println("3. Cambiar la estatura");
            System.out.println("0. Salir de modificar");
            System.out.print("Introduzca la opcion: ");
            opcion = sc.nextInt();

            sc.nextLine();
        } while (opcion < 0 || opcion > 3);

        return opcion;
    }

    public static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        boolean edicion = false;
        Integer opcion;
        if (plantilla.containsKey(dorsal)) {
            edicion = true;
            Jugador j1 = plantilla.get(dorsal);
            do {
                opcion = menuModificar();
                switch (opcion) {
                    case 1 -> {
                        String nombre;
                        System.out.print("Introduce el nuevo nombre: ");
                        nombre = sc.nextLine();
                        j1.setNombre(nombre);
                    }
                    case 2 -> {
                        String posicionCampo;
                        System.out.print("Introduce la posicion en el campo (PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO: ");
                        posicionCampo = sc.nextLine();
                        j1.setPosicionCampo(posicionCampo);

                    }
                    case 3 -> {
                        Double estatura;
                        System.out.print("Introduce la nueva estatura: ");
                        estatura = sc.nextDouble();
                        j1.setEstatura(estatura);
                    }
                    case 0 -> {
                        System.out.println("Tenga un buen dia!");
                    }

                }
                sc.nextLine();
            } while (opcion != 0);
        }
        return edicion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EnumPosicion getPosicionCampo() {
        return posicionCampo;
    }

    public void setPosicionCampo(String posicionCampo) {
        this.posicionCampo = EnumPosicion.valueOf(posicionCampo.toUpperCase());
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public Map<Integer, Jugador> getMapaJugadores() {
        return mapaJugadores;
    }

    public void setMapaJugadores(Map<Integer, Jugador> mapaJugadores) {
        this.mapaJugadores = mapaJugadores;
    }

    @Override
    public String toString() {
        return "Jugador{ DNI-> " + DNI + ", nombre-> " + nombre + ", posicionCampo-> " + posicionCampo + ", estatura-> " + estatura + ", dorsal-> " + dorsal + '}';
    }

}
