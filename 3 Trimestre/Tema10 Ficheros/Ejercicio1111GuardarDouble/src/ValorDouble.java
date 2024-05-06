import java.io.Serializable;

public class ValorDouble implements Serializable {
    private double valorDouble;

    public ValorDouble(double v) {
        this.valorDouble = v;
    }

    public double getValorDouble() {
        return valorDouble;
    }

    public void setValorDouble(double valorDouble) {
        this.valorDouble = valorDouble;
    }

}
