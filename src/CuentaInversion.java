public class CuentaInversion extends CuentaBancaria {

    private double tasaAnual;
    private int plazoMeses;
    private double penalizacionRetiroAnticipado;

    public CuentaInversion(String numeroCuenta, String nombreTitular, double saldo, double tasaAnual, double penalizacionRetiroAnticipado, int plazoMeses) {
        super(numeroCuenta, nombreTitular, saldo);
        this.tasaAnual = tasaAnual;
        this.penalizacionRetiroAnticipado = penalizacionRetiroAnticipado;
        this.plazoMeses = plazoMeses;
    }

    @Override
    public String describir() {
        return super.describir() + " | Plazo: " + plazoMeses + " meses | Tasa anual: $" + tasaAnual + "%";
    }

    @Override
    public double calcularComision() {
        return penalizacionRetiroAnticipado;
    }

    public double calcularComision(int mesesTranscurridos){

        return (mesesTranscurridos >= plazoMeses) ? 0.0 : penalizacionRetiroAnticipado;
    }

    @Override
    public void realizarRetiro(double monto) {

        setSaldo(getSaldo() - monto - penalizacionRetiroAnticipado);

    }
}
