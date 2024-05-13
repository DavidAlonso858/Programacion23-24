package refuerzo26listadelistas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static List<List<String>> repartoAlumnos(List<String> listaAlumnos, int numGrupos) {
        Collections.shuffle(listaAlumnos); // orden aleatorio

        System.out.println("Lista con orden aleatorio: " + listaAlumnos);

        List<List<String>> reparto = new LinkedList<>();
        while (reparto.size() < numGrupos) { // una lista por cada grupo
            reparto.add(new LinkedList<>());
        }

        int indice = 0;
        for (String list : listaAlumnos) {
            reparto.get(indice).add(list); // un nombre en cada lista del curso
            indice++;
            System.out.println(indice);
            if (indice == reparto.size()) {
                indice = 0;
            }
        }
        
        return reparto;
    }

    public static void main(String[] args) {
        int numGrupos;

        System.out.print("\nCuantos grupos hay en el curso?:  ");
        numGrupos = sc.nextInt();

        // paso como una lista Arrays.asList para no poner tanto add
        List<String> listaAlumnos = new LinkedList<>(
                Arrays.asList("Juan", "Paco", "Carmen", "Miguel", "Joseju", "Lucia", "Ana", "David"));

        System.out.println("Lista original: " + listaAlumnos);

        System.out.println("Grupos de alumnos: " + repartoAlumnos(listaAlumnos, numGrupos));
    }
}
