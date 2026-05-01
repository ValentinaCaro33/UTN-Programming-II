package Ejercicio_05;

public class Cuenta {
    private final int numero;
    private String titular;
    private double saldo;
    private static int ultimoNumero = 100;
    private static int totalCuentas = 0;

    // GETTERS

    public int getNumero() { return numero; }
    public String getTitular() { return titular; }

    // SETTERS

    public void setTitular(String titular) {
        if(titular == null || titular.isEmpty()){
            System.out.println("ERROR: El titular no puede estar vacío.");
        } else {
            this.titular = titular;
        }
    }

    // CONSTRUCTORES

    public Cuenta(String titular, double saldoInicial) {
        setTitular(titular);
        if (saldoInicial < 0) {
            System.out.println("ERROR: El saldo inicial no puede ser negativo. Se asignará $0.");
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }

        this.numero = ++ultimoNumero;
        totalCuentas++;
    }

    public Cuenta(String titular) {
        this(titular, 0.0);
    }

    // MÉTODOS
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("ERROR: El monto a depositar debe ser mayor a cero. Operación cancelada.");
        } else {
            this.saldo = this.saldo + monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + this.saldo);
        }
    }

    public void extraer(double monto) {
        if (monto <= 0) {
            System.out.println("ERROR: El monto a extraer debe ser mayor a cero. Operación cancelada.");
        } else if (monto > this.saldo) {
            System.out.println("ERROR: Fondos insuficientes. No se puede extraer $" + monto + " (Saldo disponible: $" + this.saldo + ").");
        } else {
            this.saldo = this.saldo - monto;
            System.out.println("Extracción exitosa. Nuevo saldo: $" + this.saldo);
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public double consultarSaldo(double cotizacionDolar) {
        if (cotizacionDolar <= 0) {
            System.out.println("ERROR: La cotización del dólar debe ser mayor a 0.");
            return 0;
        }
        return this.saldo / cotizacionDolar;
    }

    public static int mostrarTotalCuentas() {
        return totalCuentas;
    }

    @Override
    public String toString() {
        return "Cuenta N°: " + numero + " | Titular: " + titular + " | Saldo: $" + String.format("%.2f", saldo);
    }
}
