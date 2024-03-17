public class Unidad {
    protected String paquete = "Paquete amazon";
    protected String etiqueta = "Amuleto de la buena suerte";

    public boolean limitarCaracteres(String etiqueta) {
        if (etiqueta.length() <= 30) { // si es menor que 30 caracteres o no
            return true;
        } else {
            return false;
        }
    }
}
