/*Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que in-
fluirán en esta decisión: si está lloviendo y si hemos terminado nuestras tareas. Solo po-
dremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. Existe una
opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de que
tengamos que ir a la biblioteca (para realizar algún trabajo, entregar un libro, etc.). Solici-
tar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir
a la biblioteca. El algoritmo debe mostrar mediante un booleano (true 0 false) si es po-
sible que se le otorgue permiso para ir a la calle.*/
import java.util.Scanner;

public class EjercicioBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean lluvia, finalTarea, irBiblio, calle;
        
        System.out.println("Esta lloviendo?: ");
        lluvia= sc.nextBoolean();
        
        System.out.println("He acabado las tareas?: ");
        finalTarea =sc.nextBoolean();
        
        System.out.println("Voy a ir a la biblioteca?: ");
        irBiblio = sc.nextBoolean();

        calle = !lluvia && finalTarea || irBiblio;

        System.out.println("Se puede ir a la calle: " +calle);

    }
}
