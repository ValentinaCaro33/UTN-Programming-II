package Ejercicio_01;

public class Main {
    public static void main(String[] args) {
        Empleado empleadoA = new Empleado(1, "Juan", "Cajero", 700.00);
        Empleado empleadoB = new Empleado("Matias", "Repositor");
                Empleado empleadoC = new Empleado(3, "Pedro", "Barrendero", -500);

        empleadoA.actualizarSalario(-15.00);
        empleadoA.actualizarSalario(10.00);

        empleadoB.actualizarSalario(-350);
        empleadoB.actualizarSalario(100);

        System.out.println(empleadoA.toString());
        System.out.println(empleadoB.toString());
        System.out.println(empleadoC.toString());

        System.out.println(Empleado.mostrarTotalEmpleados());

    }
}
