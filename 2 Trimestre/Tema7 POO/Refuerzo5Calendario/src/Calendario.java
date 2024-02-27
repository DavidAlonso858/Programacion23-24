public class Calendario {
    public int año;
    public int mes;
    public int dia;

    public Calendario(int año, int mes, int dia) {
        if (esFechaValida(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("Fecha no válida.");
        }
    }

    public void incrementarDia() {
        if (dia < diasEnMes(mes)) {
            dia++;
        } else {
            dia = 1;
            incrementarMes();
        }
    }

    public void incrementarMes() {
        if (mes < 12) {
            mes++;
        } else {
            mes = 1;
            incrementarAño(1);
        }
    }

    public void incrementarAño(int cantidad) {
        año += cantidad;
    }

    public boolean iguales(Calendario otraFecha) {
        return this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }

    private boolean esFechaValida(int año, int mes, int dia) {
        return año >= 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasEnMes(mes); // devuelve true si coincide
    }

    public int diasEnMes(int mes) {
        switch (mes) {
            case 2:
                return 28;
            case 4, 6, 9, 11:
                return 30;
            default:
                return 31;
        }
    }

    public void mostrar() {
        System.out.println(año + "/" + mes + "/" + dia);
    }
}
