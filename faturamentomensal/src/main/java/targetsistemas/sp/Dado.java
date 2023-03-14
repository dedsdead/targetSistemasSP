package targetsistemas.sp;

public class Dado {
    private int dia;
    private double valor;

    public Dado(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dado [dia=" + dia + ", valor=" + valor + "]";
    }

}
