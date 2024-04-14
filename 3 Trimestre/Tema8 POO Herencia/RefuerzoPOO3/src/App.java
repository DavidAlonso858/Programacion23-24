public class App {
    public static void main(String[] args) {
        Animal a1 = new Animal("Tommy", 12);
        Mamifero m1 = new Mamifero("Joselu", 10);
        Ave av1 = new Ave("Paola", 20);
        Canario c1 = new Canario("David", 22);
        Pinguino p1 = new Pinguino("Mike", 5);
        Gato g1 = new Gato("Oreo", 7);
        Perro pe1 = new Perro("Toby", 12);
        Lagarto l1 = new Lagarto("Juan", 1);

        pe1.feliz();
        g1.feliz();

    }
}
