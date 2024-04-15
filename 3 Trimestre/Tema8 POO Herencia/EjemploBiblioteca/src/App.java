public class App {
    public static void main(String[] args) {
        Publicacion p1 = new Publicacion("h", "h2", 2012, "jahdja");
        Libro l1 = new Libro("h", "h2", 2012, "jahdja", 2000, 10);
        Revista r1 = new Revista("h", "h2", 2012, "jahdja", 5, "Terror");

        System.out.println(p1);
        System.out.println(l1);
        System.out.println(r1);

        l1.presta();
    }
    
}
