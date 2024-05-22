package pruebadaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Multa {

    static Scanner sc = new Scanner(System.in);

    private String codigoMulta;
    private static Integer contadorMulta = 100;
    private double importeMulta;
    private static Map<String, Set<Multa>> mapaMultas = new TreeMap<>();

    public Multa(double importeMulta) {
        this.codigoMulta = "M-" + contadorMulta;

        while (importeMulta < 0) {
            System.out.print("Error. Introduce un importe positivo: ");
            importeMulta = sc.nextDouble();
        }

        this.importeMulta = importeMulta;
        contadorMulta++;
    }

    public String getCodigoMulta() {
        return codigoMulta;
    }

    public void setCodigoMulta(String codigoMulta) {
        this.codigoMulta = codigoMulta;
    }

    public double getImporteMulta() {
        return importeMulta;
    }

    public void setImporteMulta(double importeMulta) {
        this.importeMulta = importeMulta;
    }

    public static Map<String, Set<Multa>> getMapaMultas() {
        return mapaMultas;
    }

    @Override
    public boolean equals(Object obj) {
        Multa m = (Multa) obj;

        return this.codigoMulta.equals(m.codigoMulta);
    }

    public static boolean introducirMulta(String codigo, Multa m) {
        boolean introducido;

        if (!mapaMultas.containsKey(codigo)) {
            mapaMultas.put(codigo, new HashSet<>());
            introducido = mapaMultas.get(codigo).add(m);
        } else {
            introducido = mapaMultas.get(codigo).add(m);
        }

        return introducido;
    }

    public static boolean eliminarTodaMultas(String codigo) {
        return mapaMultas.remove(codigo) != null;
    }

    public static Integer numeroMultasTotal() {
        Integer totalMulta = 0;

        Collection<Set<Multa>> coMulta = mapaMultas.values();

        totalMulta += coMulta.size();
        return totalMulta;

    }

    public static Set<String> policiasConMulta() {
        Set< String> conjuntoMultasPolicia = mapaMultas.keySet();

        Set<String> cMP = new TreeSet<>(conjuntoMultasPolicia);
        return cMP;
    }

    public static Iterator<Multa> multasPolicia(String codigoPolicia) {
        if (!mapaMultas.containsKey(codigoPolicia)) {
            return null;
        } else {
            Set<Multa> setRecorrer = mapaMultas.get(codigoPolicia);
            Iterator<Multa> it = setRecorrer.iterator();

            return it;

        }
    }

    @Override
    public String toString() {
        return "Multa{ codigoMulta-> " + codigoMulta + ", importeMulta-> " + importeMulta + '}';
    }
}
