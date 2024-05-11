public class App {
    public static void main(String[] args) {
        Sorteo<Integer> s = new Sorteo<>();

        for (int i = 0; i < 25; i++) {
            s.add(i);
        }

        System.out.println(s);
        System.out.println("Premiados: " + s.premiados(4));
    }
}
