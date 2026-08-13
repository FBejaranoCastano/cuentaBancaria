public class CuentaAhorros extends CuentaBancaria {

    private double tasaInteresMensual;
    private double saldoMinimo;

    public CuentaAhorros(String numeroCuenta, String nombreTitular, double saldo, double tasaInteresMensual, double saldoMinimo) {
        super(numeroCuenta, nombreTitular, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String describir() {
        return super.describir() + " | Tasa mensual: " + tasaInteresMensual + "%";
    }

    @Override
    public double calcularComision() {
        double comision = (getSaldo() >= saldoMinimo) ? 0.0 : 12000.0;
        return comision;

    }

    public void realizarRetiro(double monto, boolean esUrgente) {
        double saldoResultante = getSaldo() - monto;

        if (saldoResultante < saldoMinimo && esUrgente) {
            setSaldo(saldoResultante - 12000.0);
        } else {
            realizarRetiro(monto);

        }
    }

    public double calcularInteresMes(){
        return getSaldo() * tasaInteresMensual / 100;
    }
}
