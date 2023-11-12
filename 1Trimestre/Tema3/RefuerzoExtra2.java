import java.util.Scanner;

public class RefuerzoExtra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIntro;
        boolean salir = false;

        while (!salir) {

            int numInver = 0, suma = 0;
            String salida = "";
            char salirChar;

            do {

                System.out.print("Introduzca un numero: ");
                numIntro = sc.nextInt();

            } while (numIntro < 0);

            while (numIntro > 0) {

                int digito = numIntro % 10;
                numInver = (numInver * 10) + digito;
                numIntro /= 10;

            }
            while (numInver > 0) {

                int digito = numInver % 10;
                numInver /= 10;
                suma += digito;

                if (numInver == 0) {

                    salida += digito + " = ";
                } else {

                    salida += digito + " + ";
                }
            }

            salida += suma;
            System.out.println(salida);

            System.out.print("Introduzca (s) para salir: ");
            sc.nextLine();
            salirChar = sc.nextLine().charAt(0);

            switch (salirChar) {

                case 's' -> salir = true;
                default -> salir = false;
            }
        }

    }

}
