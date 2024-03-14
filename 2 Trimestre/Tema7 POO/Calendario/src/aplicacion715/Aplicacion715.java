package aplicacion715;

public class Aplicacion715 {
    
    public static void main(String[] args) {
        Calendario calendar  = new Calendario(2003, 1, 30);
        Calendario otro = new Calendario(2003, 4, 3);
        
        System.out.println(calendar.mostrar());
        System.out.println("Incrementar Dia: ");
        calendar.incrementarDia();
        System.out.println(calendar.mostrar());
        System.out.println("Incrementar Mes: ");
        calendar.incrementarMes();
        System.out.println(calendar.mostrar());
        System.out.println("Incrementar Ano: ");
        calendar.incrementarAno(1);
        System.out.println(calendar.mostrar());
        System.out.println("Son iguales?: ");
        System.out.println(calendar.iguales(otro));
    }
}
