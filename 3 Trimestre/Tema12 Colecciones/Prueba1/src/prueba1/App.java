package prueba1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    
    static Scanner sc = new Scanner(System.in);
    
    public static Integer menu() {
        Integer opcion;
        
        do {
            System.out.println("\n----MENU----");
            System.out.println("0. Salir del programa");
            System.out.println("1. Mostrar ejercitos");
            System.out.println("2. Atacar al ejercito 1");
            System.out.println("3. Atacar al ejercito 2");
            System.out.print("Introduzca la opcion deseada: ");
            opcion = sc.nextInt();
            
            sc.nextLine();
        } while (opcion < 0 || opcion > 3);
        
        return opcion;
    }
    
    public static void main(String[] args) {
        Integer opcion;
        Ejercito ej1 = null; // inciarlizarla a null por el try
        Ejercito ej2 = null; // inciarlizarla a null por el try

        if (Files.exists(Paths.get("ejercito.dat"))) {
            try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("ejercito.dat"))) {
                ej1 = (Ejercito) in.readObject(); // se castea el tipo para leer
                ej2 = (Ejercito) in.readObject(); // se castea el tipo para leer

            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            ej1 = new Ejercito();
            ej2 = new Ejercito();
        }
        
        do {
            opcion = menu();
            switch (opcion) {
                case 0 -> {
                    System.out.println("Espero que haya ido todo bien!");
                }
                case 1 -> {
                    System.out.println("Ejercito 1: " + ej1);
                    System.out.println("\nEjercito 2: " + ej2);
                }
                case 2 -> {
                    ej2.atacar(ej1);
                    System.out.println(ej1);
                }
                case 3 -> {
                    ej1.atacar(ej2);
                    System.out.println(ej2);
                }
            }
        } while (opcion != 0 && ej1.ejercitoVivo(ej1) && ej1.ejercitoVivo(ej2));
        
        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ejercito.dat"))) {
            out.writeObject(ej1);
            out.writeObject(ej2);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
