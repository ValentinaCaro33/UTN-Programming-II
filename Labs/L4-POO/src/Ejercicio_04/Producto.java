package Ejercicio_04;

public class Producto {
    private String nombre;
    private double precioBase;
    private static double IVA = 0.21;

    // GETTERS

    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase;  }
    public static double getIVA() { return IVA; }

    // SETTERS

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("ERROR: el nombre no puede estar vacio.");
        } else {  this.nombre = nombre;  }
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase < 0){
            System.out.println("ERROR: el precio no puede ser negativo.");
        }else {  this.precioBase = precioBase;  }
    }

    // CONSTRUCTORES

    public Producto(String nombre, double precioBase){
        setNombre(nombre);
        setPrecioBase(precioBase);
    }

    public Producto(String nombre){
        this(nombre, 100.00);
    }

    // METODOS

    public void aplicarDescuento(double porcentaje){
        double descuento = (precioBase * porcentaje) / 100;
        setPrecioBase(precioBase - descuento);
    }

    public void aplicarDescuento(double porcentaje, double minimo) {
        double descuento = (precioBase * porcentaje) / 100;
        double precioConDescuento = precioBase - descuento;

        if (precioConDescuento < minimo) {
            setPrecioBase(minimo);
        } else {
            setPrecioBase(precioConDescuento);
        }
    }

    public double calcularPrecioFinal(){
        double impuesto = precioBase * IVA;
        double precioFinal = precioBase + impuesto;
        return precioFinal;
    }

    public static void cambiarIVA(double nuevo){
        IVA = nuevo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "| Precio Base: " + precioBase + " | Precio Final: " + calcularPrecioFinal();
    }
}
