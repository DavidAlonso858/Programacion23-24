public class App {
    public static void main(String[] args) {
        int a, b, res;

        a = 5;
        b = 0;

        try {
            System.out.println(dividir(a, b));
        } catch (ArithmeticException ex) {
            System.out.println("Error division por 0"); // ex.getMessage para que salga el mensaje de error
        } catch (Exception ex) { // al ser generico y englobar varios errores se pone al final
            System.out.println(ex);
        } finally { // se ejecuta si o si
            System.out.println("DIVISION");
        }

        System.out.println("FIN DEL PROGRAMA");
    }

    public static int dividir(int a, int b) throws ArithmeticException { // pongo throws para tratarlo luego en el try
        return a / b;
    }
}
