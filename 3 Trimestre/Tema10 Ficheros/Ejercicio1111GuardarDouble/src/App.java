import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;

        System.out.print("\nImportante valor double a introducir: ");
        valor = sc.nextDouble();

        ValorDouble v = new ValorDouble(valor);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("double.dat"))) {
            out.writeObject(v);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("double.dat"))) {
            v = (ValorDouble) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println(v.getValorDouble());
        sc.close();
    }
}