import java.util.Scanner;

public class Ejerccicio214R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, limiteMes=0;

        System.out.println("Introduzca el dia: ");
        dia = sc.nextInt();

        System.out.println("Introduzca el mes: ");
        mes = sc.nextInt();

        System.out.println("Introduzca el año: ");
        año = sc.nextInt();

        if (dia <= 31 && mes < 13 && año != 0 && dia <= 0 && mes <= 0) {
            dia++;
            switch (mes) {
                case 2 -> limiteMes = 28;
                case 4, 6, 9, 11 -> limiteMes = 30;
                default -> limiteMes = 31;
            }

        } else if (dia>limiteMes){
            dia=1;
            mes++;
            
        }else if (mes>12){
            año++;
        }
        System.out.println("La fecha el dia siguiente es: "+dia+"/"+mes+"/"+año);
    }
}
