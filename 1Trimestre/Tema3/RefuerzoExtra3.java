import java.util.Scanner;

public class RefuerzoExtra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de la pirámide (entre 1 y 10): ");
        int altura = sc.nextInt();

        // Verificar que la altura está dentro del rango permitido
        if (altura < 1 || altura > 10) {
            System.out.println("La altura debe estar entre 1 y 10.");
      
    }
}
