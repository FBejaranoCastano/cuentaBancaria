//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {

    //!Se crean las instancias de las clases
    CuentaBancaria cuenta1 = new CuentaAhorros("123456789", "", 1000, 0.05, 500);
    CuentaBancaria cuenta2 = new CuentaCorriente("987654321", "", 2000, 0.02, 1000);
    CuentaBancaria cuenta3 = new CuentaInversion("098765432", "", 3000, 0.01, 0.05, 12);

    //!Se imprimen las instancias de las clases
    System.out.println(cuenta1.describir());
    System.out.println(cuenta2.describir());
    System.out.println(cuenta3.describir());
    System.out.println(cuenta1.calcularComision());
    System.out.println(cuenta2.calcularComision());
    System.out.println(cuenta3.calcularComision());
    System.out.println(cuenta1.getSaldo());
    System.out.println(cuenta2.getSaldo());
    System.out.println(cuenta3.getSaldo());
    cuenta1.realizarRetiro(1000);
    System.out.println(cuenta1.getSaldo());
    cuenta2.realizarRetiro(2000);
    System.out.println(cuenta2.getSaldo());
    cuenta3.realizarRetiro(3000);
    System.out.println(cuenta3.getSaldo());

    /*
     * ¿Por qué fue necesario usar CuentaBancaria como tipo de variable?
     *
     * Use CuentaBancaria porque es la clase padre de todas. Al declararlas así aplico
     * el polimorfismo: en lugar de tratar cada cuenta por separado, uso una sola "etiqueta"
     * general para poder manejar las diferentes cuentas (Ahorros, Corriente e Inversión)
     * como si fueran del mismo tipo.
     *
     * ¿Qué ventaja concreta me dio?
     *
     * La ventaja principal es la practicidad:
     * 1. Puedo meter todas las cuentas dentro de una misma lista o arreglo y recorrerlas
     *    con un solo ciclo (for) sin complicarme.
     * 2. Java es lo suficientemente inteligente para saber qué método ejecutar según el
     *    objeto real. Por ejemplo, al llamar a realizarRetiro(), ejecuta la regla específica
     *    de esa cuenta sin que yo tenga que escribir un montón de "if" para adivinar cuál es cuál.
     */

  }
