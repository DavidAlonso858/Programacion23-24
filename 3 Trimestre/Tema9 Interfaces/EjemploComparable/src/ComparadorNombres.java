import java.util.Comparator;

public class ComparadorNombres implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Socio s1 = (Socio) o1;
        Socio s2 = (Socio) o2;
        return s1.nombre.compareTo(s2.nombre);
    }

}
