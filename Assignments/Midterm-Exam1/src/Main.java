public class Main {
    public static void main(String[] args) {

        System.out.println("--- Creacion de cursos validos ---");

        Curso cursoA = new Curso("Programacion", 80, 1500.0);
        System.out.println(cursoA.toString());

        Curso cursoB = new Curso("Base de Datos", 55);
        System.out.println(cursoB.toString());

        Curso cursoC = new Curso("Probabilidad y Estadistica", 60, 1650.0);
        System.out.println(cursoC.toString());

        System.out.println("\n --- Pruebas de robustez con datos invalidos ---");

        // Prueba A = precio negativo
        Curso cursoInvalidoA= new Curso("Ceramica", 90, -1000.0);

        // Prueba B = nombre vacio
        Curso cursoInvalidoB= new Curso(" ", 85);

        // Prueba C = horas <= 0
        Curso cursoInvalidoC= new Curso("Pasteleria", 0, 1500.0);

        // Prueba D = horas <= 0
        Curso cursoInvalidoD= new Curso(" ", 0, -1000.0);


        System.out.println("\n --- Actualizar precios ---");

        cursoA.actualizarPrecio(15.0); // metodo con porcentaje
        System.out.println(cursoA.toString());

        cursoB.actualizarPrecio(1300); // metodo con monto fijo
        System.out.println(cursoB.toString());

        cursoC.actualizarPrecio(10.0); // metodo con porcentaje
        System.out.println(cursoC.toString());

        System.out.println("\n --- Estadisticas ---");

        System.out.println("Total de cursos creados exitosamente: " + Curso.mostrarTotalCursos());

    }
}
