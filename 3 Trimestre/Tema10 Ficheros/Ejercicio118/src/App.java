import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String nombre, dni;
        System.out.println("Introduzca el tamño de la tabla: ");
        num = sc.nextInt();
        
        Socio[] tablaSocios = new Socio[num];
        for (int i = 0; i < tablaSocios.length; i++) {
            System.out.println("Introduzca el nombre del socio: ");
            nombre=sc.nextLine();
            
            System.out.println("Introduzca el dni: ");
            dni=sc.nextLine();

            tablaSocios[i] = new Socio(dni, nombre);
        }

        try (){
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
