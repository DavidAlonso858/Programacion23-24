public class App {
    public static void main(String[] args) {
        Notas[] tema = { Notas.DO, Notas.RE, Notas.MI, Notas.FA, Notas.SOL, Notas.LA, Notas.SI };
        Campana c1 = new Campana();

        for (Notas nota : tema) {
            c1.añadirNota(nota);
        }
        c1.interpretar();
    }
}
