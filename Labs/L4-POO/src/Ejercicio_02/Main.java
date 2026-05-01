package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Dracula", "Bram Stoker", "Valdemar");
        Libro libro2 = new Libro("Frankenstein", "Mary Shelly");

        libro1.actualizarTitulo("");
        libro1.actualizarTitulo(null);

        libro2.actualizarTitulo("the", "Shinning");

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        libro2.cambiarEditorial("Alma");
        System.out.println(libro2.toString());

    }
}
