public class CuentaBancaria {

    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String describir(){
        return "Cuenta Bancaria: " + numeroCuenta + ", Titular: " + nombreTitular + ", Saldo: $" + saldo;
    }

    public double calcularComision(){
        return 0.0;
    }

    public void realizarRetiro(double monto){

        setSaldo(getSaldo() - monto);

    }
}
