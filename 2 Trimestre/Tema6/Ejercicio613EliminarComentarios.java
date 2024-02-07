import java.util.Scanner;

public class Ejercicio613EliminarComentarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fraseComentada;

        System.out.print("Comentario: ");
        fraseComentada = sc.nextLine();

        String inicio = "/*";
        String fin = "*/";
        String resultado = eliminarParte(fraseComentada, inicio, fin);
        System.out.print(resultado);
    }

    public static String eliminarParte(String cadena, String inicio, String fin) {
        int indiceInicio = cadena.indexOf(inicio);
        int indiceFin = cadena.indexOf(fin, indiceInicio);

        if (indiceInicio != -1 && indiceFin != -1) {
            String primeraParte = cadena.substring(0, indiceInicio);
            String segundaParte = cadena.substring(indiceFin + 2);
            String juntarPartes = primeraParte + segundaParte;

            int inicio2 = juntarPartes.indexOf(inicio);
            int fin2 = juntarPartes.indexOf(fin, inicio2);
            if (inicio2 != -1 && fin2 != -1) {
                String parte1 = juntarPartes.substring(0, inicio2);
                String parte2 = juntarPartes.substring(fin2 + 2);
                return parte1 + parte2;
            } else {
                return juntarPartes;
            }

        } else {
            return cadena; // Si no se encuentra nada
        }
    }
}