public class Campana extends Instrumento {
    public Campana() {
        super();
    }

    @Override
    public void interpretar() {
        for (Notas notas : melodia) {
            switch (notas) {
                case DO -> System.out.print("DOOOOOOOO ");
                case RE -> System.out.print("REEEEEEEE ");
                case MI -> System.out.print("MIIIIIIII ");
                case FA -> System.out.print("FAAAAAAAA ");
                case SOL -> System.out.print("SOLLLLLL ");
                case LA -> System.out.print("LAAAAAAAA ");
                case SI -> System.out.print("SIIIIIIII ");

            }
        }
        System.out.println("");
    }
}
