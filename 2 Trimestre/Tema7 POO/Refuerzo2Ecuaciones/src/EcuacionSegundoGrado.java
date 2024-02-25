public class EcuacionSegundoGrado {
    double a;
    double b;
    double c;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean discriminantePositivo() {
        boolean discriminantePositivo = false;

        if (Math.pow(b, 2) - (4 * a * c) > 0) {
            discriminantePositivo = true;
        }
        return discriminantePositivo;
    }

    public double solucionPositiva() {
        double negativaB = b * -1;
        double raiz = Math.pow(b, 2) - (4 * a * c);
        double resultado;
        resultado = (negativaB + Math.sqrt(raiz)) / (2 * a);

        return resultado;
    }

    public double solucionNegativo() {
        double negativaB = b * -1;
        double raiz = Math.pow(b, 2) - (4 * a * c);
        double resultado;
        resultado = (negativaB - Math.sqrt(raiz)) / (2 * a);

        return resultado;
    }
}
