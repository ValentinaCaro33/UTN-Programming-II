public class Curso {
    private final int id;
    private String nombre;
    private int duracionHoras;
    private double precio;
    private static int totalCursos = 0;

    // Mensajes de error
    private static final String ERROR_VACIO = "ERROR: El parametro no puede estar vacío ni ser nulo.";
    private static final String ERROR_CERO = "ERROR: El parametro debe ser mayor a 0 horas.";
    private static final String ERROR_NEGATIVO = "ERROR: El parametro no puede ser un valor negativo.";

    // GETTERS
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getDuracionHoras() { return duracionHoras; }
    public double getPrecio() { return precio; }

    // SETTERS
    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()) {
            System.out.println(ERROR_VACIO);
        } else {
            this.nombre = nombre;
        }
    }

    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras <= 0){
            System.out.println(ERROR_CERO);
        } else {
            this.duracionHoras = duracionHoras;
        }
    }

    public void setPrecio(double precio) {
        if (precio < 0.0){
            System.out.println(ERROR_NEGATIVO);
        } else {
            this.precio = precio;
        }
    }

    // CONSTRUCTORES

    public Curso(String nombre, int duracionHoras, double precio){
        boolean esValido = true;

        // validar el nombre
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println(ERROR_VACIO);
            esValido = false;
        } else {
            this.nombre = nombre;
        }

        // validar las horas
        if (duracionHoras <= 0) {
            System.out.println(ERROR_CERO);
            esValido = false;
        } else {
            this.duracionHoras = duracionHoras;
        }

        // validar el precio
        if (precio < 0.0) {
            System.out.println(ERROR_NEGATIVO);
            esValido = false;
        } else {
            this.precio = precio;
        }

        // Lógica para que el ID se asigne automáticamente sin repetirse
        if (esValido) {
            totalCursos++;
            this.id = totalCursos;
        } else {
            System.out.println("ERROR AL CREAR: Datos invalidos. El curso no fue registrado.\n");
            this.id = 0;
        }
    }

    public Curso(String nombre, int duracionHoras){
        this(nombre, duracionHoras, 100.0);
    }

    // METODOS

    public void actualizarPrecio(double porcentaje){
        if (porcentaje < 0.0){
            System.out.println(ERROR_NEGATIVO);
        } else {
            double aumento = (this.precio * porcentaje) / 100;
            System.out.println("Al curso de " + nombre + " se le aumentó un total de: $" + aumento);
            this.precio = this.precio + aumento;
        }
    }

    public void actualizarPrecio(int monto){
        if (monto < 0){
            System.out.println(ERROR_NEGATIVO);
        } else {
            this.precio = this.precio + monto;
        }
    }

    public static int mostrarTotalCursos(){
        return totalCursos;
    }

    @Override
    public String toString() {
        if (this.id == 0) {
            return "Curso Invalido (No registrado)";
        }
        return "Id: " + id + " | Nombre: " + nombre + " | Duracion: " + duracionHoras + " horas | Precio: $" + precio;
    }

}
