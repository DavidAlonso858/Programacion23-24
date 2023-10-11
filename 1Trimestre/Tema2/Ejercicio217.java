import java.util.Scanner;

public class Ejercicio217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum, ale1, ale2;

        ale1 =(int) Math.random()* (99-1+1)+1;
        ale2 =(int) Math.random()* (99-1+1)+1;

        System.out.println(ale1+ ","+ale2);
    }
}
