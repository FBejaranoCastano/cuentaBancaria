public class CuentaCorriente extends CuentaBancaria {

    private double comisionPorTransaccion;
    private double limiteSobreGiro;

    public CuentaCorriente(String numeroCuenta, String nombreTitular, double saldo, double comisionPorTransaccion,
                           double limiteSobreGiro) {
        super(numeroCuenta, nombreTitular, saldo);
        this.comisionPorTransaccion = comisionPorTransaccion;
        this.limiteSobreGiro = limiteSobreGiro;
    }

    @Override
    public double calcularComision() {
        return comisionPorTransaccion;
    }

    @Override
    public String describir() {

        return super.describir() + " | comiión por trnsaccion: $" + comisionPorTransaccion;

    }

    public void realizarRetiro(double monto){
        double saldoResultante = getSaldo() - monto - comisionPorTransaccion;

        if(saldoResultante < -limiteSobreGiro){
            System.out.println("El retiro no es posible. Excede el límite de sobregiro.");

        }else{
            setSaldo(saldoResultante);
        }
    }
}
