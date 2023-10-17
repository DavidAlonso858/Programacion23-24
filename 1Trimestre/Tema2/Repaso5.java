import java.util.Scanner;

public class Repaso5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, a, b;

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b=0. Por favor, introduzca el valor de a: ");
        a=sc.nextDouble();

        System.out.println("Ahora introduzca el valor de b: ");
        b=sc.nextDouble();

        if(a!=0 && b!=0){
            x=-b/a;
            System.out.println("x = "+x);
        }else{
            System.out.println("Esta ecuacion no tiene solucion real");
        }

    }
}
