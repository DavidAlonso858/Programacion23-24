public class App {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(20, 10);
        Rectangulo r1 = new Rectangulo(20, 10);

        System.out.println("El are del triangulo es: " + t1.area());
        System.out.println("El area del rectangulo es: " + r1.area());
    }
}
