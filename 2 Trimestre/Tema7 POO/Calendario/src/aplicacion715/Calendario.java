package aplicacion715;

public class Calendario {

    private int ano;
    private int mes;
    private int dia;

    public Calendario(int ano, int mes, int dia) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    private void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
    }

    private void setMes(int mes) {
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        }
    }

    private boolean esBisiesto(int ano) {
        boolean bisiesto = false;
        if (ano % 4 == 0) {
            bisiesto = true;
        }

        return bisiesto;
    }

    private int diasMes(int mes, int ano) {
        int dias;

        if (mes % 2 != 0) {
            dias = 31;
        } else {
            if (mes == 2) {
                if (esBisiesto(ano)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
            } else {
                dias = 30;
            }

        }

        return dias;
    }

    private void setDia(int dia) {
        if (dia > 0 && dia <= diasMes(this.mes, this.ano)) {
            this.dia = dia;
        }
    }

    public String mostrar() {
        return "Fecha: " + dia + "/" + mes + "/" + ano;
    }

    public void incrementarDia() {
        this.dia++;
        if (this.dia > diasMes(this.mes, this.ano)) {
            setDia(1);
            incrementarMes();
        }
    }

    public void incrementarMes() {
        this.mes++;
        if (this.mes > 12) {
            setMes(1);
            incrementarAno(1);
        }

        if (diasMes(this.mes, this.ano) < this.dia) {
            this.dia = diasMes(this.mes, this.ano);
        }
    }

    public void incrementarAno(int cant) {
        setAno(ano + cant);
    }

    public boolean iguales(Calendario otraFecha) {
        if (this == otraFecha) {
            return true;
        }
        if (otraFecha == null) {
            return false;
        }
        if (getClass() != otraFecha.getClass()) {
            return false;
        }
        final Calendario other = (Calendario) otraFecha;
        if (this.ano != other.ano) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        return this.dia == other.dia;
    }
}
