public class Prueba {
    public static void main(String[] args) {
        char caracterPrueba = 'C';
        for (int prin = 0x0000; prin <= 0xFFFF; prin++) {
             String xxxx = Integer.toHexString(prin);
             System.out.println("\\u" + xxxx + ": " + (char) prin);
        }

        System.out.println(Character.isUpperCase(caracterPrueba)); // api que dice condiciones del caracter
    }
}
