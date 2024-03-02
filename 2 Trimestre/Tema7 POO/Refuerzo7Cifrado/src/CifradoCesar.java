public class CifradoCesar {

    public static void cadenaCifrada(String cadena, int numletras) {
        char inicio = 'a';
        StringBuilder resultado = new StringBuilder(); // para poder almacenar la cadena cambiada y luego mostrarla

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);

            if (letra != ' ') {
                letra = (char) ((letra - inicio + numletras % 26) + inicio);
            }

            resultado.append(letra); // agrega cada letra cifrada
        }

        System.out.println("Cadena cifrada: " + resultado.toString()); // muestra esa cadena
    }
}
