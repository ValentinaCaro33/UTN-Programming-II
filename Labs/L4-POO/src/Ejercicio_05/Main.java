package Ejercicio_05;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Marta Sanchez", 50000.00);
        Cuenta cuenta2 = new Cuenta("Lionel Messi");
        Cuenta cuentaInvalida = new Cuenta("Estafador", -15000.00); // Prueba defensiva

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuentaInvalida.toString());

        cuenta2.depositar(25000.00);
        cuenta2.depositar(-500.00);

        cuenta1.extraer(10000.00);
        cuenta1.extraer(80000.00);

        double cotizacionHoy = 1400.00;
        System.out.println("Saldo de " + cuenta1.getTitular() + " en ARS: $" + cuenta1.consultarSaldo());
        System.out.println("Saldo de " + cuenta1.getTitular() + " en USD (Cotización " + cotizacionHoy + "): u$s " + cuenta1.consultarSaldo(cotizacionHoy));

        System.out.println(Cuenta.mostrarTotalCuentas());
    }
}
