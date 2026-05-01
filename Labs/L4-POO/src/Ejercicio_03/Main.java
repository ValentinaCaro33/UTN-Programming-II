package Ejercicio_03;

public class Main {
    public static void main(String[] args) {
        Alumno alumnoA = new Alumno("Juan", -5.00);
        Alumno alumnoB = new Alumno("Pedro");

        System.out.println(alumnoA.toString());
        System.out.println(alumnoB.toString());

        alumnoA.actualizarPromedio(11.50);

        double[] notasB = {6.00, 7.00, 5.00, 6.00};
        alumnoB.actualizarPromedio(notasB);

        System.out.println(alumnoA.toString());
        System.out.println(alumnoB.toString());

        Alumno.cambiarNotaAprobacion(8.00);

        System.out.println(alumnoA.toString());
        System.out.println(alumnoB.toString());
    }

}
