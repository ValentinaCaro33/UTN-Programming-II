package Ejercicio_03;

public class Alumno {
    private String nombre;
    private double promedio;
    private static double notaAprobacion = 6.00;

    // GETTERS

    public String getNombre() { return nombre; }
    public double getPromedio() { return promedio;  }
    public static double getNotaAprobacion() { return notaAprobacion;  }

    // SETTERS

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("ERROR: el nombre no puede estar vacio.");
        } else {  this.nombre = nombre;  }
    }

    public void setPromedio(double promedio) {
        if (promedio < 0){
            this.promedio = 0;
        } else if (promedio > 10){
            this.promedio = 10;
        }else {  this.promedio = promedio;  }
    }

    //CONSTRUCTORES

    public Alumno(String nombre, double promedio) {
        setNombre(nombre);
        setPromedio(promedio);
    }

    public Alumno(String nombre){
        this(nombre, 0.00);
    }

    // METODOS

    public void actualizarPromedio(double nuevo){
        setPromedio(nuevo);
    }

    public void actualizarPromedio(double notas[]) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        double promedioCalculado = suma / notas.length;
        setPromedio(promedioCalculado);
    }

    public boolean aprobo(){
        if (promedio >= notaAprobacion){
            return true;
        } else {
            return false;
        }
    }

    public static void cambiarNotaAprobacion(double nueva){
        notaAprobacion = nueva;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " | Promedio: " + promedio + " | Aprueba: " + aprobo();
    }

}