package Ejercicio_01;

public class Empleado {
    private final int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    // GETTERS

    public String getNombre() { return nombre; }

    public String getPuesto() { return puesto; }

    public double getSalario() { return salario; }

    // SETTERS

    public void setSalario (double salario){
        if(salario < 0){
            System.out.println("Error: el salario no puede ser un numero negativo.");
        } else {
            this.salario = salario;
        }
    }

    public void setNombre(String nombre){
        if (nombre == null || nombre.isEmpty()){
            System.out.println("Error: el nombre no puede estar vacio.");
        } else {
            this.nombre = nombre;
        }
    }

    // CONSTRUCTORES

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        setSalario(salario);
        totalEmpleados ++;
    }

    public Empleado(String nombre, String puesto){
        this(totalEmpleados + 1, nombre, puesto, 0.0);
    }

    // METODOS

    public void actualizarSalario(double porcentaje){
        if (porcentaje < 0){
            System.out.println("Error: el porcentaje no puede ser negativo.");
        } else {
            salario = ( (salario * porcentaje) / 100 ) + salario;
        }
    }

    public void actualizarSalario(int aumento){
        if (aumento < 0){
            System.out.println("Error: el aumento no puede ser negativo.");
        } else {
            salario = salario + aumento;
        }
    }

    @Override
    public String toString(){
        return "Id: " + id + " | Nombre: " + nombre + " | Puesto: " + puesto + " | Salario: " + salario;
    }

    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

}
